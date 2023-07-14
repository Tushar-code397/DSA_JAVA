
public class rotated_array_saerch {

    public static int search(int arr[], int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + ei / 2;
        if (tar == arr[mid]) {
            return mid;
        }
        if (arr[si] <= arr[mid]) {
            // mid is on line 1
            if (arr[si] <= tar && tar <= arr[mid]) {
                // mid is in left side of line 1
                return search(arr, tar, si, mid - 1);
            } else {
                // mid is on right side of line 1
                return search(arr, tar, mid + 1, ei);
            }
        } else // mid is on line 2
        {
            if (arr[mid] <= tar && tar <= arr[ei]) {
                // right side of line 2
                return search(arr, tar, mid + 1, ei);
            } else // left side of line 2
            {
                return search(arr, tar, si, mid - 1);
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(search(arr, 2, 0, arr.length - 1));
    }

}
