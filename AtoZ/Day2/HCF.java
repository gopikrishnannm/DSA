package Day2;

public class HCF {
    public static void main(String[] args) {
        euclideanAlgorithm3(12, 9);
    }
    static void hcf(int n1, int n2){
        int lowest = n1 <= n2 ? n1 : n2;
        int hcf=1;
        for (int i = 1; i < lowest ; i++) {
            if (n1 % i == 0 && n2 % i == 0){
                hcf = i;
            }
        }
        System.out.println(hcf);
    }
    //Time Complexity: O(min(N1, N2))
    /*
    If we iterate from the minimum of N1 and N2 down to 1, we reduce the number of iterations
    because we start from the potentially largest common factor and work downwards.
     */
    static void hcf2(int n1, int n2){
        int lowest = n1 <= n2 ? n1 : n2;
        int hcf=1;
        for (int i = lowest; i >= 1 ; i--) {
            if (n1 % i == 0 && n2 % i == 0){
                hcf = i;
                break;
            }

        }
        System.out.println(hcf);
    }
    //Time Complexity: O(min(N1, N2))
    static void euclideanAlgorithm(int n1, int n2){
        /*
        Repeatedly subtract the smaller number from the larger number until one of them becomes 0.
        Once one of them becomes 0, the other number is the GCD of the original numbers.
         */
        if (n1 == 0){
            System.out.println(n2);
            return;
        }
        if (n2 == 0){
            System.out.println(n1);
            return;
        }
        int big = Math.max(n1, n2);
        int small = Math.min(n1, n2);
        euclideanAlgorithm(big - small, small);
    }
    static void euclideanAlgorithm2(int n1, int n2){
        while (n1 > 0 && n2 > 0){
            if (n1 > n2){
                n1 = n1 % n2;

            }
            else n2 = n2 % n1;
        }
        if (n1 > 0){
            System.out.println(n1);
        }
        else System.out.println(n2);
    }
    static void euclideanAlgorithm3(int n1, int n2){
        while (n1 > 0 && n2 > 0){
            if (n1 > n2){
                n1 = n1 - n2;

            }
            else n2 = n2 - n1;
        }
        if (n1 > 0){
            System.out.println(n1);
        }
        else System.out.println(n2);
    }
}
