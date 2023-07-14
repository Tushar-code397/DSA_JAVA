import java.util.*;

public class starpattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (int line = 1; line <= 4; line++) {
            for (int j = 1; j <= line; j++) {
                System.out.print("#");
            }
            System.out.println();

        }

        System.out.println("inverted star pattern");
        for (int line1 = 1; line1 <= 4; line1++) {
            for (int j1 = 1; j1 <= (4 - line1 + 1); j1++) {
                System.out.print("#");
            }
            System.out.println();

        }

    }
}