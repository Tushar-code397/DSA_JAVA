import java.util.*;

public class binomial {
    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int a = fact(n);
        int b = fact(r);
        int c = fact(n - r);

        int binomial = a / (b * c);
        System.out.println(binomial);

    }
}
