class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int bestBuy = 0;

        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[bestBuy]) {
                max = Math.max(max, prices[i] - prices[bestBuy]);
            } else {
                bestBuy = i;
            }
        }
        return max;
    }
}