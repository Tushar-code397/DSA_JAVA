import java.util.Scanner;

public class rotatearray_dsa6 {

    public static int search(int k[], int value) {
        for (int i = 0; i < k.length; i++) {
            if (k[i] == value) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 0, 1, 2, 4, 5, 6, 7 };
        System.out.println("enter pivot point");
        int p = sc.nextInt();
        int arrn[] = new int[arr.length];
        arrn[0] = arr[p - 1];
        int j = 1;
        for (int i = p; i < arr.length; i++) {

            arrn[j] = arr[i];
            j++;
        }
        for (int i = 0; i < p - 1; i++) {

            arrn[j] = arr[i];
            j++;
        }
        System.out.println("rotated array");
        for (int i = 0; i < arrn.length; i++) {
            System.out.print(arrn[i] + ",");
        }
        System.out.println("enter value");
        int value = sc.nextInt();
        int t = search(arrn, value);
        if (t == -1) {
            System.out.println("not found");
        } else {
            System.out.println("found at" + t + 1);
        }

    }

}