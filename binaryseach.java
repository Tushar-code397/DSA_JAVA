import java.util.Scanner;

public class binaryseach {

    public static int binary(int n, int arr[]) {
        int beg = 0;
        int end = n - 1;
        int mid;
        while (beg <= end) {
            mid = (beg + end) / 2;

            if (n == arr[mid]) {
                return mid;
            } else if (n > mid) {
                beg = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int arr[] = new int[10];
        System.out.println("enter array elements");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        int rem = binary(n, arr);
        if (rem == -1) {
            System.out.println("not found");
        } else {
            System.out.println("found at" + rem);
        }
    }
}