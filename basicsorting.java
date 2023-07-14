public class basicsorting {
    public static void bubbblesort(int arr[]) {
        if (arr == null || arr.length == 0) {
            return;
        }
        boolean swap;
        for (int i = 0; i <= arr.length - 2; i++) // loop for no of turns that is n-1

        {
            swap = false;
            for (int j = 0; j <= arr.length - 2 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (swap == false) {
                break;
            }
        }
        System.out.println("sorted array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    public static void selectionsort(int arr[]) {
        int min;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min])

                {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
        System.out.println("sorted array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    public static void insertionsort(int arr[]) {
        int n = arr.length;
        for (int j = 1; j < n; j++) {
            int key = arr[j];
            int i = j - 1;
            while ((i > -1) && (arr[i] > key)) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = key;
        }
        System.out.println("sorted array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    public static void countsort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {

            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        System.out.println("sorted array");
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + ",");
        }

    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 2, 4, 5, 4, 1, 2, 3, 5 };
        // bubbblesort(arr);
        // selectionsort(arr);
        // countsort(arr);
        insertionsort(arr);
    }

}
