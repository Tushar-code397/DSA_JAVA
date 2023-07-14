
import java.util.Scanner;

public class pm {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int arr[] = { 3, 4, 6, 7, 8, 9, 4 };
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                int sum = (i == 0) ? prefix[j] : (prefix[j] - prefix[i - 1]);

                if (sum > max) {
                    max = sum;
                }
            }

        }
        System.out.println("maximum sum=" + max);

    }
}