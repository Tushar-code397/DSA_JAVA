public class quicksort {
    public static void printarr(int arr[]) // array print function
    {
        int i;
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quicksort1(int arr[], int si, int ei) // to divide array
    {
        if (si >= ei) {
            return;
        } else {

            int pidx = partiton(arr, si, ei);
            quicksort1(arr, si, pidx - 1);
            quicksort1(arr, pidx + 1, ei);

        }
    }

    public static int partiton(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap if pivot is greater than value at i th index
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        // once again swap to place pivot at correct place in array from last position
        // swap
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 7, 4, 9, 4, 1, 7, 3, 8, 3, 5 };
        quicksort1(arr, 0, arr.length - 1);
        printarr(arr);
    }
}
