import java.net.SocketImpl;

public class recursion {
    static String number[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static int factorial(int n) { // factorial
        int fact = 1;
        if (n == 0) {
            return 1;
        } else {
            fact = n * factorial(n - 1);
        }
        return fact;
    }

    public static void dec(int n) { // decreasing order
        if (n == 1) {
            System.out.print(n);
            return;
        } else {
            System.out.print(n);
            dec(n - 1);
        }

    }

    public static void inc(int n) { // increasing order
        if (n == 1) {
            System.out.print(n);
            return;
        } else {
            inc(n - 1);
            System.out.print(n);

        }

    }

    public static int sum(int n) { // sum of n natural number
        int sum = 0;
        if (n == 1) {
            return 1;
        }
        int sn = sum(n - 1);
        sum = n + sn;
        return sum;

    }

    public static int fibonacci(int n) // finding a number n in fibonacci series
    {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        int n1 = fibonacci(n - 2);

        int n2 = fibonacci(n - 1);

        int n3 = n1 + n2;

        return n3;
    }

    public static boolean sorted(int arr[], int i) { // check if a given array is sorted or not
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return sorted(arr, i + 1);

    }

    public static int firstoccurence(int arr[], int key, int i) { // check for first occurence of a number in a given
                                                                  // array
        if (i > arr.length - 1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstoccurence(arr, key, i + 1);

    }

    public static int lastoccurence(int arr[], int key, int i) // to find last occurence of a key in a array
    {
        if (i == arr.length) {
            return -1;
        }
        int isfound = lastoccurence(arr, key, i + 1);
        if (arr[i] == key && isfound == -1) {
            return i;
        }
        return isfound;
    }

    public static int power(int x, int n) { // power x^n
        int pow = 1;
        if (n == 1) { // tc=o(n)
            return x;
        } else {
            pow = x * power(x, n - 1);
        }
        return pow;
    }

    public static int optimised_power(int x, int n) { // optimised code for power x^n
        // tc=o(log n)
        if (n == 0) {
            return 1;
        }
        int halfpower = optimised_power(x, n / 2);
        int halfpower_sq = halfpower * halfpower;
        if (n % 2 != 0) {
            halfpower_sq = x * halfpower_sq;
        }
        return halfpower_sq;
    }

    public static int tiling(int n) { // tiling problem
                                      // floor = 2*n
        if (n == 0 || n == 1) {
            return 1;
        }
        // vertical choice
        int fn1 = tiling(n - 1);

        // horiontal problem

        int fn2 = tiling(n - 2);

        // total ways
        int total = fn1 + fn2;
        return total;
    }

    public static void duplicate_string(String str, int index, StringBuilder strnew, boolean arr[]) // removing
                                                                                                    // duplicate char in
                                                                                                    // a string
    {
        if (index == str.length()) // base condition
        {
            System.out.println(strnew);
            return; // array used is of type boolean to store all 26 alphabets as true if used
                    // before otherwise false
        }
        char curr_char = str.charAt(index); // finding current char
        if (arr[curr_char - 'a'] == true) // checking if current char is already appended or not by use of map array
        {
            duplicate_string(str, index + 1, strnew, arr);
        } else {
            arr[curr_char - 'a'] = true;
            strnew.append(curr_char); // appending curr char in new string if it is not present in arr as true
            duplicate_string(str, index + 1, strnew, arr);

        }

    }

    public static int friends_pairing(int n) { // finding ways for freind to pair or stand single in a party
        if (n == 1 || n == 2) {
            return n;
        } else {
            // choice
            // single
            int fn1 = friends_pairing(n - 1);

            // pairs
            int fn2 = (n - 1) * friends_pairing(n - 2);

            // total ways
            return (fn1 + fn2);
        }
    }

    public static void binarystring(int n, int lastplace, String str) { // to print binary string of length n without
                                                                        // consecutive ones
        if (n == 0) {
            System.out.println(str);
            return;
        }
        binarystring(n - 1, 0, str + "0"); // zero need to place in both choices so doing it once at starting
        if (lastplace == 0) {

            binarystring(n - 1, 1, str + "1");
        }

    }

    public static void alloccurence(int arr[], int key, int i) { // check for all occurence of a number in a given
        // array
        if (i > arr.length - 1) {

            return;
        }
        if (arr[i] == key) {
            System.out.println(i);
        }
        alloccurence(arr, key, i + 1);

    }

    public static void number(int n) // convert a number into number in words
    {

        if (n == 0) {
            return;
        }

        int lastdigit = n % 10;
        number(n / 10);
        System.out.print(number[lastdigit] + " ");
    }

    public static int length(String str) { // to find out length of a string using recursion
        if (str.length() == 0) {
            return 0;
        }
        return length(str.substring(1)) + 1;
    }

    public static int countSubstrs(String str, int i, int j, int n) { // count the no. of substring in a string starting
                                                                      // and ending with same char
        if (n == 1) {
            return 1;
        }
        if (n <= 0) {
            return 0;
        }
        int res = countSubstrs(str, i + 1, j, n - 1) +
                countSubstrs(str, i, j - 1, n - 1) -
                countSubstrs(str, i + 1, j - 1, n - 2);
        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }
        return res;
    }

    public static void main(String args[]) {
        // String str = "";
        int arr[] = { 1, 2, 3, 5, 4, 6, 5, 3, 7, 5 };
        // System.out.println(factorial(5));
        // dec(10);
        // inc(10);
        // System.out.println(sum(10));
        // System.out.println(fibonacci(10));
        // System.out.println(sorted(arr, 0));
        // System.out.println(firstoccurence(arr, 5, 0));
        // System.out.println(lastoccurence(arr, 5, 0));
        // System.out.println(power(2, 1));
        // System.out.println(optimised_power(2, 0));
        // System.out.println(tiling(4));
        String str = "fuuuccckkkk";
        // duplicate_string(str, 0, new StringBuilder(""), new boolean[26]);
        // System.out.println(friends_pairing(3));
        // binarystring(4, 0, str);
        // alloccurence(arr, 5, 0);

        // number(1023);
        // System.out.println();
        System.out.println(length(str));
    }

}
