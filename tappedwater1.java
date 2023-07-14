import java.util.Scanner;

public class tappedwater1 {

    public static int tapwater(int height[]) {

        int n = height.length;

        // calculate left most bundary
        int left[] = new int[n];
        left[0] = height[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }

        // calculate right most bundary
        int right[] = new int[n];
        right[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }

        int waterlevel = 0;
        int tappedwater = 0;
        // loop calculating water level by finding minimum from left and right boundary
        // for each bar
        for (int i = 0; i < n; i++) {
            waterlevel = Math.min(right[i], left[i]);
            tappedwater += waterlevel - height[i];

        }
        return tappedwater;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println("total water level=" + (tapwater(height)));
    }
}