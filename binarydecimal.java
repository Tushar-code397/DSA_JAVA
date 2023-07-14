
import java.util.*;

public class binarydecimal {

    public static void decimal(int n) {
        int pow = 0;
        int dec = 0;
        while (n > 0) {
            int last = n % 10;
            dec = dec + (last * (int) Math.pow(2, pow));
            pow++;
            n /= 10;

        }
        System.out.println("decimal equivalent=" + dec);
    }

    public static void binary(int n) {
        int pow = 0;
        int dec = 0;
        while (n > 0) {
            int last = n % 2;
            dec = dec + (last * (int) Math.pow(10, pow));
            pow++;
            n /= 2;

        }
        System.out.println("binary equivalent=" + dec);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // decimal(n);
        binary(n);

    }
}
