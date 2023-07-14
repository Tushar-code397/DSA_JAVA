import java.util.*;

public class array_list {
    public static void print(ArrayList<Integer> list1) {
        int n = list1.size() - 1;
        for (int i = 0; i <= n; i++) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();
    }

    // PRINT REVERSE OF A ARRAY LIST
    public static void reverse(ArrayList<Integer> list1) {
        int n = list1.size() - 1;
        for (int i = n; i >= 0; i--) {
            System.out.print(list1.get(i) + " ");
        }
    }

    public static void max(ArrayList<Integer> list1) { // to find maximum value in arraylist
        int n = list1.size() - 1;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            max = (Math.max(max, list1.get(i)));
        }
        System.out.println(max);
    }

    // swap two numbers
    public static void swap(ArrayList<Integer> list1, int inx1, int inx2) {
        int temp = list1.get(inx1);
        list1.set(inx1, list1.get(inx2));
        list1.set(inx2, temp);
    }

    // sorting
    public static void sorting(ArrayList<Integer> list1) {
        Collections.sort(list1); // ascending order
        print(list1);
        Collections.sort(list1, Collections.reverseOrder());
        print(list1);
    }

    // multi dimension arraylist

    public static void array2d(ArrayList<ArrayList<Integer>> mainlist) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 0; i <= 5; i++) {
            list1.add(i * 2);
            list2.add(i * 3);
            list3.add(i * 4);
        }

        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);

        System.out.println(mainlist);

        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer> currrlist = mainlist.get(i);
            for (int i1 = 0; i1 < currrlist.size(); i1++) {
                System.out.print(currrlist.get(i1) + " ");
            }
            System.out.println();
        }

    }

    public static boolean monotonic(ArrayList<Integer> list1) { // practise -1 (monotonic)
        boolean inc = true;
        boolean dec = true;
        for (int i = 0; i < list1.size() - 1; i++) {

            if ((list1.get(i) < list1.get(i + 1))) {
                inc = false;
            }
            if ((list1.get(i) > list1.get(i + 1))) {
                dec = false;
            }

        }
        return (inc || dec);
    }

    public static void lonely(ArrayList<Integer> list1) { // lone number
        for (int i = 0; i < list1.size(); i++) {
            int ele = list1.get(i);
            int count = 0;
            if (ele == list1.get(i)) {
                count = count + 1;

            }
            if (count == 1) {
                if (list1.contains(list1.get(i) - 1)) {
                    if (list1.contains(list1.get(i) + 1)) {
                        System.out.println(list1.get(i));
                    }
                }
            }
        }
    }

    public static int mostfrequent(ArrayList<Integer> list1, int key) {
        int[] result = new int[1000];
        for (int i = 0; i < list1.size() - 1; i++) {

            if (key == list1.get(i)) {
                result[list1.get(i + 1) - 1]++;
            }
        }
        int max = Integer.MIN_VALUE;
        int ans = 0;

        for (int j = 0; j < 1000; j++) {
            if (max < result[j]) {
                max = result[j];
                ans = ans + 1;

            }
        }
        return ans;

    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>(); // DECLARATION
        // array2d(mainlist);

        // // add element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(3);

        // reverse(list);
        // max(list);
        // print(list);
        // swap(list, 1, 2);
        // print(list);
        // sorting(list);
        // System.out.println(monotonic(list));
        // lonely(list);
        System.out.println(mostfrequent(list, 2));

    }
}