package Day1;

public class AllPatterns {
    public static void main(String[] args) {
        pattern9(6);
    }
    static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for (int i = 0; i < n; i++) {
                /*


                    *      [4space,1Star,4space]
                   ***     [3,3,3]
                  *****    [2,4,2]
                 *******   [1,7,1]
                *********  [0,9,0]

                */

            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2*i)+1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
            
        }
    }
    static void pattern8(int n){
        for (int i = 0; i < n; i++) {
            /*

                                          2n-1
             ***********        [0,11,0]  11-0  12
              *********         [1,9,1]   11-1  11
               *******          [2,7,2]    11-2 10
                *****           [3,6,3]
                 ***            [4,3,4]
                  *             [5,1,5]

             */

            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2*n)-(2*i)-1; j++) {
                System.out.print("*");
            }
//            for (int j = i; j > 0; j--) {
//                System.out.print(" ");
//            }
            System.out.println();

        }
    }
    static void pattern9Change(int n){
        for (int i = 1; i < n; i++) {
            /*

                                          2n-1
             ***********        [0,11,0]  11-0  12
              *********         [1,9,1]   11-1  11
               *******          [2,7,2]    11-2 10
                *****           [3,6,3]
                 ***            [4,3,4]
                  *             [5,1,5]

             */

            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2*n)-(2*i)-1; j++) {
                System.out.print("*");
            }
//            for (int j = i; j > 0; j--) {
//                System.out.print(" ");
//            }
            System.out.println();

        }
    }
    static void pattern9(int n){
        pattern7(n);
        pattern9Change(n);

    }
}
