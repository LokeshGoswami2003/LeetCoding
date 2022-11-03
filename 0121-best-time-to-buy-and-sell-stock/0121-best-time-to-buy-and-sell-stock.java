class Solution {
    public int maxProfit(int[] prices) {
        int maxpro=0;
        int minyet=prices[0];
        for(int i=1;i<prices.length;i++){
            if((prices[i]-minyet)>maxpro){
                maxpro=prices[i]-minyet;
            }
            if(prices[i]<minyet)
                minyet=prices[i];
        }
        return maxpro;
    }
}