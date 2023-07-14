public class searchmatrix {

    public static void search(int arr[][], int key) { // using right upper cell
        int row = 0;
        int col = arr[0].length - 1;
        while (row < arr.length && col >= 0) {
            if (key == arr[row][col]) {
                System.out.println("key found at " + row + "," + col);
                return;

            }

            else if (key < arr[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("not found");
    }

    public static void search1(int arr[][], int key) { // using left bottom cell
        int row = arr.length - 1;
        int col = 0;
        while (col < arr.length && row >= 0) {
            if (key == arr[row][col]) {
                System.out.println("key found at " + row + "," + col);
                return;

            }

            else if (key < arr[row][col]) {
                row--;
            } else {
                col++;
            }
        }
        System.out.println("not found");
    }

    public static void main(String args[]) {
        int mat[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        int key = 33;

        search(mat, key);
    }

}