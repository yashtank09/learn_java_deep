package Basics.Loops;
public class NestedForLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------------------------------------------------\n");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + " ");
            }
            System.out.print("| ");
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------------------------------------------------\n");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j = j + 1) {
                System.out.print(j + i + " ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------------------------------------------------\n");

        int count = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j = j + 1) {
                count++;
                System.out.format("%02d ", count);
                // System.out.print(++count + " ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------------------------------------------------\n");
        System.out.println("Bottom Left Triangle");
        for (int i = 1; i <= 5; i++) { // print form 1 2 3 4 5
            for (int j = 1; j <= i; j++) {
                // System.out.print(i + " ");
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Top Left Triangle");
        for (int i = 1; i <= 5; i++) {
            // for(int j=5; j>=i; j--){ // print from 5 4 3 2 1
            for (int j = 1; j <= 5 - i + 1; j++) { // print from 1 2 3 4 5
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Bottom Right Triangle");
        for (int i = 1; i <= 5; i++) {
            // for(int j=5; j>=i; j--){ // print from 5 4 3 2 1
            // for (int j = i - 1; j >= 1; j--) {
            for (int j = 1; j <= 5; j++) {
                // System.out.print(j + " ");
                if (i + j > 5) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("  ");
                }

            }
            // for (int j = 1; j <= 5 - i + 1; j++) { // print from 1 2 3 4 5
            // System.out.print(j + " ");
            // }
            System.out.println();
        }

        System.out.println();
        System.out.println("Top Right Triangle");
        for (int i = 1; i <= 5; i++) {
            // for(int j=5; j>=i; j--){ // print from 5 4 3 2 1
            for (int j = 1; j <= 5; j++) { // print from 1 2 3 4 5
                if (j >= i) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("  ");
                }
            }
            // for (int j = i; j >= 1; j--) {
            // // System.out.print(j + " ");
            // System.out.print(j + " ");
            // }
            System.out.println();
        }

        System.out.println();
        System.out.println("Triangle");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i + j > 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int j = 1; j <= 5; j++) {
                if (j <= i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i <= j - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int j = 1; j <= 5; j++) {
                if (i + j < 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        System.out.println("-----------------------------------------------------------------------------------\n");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i + 1; j++) {
                System.out.print(" * ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("   ");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            for (int j = 5; j >= i + 1; j--) {
                System.out.print("   ");
            }
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------------------------------------------------\n");

        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                // System.out.print(j + " ");
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                // System.out.print(j + " ");
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 5; i >= 1; i--) {
            for (int j = i - 1; j <= 5; j++) {
                // System.out.print(j + " ");
                System.out.print(" ");
            }
            for (int j = i - 1; j >= 1; j--) {
                // System.out.print(j + " ");
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
