import java.util.Scanner;

public class checkprime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a nummber");
        int n = sc.nextInt();
        int div;
        int flag = 0;
        for (div = 2; div < Math.sqrt(n); div++) {
            if (n % div == 0) {
                flag = 1;

            }
        }
        if (flag == 1) {
            System.out.println("not prime");
        } else {
            System.out.println(" prime");
        }

    }
}
