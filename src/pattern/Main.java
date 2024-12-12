package pattern;

public class Main {

    public static void main(String[] args) {

        /*
         *  "****"
         *  "****"
         *  "****"
         *  "****"
         *
         * this is the pattern, it has 4 rows and 4 columns.
         *  */
//        for(int i = 0; i< 4; i++){  // loop for rows
//            for(int j = 0; j< 4; j++) {  // loop for columns
//                System.out.print("*");  // print '*' to form the rectangle pattern
//            }
//            System.out.print("\n");
//        }



         /*
         *  "*"
         *  "**"
         *  "***"
         *  "*****"
         *
         * this is the pattern,
          */

//        for (int i = 0; i < 4; i++) {  // loop for rows
//            for(int j = 0; j<= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
        1
        12
        123
        1234
        12345
        *this is the pattern
        */

//        for (int i = 0; i < 5; i++) {  // loop for rows
//            for(int j = 1; j<= i+1; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        /*
        1
        22
        333
        4444
        55555
        *this is the pattern
        */
//        for (int i = 1; i < 6; i++) {  // loop for rows
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i);
//            }
//            System.out.println();
//        }

        /*
        *   *****
        *   ****
        *   ***
        *   **
        *   *
        * this is the pattern
        */
//        for (int i = 5; i >= 1; i--) {  // loop for rows
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
        *       *
        *      ***
        *     *****
        *    *******
        *   *********
        * this is the pattern, here we are printing space,stars,space
        * [4,1,4] //(spaces) (stars) (spaces)
        * [3,3,3]
        * [2,5,2]
        * [1,7,1]
        * [0,9,0]
        */
        /*

        for(int i = 0; i < 5; i++){
            //spaces
            for(int j = 0; j< 5-i-1; j++){
                System.out.print(" ");
            }
            //stars
            for(int k = 0; k< 2*i+1; k++){
                System.out.print("*");
            }
            //spaces
            for(int j = 0; j< 5-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }

        //for inverted pattern

        for(int i = 0; i < 5; i++){
            //spaces
            for(int j = 0; j<i; j++){
                System.out.print(" ");
            }
            //stars
            for(int k = 0; k< 2*5 - (2*i+1); k++){
                System.out.print("*");
            }
            //spaces
            for(int j = 0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        // merge the together to make a new one
        */

    }
}
