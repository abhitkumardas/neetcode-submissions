class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minPrice = prices[0];
        int n=prices.length;

        for(int i=0; i<n; i++){
            int curPrice=prices[i];
            if(minPrice>curPrice){
                minPrice = curPrice;
            } else{
                maxProfit = Math.max(maxProfit, curPrice-minPrice);
            }
        }

        return maxProfit;
        
    }
}
