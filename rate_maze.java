public class rate_maze {

    public static void printSolution(int sol[][]) {
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol.length; j++) {
                System.out.print(" " + sol[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean issafe(int maze[][], int x, int y) {
        // if (x, y outside maze) return false
        return (x >= 0 && x < maze.length
                && y >= 0 && y < maze.length && maze[x][y] == 1);
    }

    public static boolean solver(int initial[][], int final1[][], int i, int j) {
        if (i == initial.length - 1 && j == initial.length - 1 && initial[i][j] == 1) {
            final1[i][j] = 1;
            return true;
        }
        if (issafe(initial, i, j) == true) {
            if (final1[i][j] == 1)
                return false;
            final1[i][j] = 1;
            if (solver(initial, final1, i + 1, j))
                return true;
            if (solver(initial, final1, i, j + 1))
                return true;
            final1[i][j] = 0;
            return false;
        }
        return false;

    }

    public static void main(String args[]) {
        int initial[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1 } };
        int n = initial.length;
        int final1[][] = new int[n][n];
        if (solver(initial, final1, 0, 0) == false) {
            System.out.print("Solution doesn't exist");
        } else {
            printSolution(final1);
        }

    }
}
