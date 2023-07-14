
import java.lang.reflect.Array;
import java.util.*;

public class activityselection {

    public static void main(String args[]) {

        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        // when we need to sort the end array
        // create a 2d array with 3 cols 1- index 2- start 3-end

        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];

            // lamda function to sort 2d array with respect to end time
            Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
        }

        // end time basis sorted
        int maxact = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        // for 1 activity
        maxact = 1;
        ans.add(activities[0][0]);
        int lastend = activities[0][2];
        for (int i = 1; i < end.length; i++) {
            if (activities[i][1] >= lastend) {
                maxact++;
                ans.add(activities[i][0]);
                lastend = activities[i][2];
            }
        }
        System.out.println(" max activity=" + maxact);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println("a" + ans.get(i) + " ");
        }

    }
}
