// Title: Best Time to Buy and Sell Stock
// URL: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Difficulty: Easy
// Language: java

class Solution {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;  
        int max_profit = 0;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            }
            profit = prices[i] - minprice;
            if (profit > max_profit) {
                max_profit = profit;
            }
        }
        return max_profit;
    }
}
