class Solution {
    public int maxProfit(int[] prices) {
   
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        
        for(int index=0;index<prices.length;index++){
            
            if(prices[index]<minPrice )
                minPrice=prices[index];
            else if(prices[index]-minPrice>maxProfit)
                maxProfit=prices[index]-minPrice;
            
        }
        return maxProfit;
    }
}