package Recursion;

//Recursion-Backtracking
public class Recursion1 {
    static void printer(int i,int n){
        if(i>n){
            return;
        }
        printer(i+1,n);
        System.out.println(i); // 3 2 1
    }
    public static void main(String[] args) {
        printer(1,3);
    }
}
