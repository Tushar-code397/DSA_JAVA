import java.util.*;

public class dsa {
    public static int mindiff(int[] arr, int n, int m) {
        if (n == 0 || m == 0) {
            return -1;
        }
        if (m > n) {
            return -1;
        }
        Arrays.sort(arr);
        int min_diff = Integer.MAX_VALUE;

        for (int i = 0; i + m - 1 < n; i++) {
            int diff = arr[i + m - 1] - arr[i];
            if (diff < min_diff)
                min_diff = diff;
        }
        return min_diff;

    }

    public static void main(String[] args) {
        int arr[] = { 12, 4, 7, 9, 2, 23, 25, 41, 30,
                40, 28, 42, 30, 44, 48, 43, 50 };

        int m = 7; // Number of students

        int n = arr.length;
        System.out.println("Minimum difference is "
                + mindiff(arr, n, m));
    }
}