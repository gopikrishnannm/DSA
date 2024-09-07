package Day1;

public class AllPatterns {
    public static void main(String[] args) {
        pattern22(3);
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
    static void pattern10(int n){

        /*

         1*
         2**
         3***
         4****
         5*****
         6******       till here print i times *
         7*****        from here 2n-i
         8****
         9***
         10**
         11*              row 2n -1


         */
        int stars;
        for (int i = 0; i <= (2*n)-1; i++) {
            stars = i < n ? i : 2*n - i;
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern11(int n){
        /*
        1         1
        01        2
        101       3
        0101      4
        10101     5
        */
        for (int i = 1; i <= n; i++) {
            int someNumber = i;
            for (int j = 1; j <= i ; j++) {
                System.out.print(someNumber%2);
                someNumber++;
            }
            System.out.println();
        }
    }
    static void patter11alternatinve(int n){
        /*1         for even row starts with 1 else 0
         01
         101
         0101
         10101
         */
        int start;
        for (int i = 0; i < n; i++) {
            start = i%2==0 ? 1:0;
            for (int j = 0; j <= i ; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }
    static void pattern12(int n ){
        /*
        1    1   [1,4,1]     if n=4 , [1,6,1] if n=2 [1,2,1]
        12  21   [2,2,2]
        123321   [3,0,3]
         */
        int space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j); // kind of left angle triangle
            }
            for (int j = 0; j <= space; j++) {
                System.out.print(" ");
                space -= 2;
            }
            for (int j = i; j >=1 ; j--) {
                System.out.print(j);
            }
            System.out.println();


        }
    }
    static void patternTriangle(int n){
        /*
                   *   [4s, 1 star ]
                 * *   [3sp, 2star]
               * * *   [2sp, 3st]
             * * * *   [1sp, 4st]
           * * * * *    [0sp, 5st]

         */

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern13(int n){
        /*
        1
        2 3
        4 5 6
        */
        int count=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
    static void pattern14(int n){
        /*
            A
            A B
            A B C

         */
        for (int i = 0; i < n; i++) {
//            char ch = 'A';
//            for (int j = 0; j <= i; j++) {
//                System.out.print(ch);
//                ch++;
//            }
            for (char ch= 'A'; ch <= 'A' + i; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    static void pattern15(int n){
        /*
        A B C
        A B
        A
         */
        for (int i = 0; i < n; i++) {

            for (char ch = 'A'; ch < 'A' + n - i  ; ch++) {

                System.out.print(ch);
            }
            System.out.println();
        }
    }
    static void pattern16(int n){
        /*
        A
        B B
        C C C
         */
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for(int j=0;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    static void pattern17(int n){
        /*
          A  [2,1]
         ABA [1,3]
        ABCBA [0,5]
         */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int breakpoint = i;
            for (int j = 1; j <= 2*i+1; j++) {
                System.out.print(ch);
                if (j<=breakpoint) ch++;
                else ch--;
            }
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern18(int n){
        /*
        C
        B C
        A B C
         */
        for (int i = 1; i <= n; i++) {
            char ch =(char) ('A' + n -i) ;
            for (int j = 0; j < i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    static void pattern19(int n){
        /*
         n = 3
         ******    [3,0,3]
         **  **    [2,2,2]
         *    *    [1,4,1]
         *    *    [1,4,1]
         **  **    [2,2,2]
         ******    [3,0,3]
         */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2*n - 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
    static void pattern20(int n){
        /*
           n=3
            1 *    * [1,4,1]
            2 **  ** [2,2,2]
            3 ****** [3,0,3]
            4 **  ** [2,2,2]
            5 *    * [1,4,1]

         */
        int star=0;
        for (int i = 1; i <= 2 * n ; i++) {
            if (i > n){
                star--;
            }
            else {
                star = i;
            }
            for (int j = 0; j < star ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2*n - 2*star; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < star ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern21(int n){
        /*

            0 * * *
            1 *   *
            2 * * *
              0 1 2
         */

        for(int i=0;i<n;i++){

            // inner loop for printing the stars at borders only.
            for(int j=0;j<n;j++){

                if(i==0 || j==0 || i==n-1 || j==n-1)
                    System.out.print("*");

                    // if not border index, print space.
                else System.out.print(" ");
            }

            // As soon as the stars for each iteration are printed, we move to the
            // next row and give a line break otherwise all stars
            // would get printed in 1 line.
            System.out.println();
        }

    }
    static void pattern22(int n){
        /*
        3 3 3 3 3                               0 0 0 0 0
        3 2 2 2 3    transformed to 3 - value   0 1 1 1 0
        3 2 1 2 3                               0 1 2 1 0
        3 2 2 2 3                               0 1 1 1 0
        3 3 3 3 3                               0 0 0 0 0
         */
        for (int i = 0; i < 2*n -1; i++) {
            for (int j = 0; j < 2*n -1; j++) {
                int top = i;
                int left = j;
                int right = 2 * n - 2 - j;
                int down = 2 * n -2 - i;
                System.out.print(Math.min(Math.min(top, left), Math.min(right,down)));
            }
            System.out.println();
        }
    }
}
