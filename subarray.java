
import java.util.Scanner;

public class subarray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ts = 0;
        int arr[] = { 3, 4, 6, 7, 8, 9, 4 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(");
                int sum = 0;
                for (int k = i; k <= j; k++) {

                    System.out.print(arr[k]);
                    sum += arr[k];
                }
                System.out.print(")");
                System.out.print("            sum of  sub array=" + sum);
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total no of subarray=" + ts);

    }
}