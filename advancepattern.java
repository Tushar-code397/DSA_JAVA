import java.util.Scanner;

public class advancepattern {

    public static void hollowsquare() { // hollowsquare
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 4) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void halfinvertedpyramid() { // half inverted pyramid
        for (int i = 1; i <= 4; i++) // no of rows
        {
            for (int j = 1; j <= (4 - i); j++) // no of spaces
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) // no of stars
            {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void halfinvertedpyramidwithnumbers() {
        // half inverted pyramid with numbers
        for (int i = 1; i <= 5; i++) // no of rows
        {
            int c = 1;
            for (int j = 1; j <= (5 - i + 1); j++) // no of spaces
            {

                System.out.print(c);
                c++;
            }

            System.out.println();
        }
    }

    public static void floyd_triangle() {
        // floyd triangle
        int c = 1;
        for (int i = 1; i <= 5; i++) // no of rows
        {

            for (int j = 1; j <= (i); j++) {

                System.out.print(c + " ");
                c = c + 1;
            }

            System.out.println();
        }
    }

    public static void triangle01() {
        // half inverted pyramid with numbers
        for (int i = 1; i <= 5; i++) // no of rows
        {
            int c = 1;
            for (int j = 1; j <= (i); j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }

            }

            System.out.println();
        }
    }

    public static void butterfly(int n) { // butterfly
        for (int i = 1; i <= n; i++) // no of rows
        { // first half of pattern
            for (int j = 1; j <= i; j++) // no of stars
            {
                System.out.print("*");
            }
            for (int j = 1; j <= (2 * (n - i)); j++) // no of spaces
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) // no of stars
            {
                System.out.print("*");

            }
            System.out.println();
        }

        // second half of pattern (inverted pattern) just flip outer loop everything
        // remain same

        for (int i = n; i >= 1; i--) // no of rows
        { // first half of pattern
            for (int j = 1; j <= i; j++) // no of stars
            {
                System.out.print("*");
            }
            for (int j = 1; j <= (2 * (n - i)); j++) // no of spaces
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) // no of stars
            {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void rohmbus(int n) { // rohmbus
        for (int i = 1; i <= n; i++) // no of rows
        { // first half of pattern

            for (int j = 1; j <= (n - i); j++) // no of spaces
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= n; k++) // no of stars
            {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void hollowrohmbus(int n) { // hollow rohmbus
        for (int i = 1; i <= n; i++) // no of rows
        { // first half of pattern

            for (int j = 1; j <= ((n - i)); j++) // no of spaces
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= 5; k++) // no of stars
            {
                if (i == 1 || i == n || k == 1 || k == n) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void diamond(int n) { // diamond
        for (int i = 1; i <= n; i++) // no of rows
        { // first half of pattern

            for (int j = 1; j <= ((n - i)); j++) // no of spaces
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= ((i * 2) - 1); k++) // no of stars
            {
                System.out.print("*");

            }
            System.out.println();
        }

        // inverted pattern - 2nd half
        for (int i = n; i >= 1; i--) // no of rows
        { // first half of pattern

            for (int j = 1; j <= ((n - i)); j++) // no of spaces
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= ((i * 2) - 1); k++) // no of stars
            {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // hollowsquare();
        // halfinvertedpyramid();
        // halfinvertedpyramidwithnumbers();
        // floyd_triangle();
        // triangle01();
        // butterfly(4);
        // rohmbus(5);
        // hollowrohmbus(5);
        diamond(4);

    }
}
