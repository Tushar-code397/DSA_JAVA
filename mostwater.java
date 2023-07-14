import java.util.*;

public class mostwater { // brute force -o(n^2)
    public static void stored(ArrayList<Integer> height) {
        int max = 0;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int height1 = Math.min(height.get(i), height.get(j));
                int width = ((j) - (i));
                int area = height1 * width;
                max = Math.max(max, area);
            }
        }
        System.out.println(max);
    }

    // two pointer approach -o(n)
    public static void stored1(ArrayList<Integer> height) {
        int max = 0;
        int lp = 0;
        int rp = height.size() - 1;
        while (lp < rp) {
            int height1 = Math.min(height.get(lp), height.get(rp));
            int width = ((rp) - (lp));
            int area = height1 * width;
            max = Math.max(max, area);

            // update pointers
            if (lp < rp) {
                lp++;
            } else {
                rp++;
            }
        }
        System.out.println(max);
    }

    // pairsum -brute force -o(n^2)

    public static void pairssum(ArrayList<Integer> height, int target) {
        int max = 0;
        for (int i = 0; i < height.size(); i++) {
            for (int j = 0; j < height.size(); j++) {
                int sum = height.get(i) + height.get(j);
                {
                    if (sum == target) {
                        System.out.println("true");
                        return;
                    }

                }
            }
        }
        System.out.println("false");
    }

    // pairsum -two pointer -o(n)

    public static void pairssum1(ArrayList<Integer> height, int target) {
        int lp = 0;
        int rp = height.size() - 1;
        while (lp < rp) {
            int sum = height.get(lp) + height.get(rp);

            if (sum == target) {
                System.out.println("true");
                return;
            }

            if (sum < target) {
                lp++;
            } else {
                rp--;
            }
        }
        System.out.println("false");
    }

    // pairsum2 -two pointer -o(n)
    public static void pairssum2(ArrayList<Integer> height, int target) {
        int pivot = -1;
        int n = height.size() - 1;
        for (int i = 0; i < height.size(); i++)// finding pivot
        {
            if (height.get(i) > height.get(i + 1)) {
                pivot = i;
                break;
            }
        }
        int lp = pivot + 1;
        int rp = pivot;

        while (lp != rp) {
            // case1
            int sum = height.get(lp) + height.get(rp);

            if (sum == target) {
                System.out.println("true");
                return;
            }

            if (sum < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }
        System.out.println("false");
    }

    public static void main(String args[]) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(8);
        height.add(9);
        height.add(1);
        height.add(2);
        height.add(3);
        height.add(4);
        height.add(5);
        height.add(6);
        height.add(7);
        height.add(8);
        height.add(9);
        // stored1(height);
        pairssum2(height, 5);

    }

}
