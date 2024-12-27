class Solution {
    public int maxProfit(int[] prices) {
        int lowest = prices[0];
        int mp = 0;
        for(int i : prices){
            if(i < lowest)
                lowest = i;
            mp = Math.max(mp, i-lowest);
        }
        return mp;
    }
}