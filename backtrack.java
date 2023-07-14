public class backtrack {

    public static void findsub(String str, String ans, int i)// to find subsets of a string
    {
        if (i == str.length()) // base case
        {
            if (ans.length() == 0) // base case for null subset
            {
                System.out.println("{ }");
            }
            System.out.println(ans);
            return;
        }
        findsub(str, ans + str.charAt(i), i + 1);
        findsub(str, ans, i + 1);
    }

    public static void arr_prob1(int arr[], int i, int val) {
        if (i == arr.length) {
            printarr(arr);
            return;
        }
        arr[i] = val;
        arr_prob1(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2;
    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // grids ways
    public static int gridways(int i, int j, int n, int m) // iand j=index of source
    { // n and m = index of target
        if (i == n - 1 && j == m - 1) {
            return 1; // target to target only 1 way // time complexity=o(2^n+m)-bad exponential tc
        }
        if (i == n || j == m) {
            return 0;
        }
        int w1 = gridways(i + 1, j, n, m);// down movement
        int w2 = gridways(i, j + 1, n, m);// up movement
        int w3 = w1 + w2;
        return w3;
    }

    // grid way using permutataion
    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static int gridway1(int n, int m) { // timme complexity=o(n+m)
        int total_char = n - 1 + m - 1;
        int repeat_char1 = n - 1;
        int repeat_char2 = m - 1;
        int total_ways = (fact(total_char)) / ((fact(repeat_char1)) * (fact(repeat_char2)));
        return total_ways;
    }

    public static void main(String args[]) {

        // find subset
        // String str = "abc";
        // String ans = "";
        // findsub(str, ans, 0);

        // prob2
        // int arr[] = new int[5];
        // arr_prob1(arr, 0, 1);
        // printarr(arr);
        // System.out.println(gridways(0, 0, 3, 3));
        // System.out.println(fact(5));
        System.out.println(gridway1(3, 3));

    }

}
