public class diagonalsum {

    public static void diagonal(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j) {

                    sum += arr[i][j];
                }
                if ((i == 0) && (j == arr[0].length - 1)) {
                    int k = i;
                    int l = j;
                    while ((k <= arr.length - 1) && (l >= 0)) {
                        sum = sum + arr[k][l];
                        k++;
                        l--;
                    }

                }
            }
        }
        System.out.println("sum=" + sum);
    }

    public static void diagonal2(int arr[][]) {
        int sum = 0; // tc-o(n2)
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j) {

                    sum += arr[i][j];
                }
                if ((i + j == arr.length - 1)) {
                    sum += arr[i][j];

                }
            }
        }
        System.out.println("sum=" + sum);
    }

    public static void diagonal3(int arr[][]) {
        int sum = 0; // tc-o(n)
        for (int i = 0; i < arr.length; i++) {

            sum += arr[i][i];
            sum += arr[i][arr.length - 1 - i];

        }
        System.out.println("sum=" + sum);

    }

    public static void main(String args[]) {
        int mat[][] = { { 1, 0, 0, 0 },
                { 1, 4, 1, 0 },
                { 2, 9, 5, 7 },
                { 1, 6, 3, 0 } };

        diagonal3(mat);
    }

}
