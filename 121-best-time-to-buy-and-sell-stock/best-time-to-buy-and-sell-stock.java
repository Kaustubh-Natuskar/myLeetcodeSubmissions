class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0], maxProfit = 0;
        for(int i=0; i<prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - buyPrice);
            buyPrice = Math.min(buyPrice, prices[i]);
        }
        return maxProfit; 
    }
}