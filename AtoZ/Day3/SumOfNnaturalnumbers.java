package Day3;

public class SumOfNnaturalnumbers {
    public static void main(String[] args) {
        // using formula n*(n+1)/ 2
        // using for loop
        System.out.println(functionalway(5));
    }
    static void recursionParam(int i, int sum){
        if (i <= 0)  {
            System.out.println(sum);
            return;
        }
        recursionParam(i-1, sum+i);

    }
    static int functionalway(int n){
        if (n<=0) return 0;
        return n+functionalway(n-1);
    }
}
