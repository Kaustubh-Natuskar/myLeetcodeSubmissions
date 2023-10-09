class Solution {
    public int maxProfit(int[] prices) {
        int cheapest = prices[0];
        int maxPrice = 0;

        for(int i = 0; i < prices.length; i++) {
            int current = prices[i];
            if(current < cheapest) {
                cheapest = current;
            }
            if(current - cheapest > maxPrice) {
                maxPrice = current - cheapest;
            }
        }  
        return maxPrice;                                                                            
    }
}