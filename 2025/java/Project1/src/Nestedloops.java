import java.util.Scanner;

public class Nestedloops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int j = 1; j <=5 ; j++) {
            for (int i = 1; i <=j ; i++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        /*
         *
         * *
         * * *
         * * * *
         * * * * *


         */

        System.out.println("\n ~~~~~~ \n");

        for (int j = 1; j <=5 ; j++) {
            for (int i = 1; i <=j ; i++) {
                System.out.print(" " + i);
            }
            System.out.println();
        }
        /*
        ~~~~~~

         1
         1 2
         1 2 3
         1 2 3 4
         1 2 3 4 5
         */

        System.out.println("\n ~~~~~~ \n");

        for (int j = 1; j <=5 ; j++) {
            for (int i = 1; i <=j ; i++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
        /*
         ~~~~~~

         1
         2 2
         3 3 3
         4 4 4 4
         5 5 5 5 5
         */

        System.out.println("\n ~~~~~~ \n");

        for (int j = 1; j <=5 ; j++) {
            for (int i = 1; i <=5 ; i++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        /*
         ~~~~~~

         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         */

        System.out.println("\n ~~~~~~ \n");

        for (int j = 1; j <=5 ; j++) {
            for (int i = 1; i <=5 ; i++) {
                System.out.print(" " + i);
            }
            System.out.println();
        }
        /*
         ~~~~~~

         1 2 3 4 5
         1 2 3 4 5
         1 2 3 4 5
         1 2 3 4 5
         1 2 3 4 5
         */

        System.out.println("\n ~~~~~~ \n");

        for (int j = 1; j <=5 ; j++) {
            for (int i = 1; i <=5 ; i++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
        /*
         ~~~~~~

         1 1 1 1 1
         2 2 2 2 2
         3 3 3 3 3
         4 4 4 4 4
         5 5 5 5 5
         */

        System.out.println("\n ~~~~~~ \n");

        for (int j = 1; j <=5 ; j++) {
            for (int i = 1; i <=j ; i++) {
                System.out.print(" " + (6-j));
            }
            System.out.println();
        }
        /*
         ~~~~~~

         5
         4 4
         3 3 3
         2 2 2 2
         1 1 1 1 1
         */

        System.out.println("\n ~~~~~~ \n");

        for (int j = 1; j <=5 ; j++) {
            for (int i = 1; i <=j ; i++) {
                System.out.print(" " + (j-i+1));
            }
            System.out.println();
        }
        /*
         ~~~~~~

         1
         2 1
         3 2 1
         4 3 2 1
         5 4 3 2 1
         */

        System.out.println("\n ~~~~~~ \n");

        for (int j = 1; j <=5 ; j++) {
            for (int i = 1; i <=j ; i++) {
                System.out.print(" " + i);
            }
            System.out.println();
        }
        for (int j = 4; j >=1 ; j--) {
            for (int i = 1; i <=j ; i++) {
                System.out.print(" " + i);
            }
            System.out.println();
        }
        /*
         1
         1 2
         1 2 3
         1 2 3 4
         1 2 3 4 5
         1 2 3 4
         1 2 3
         1 2
         1
         */
        System.out.println("\n ~~~~~~ \n");


        for (int j = 5; j >=1 ; j--) {
            for (int i = 1; i <=j ; i++) {
                System.out.print(" " + i);
            }
            System.out.println();
        }
        /*
         ~~~~~~
         
         1 2 3 4 5
         1 2 3 4
         1 2 3
         1 2
         1
         */

        System.out.println("\n ~~~~~~ \n");


        for (int j = 5; j >=1 ; j--) {
            for (int i = 1; i <=j ; i++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
        /*
         ~~~~~~

         5 5 5 5 5
         4 4 4 4
         3 3 3
         2 2
         1
         */

    }
}
