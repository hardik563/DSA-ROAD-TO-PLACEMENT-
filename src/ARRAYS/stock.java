package ARRAYS;

public class stock {

    public int maxProfit(int[] prices) {
        int mprofit = 0;
        int buyprice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (buyprice < prices[i]) {
                int profit = prices[i] - buyprice;
                mprofit = Math.max(mprofit, profit);
            } else {
                buyprice = prices[i];
            }
        }

        return mprofit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        stock obj = new stock();
        System.out.println(obj.maxProfit(prices));
    }
}