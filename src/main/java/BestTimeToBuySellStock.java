public class BestTimeToBuySellStock {
    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        countTime(prices);
        long[] longNumbers;
    }
//    You are given an array prices where prices[i] is the price of a given stock on the ith day.
//    You want to maximize your profit by choosing a single day to buy one stock and choosing a different
//    day in the future to sell that stock. Return the maximum profit you can achieve from this transaction.
//    If you cannot achieve any profit, return 0.
    public static int countTime(int[] prices) {
        int maxPrice = Integer.MAX_VALUE;
        int profit = 0;
        int profitIfSoldToday = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < maxPrice) {
                maxPrice = prices[i];
            }
            profitIfSoldToday = prices[i] - maxPrice;
            if (profit < profitIfSoldToday) {
                profit = profitIfSoldToday;
            }
        }
        return profit;
    }
    public static long factorial(long n) {
        // write your code here
        int num = (int)n;
        int factorial = 1;
        int result = 0;
        if (n == 0){
            return 1;
        } else {for (int i = 0; i < n; i++){
            result = factorial * i;
        }}

        return (long)result;
    }

}
