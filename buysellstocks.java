import java.util.Scanner;
import java.io.*;

public class buysellstocks {

    public static int profit(int price[]) {
        int buy = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < price.length; i++) {
            if (price[i] > buy) {
                int profit = price[i] - buy;
                maxprofit = Math.max(profit, maxprofit);
            } else {
                buy = price[i];
            }

        }
        return maxprofit;

    }

    public static void main(String args[]) {
        int price[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(profit(price));

    }

}
