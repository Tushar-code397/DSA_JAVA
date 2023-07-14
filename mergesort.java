public class mergesort {
    public static void printarr(int arr[]) // array print function
    {
        int i;
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergesort1(int arr[], int si, int ei) // to divide array
    {
        if (si >= ei) {
            return;
        } else {

            int mid = si + (ei - si) / 2;
            mergesort1(arr, si, mid);
            mergesort1(arr, mid + 1, ei);
            merge(arr, mid, si, ei);
        }
    }

    public static void merge(int arr[], int mid, int si, int ei) {
        int temp[] = new int[(ei - si + 1)];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) // to compare left and right sorted array index with each other
        {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;

            } else {
                temp[k] = arr[j];
                j++;

            }
            k++;
        }
        while (i <= mid)// to add left over element of left array in temp array
        {
            temp[k] = arr[i];

            k++;
            i++;
        }

        while (j <= ei)// to add left over element of right array in temp array
        {
            temp[k++] = arr[j++];
        }
        for (i = si, k = 0; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    // practise question 1
    // merge short for array of strings.

    public static void printarr2(String arr[]) // array print function
    {
        int i;
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static String[] mergesort2(String arr[], int si, int ei) {
        if (si == ei) {
            String[] a = { arr[si] };
            return a;
        }

        int mid = si + (ei - si) / 2;
        String[] arr1 = mergesort2(arr, si, mid);
        String[] arr2 = mergesort2(arr, mid + 1, ei);
        String[] arr3 = merge2(arr1, arr2);
        return arr3;
    }

    public static String[] merge2(String[] arr1, String arr2[]) {
        int m = arr1.length;
        int n = arr2.length;
        String arr3[] = new String[m + n];

        int i = 0; // for arr1
        int j = 0;// for arr2
        int k = 0;// temp array variable

        while (i < m && j < n) {
            if (isstringequal(arr1[i], arr2[j])) {
                arr3[k] = arr1[i];
                i++;
                k++;
            } else {
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i < m) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }

        while (j < n) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        return arr3;
    }

    public static boolean isstringequal(String str1, String str2) {
        if (str1.compareTo(str2) < 0) // this means str2>str1
        {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        // int arr[] = { 2, 7, 4, 9 };
        // mergesort1(arr, 0, arr.length - 1);
        // printarr(arr);

        // practice question 1
        String arr[] = { "apple", "mango", "banana", "guava", "dragon" };
        printarr2(mergesort2(arr, 0, arr.length - 1));
    }
}