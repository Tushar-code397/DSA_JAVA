import java.util.Scanner;

public class arr1 {
    public static void main(String args[]) {
        int arr[] = { 2, 3, 1, 1, 4, 5, 7 };
        int same = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    same = 1;
                }
            }
        }
        if (same == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}
