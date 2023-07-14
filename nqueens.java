public class nqueens {

    // to print all solution of placing queens

    public static void printarr(char arr[][]) {
        System.out.println("-----cheese board------");
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static boolean issafe(char board[][], int row, int col) {
        // vertical up movement
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diagonal left movement
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diagonal right movement
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;

    }

    public static void nqueen(char board[][], int row) {
        // base case
        if (row == board.length) {
            printarr(board);
            return;
        }

        for (int j = 0; j < board.length; j++) {
            if (issafe(board, row, j)) {
                board[row][j] = 'Q';
                nqueen(board, row + 1);
                board[row][j] = 'X';
            }

        }

    }

    // to count all solution of placing queens

    public static void nqueen1(char board[][], int row) {
        // base case
        if (row == board.length) {
            count++;
            return;
        }

        for (int j = 0; j < board.length; j++) {
            if (issafe(board, row, j)) {
                board[row][j] = 'Q';
                nqueen1(board, row + 1);
                board[row][j] = 'X';
            }
        }

    }

    // to check if a sol is possible if yes , print any one solution

    public static boolean nqueen3(char board[][], int row) {
        // base case
        if (row == board.length) {
            count++;
            return true;
        }

        for (int j = 0; j < board.length; j++) {
            if (issafe(board, row, j)) {
                board[row][j] = 'Q';
                if (nqueen3(board, row + 1)) {
                    return true;
                }
                board[row][j] = 'X';
            }

        }
        return false;

    }

    static int count = 0;

    public static void main(String args[]) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        // nqueen(board, 0);
        // nqueen1(board, 0);
        // System.out.println(" the no of solutions =" + count);

        if (nqueen3(board, 0)) {
            System.out.println("solution possible");
            printarr(board);
        } else {
            System.out.println(" not possible");
        }

    }
}
