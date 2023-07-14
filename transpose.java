public class transpose {
    public static void transpose1(int arr[][]) {
        int row = arr.length - 1;
        int col = arr[0].length - 1;
        for (int i = 0; i <= col; i++) {
            for (int j = 0; j <= row; j++) {
                System.out.print(arr[j][i] + ",");
            }
            System.out.println();

        }
    }

    public static void main(String args[]) {
        int mat[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        // int key = 33;

        transpose1(mat);
    }
}
