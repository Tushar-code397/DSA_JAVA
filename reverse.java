import java.util.Scanner;

public class reverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int lastdigit;
        while (n > 0) {
            lastdigit = n % 10;
            rev = (rev * 10) + lastdigit;
            n = n / 10;

        }
        System.out.println(rev);

    }
}
