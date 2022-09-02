class Solution {
    public int maxProfit(int[] prices) {
        int maximum_profit=0;
        int minimum_yet=prices[0];
        for(int i=1;i<prices.length;i++){
            if((prices[i]-minimum_yet)>maximum_profit)
                maximum_profit=prices[i]-minimum_yet;
            if(prices[i]<minimum_yet)
                minimum_yet=prices[i];
        }
        return maximum_profit;
        
    }
}