import java.util.*;

public class palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ld = 0;
        int rev = 0;
        int or = n;
        while (n > 0) {
            ld = n % 10;
            rev = rev * 10 + ld;
            n /= 10;
        }
        System.out.println(rev);
        if (or == rev) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
