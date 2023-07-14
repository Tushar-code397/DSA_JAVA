import java.util.*;

public class charpattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch = 'A';
        for (int line = 1; line <= 4; line++) {
            for (int j = 1; j <= line; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();

        }
    }
}