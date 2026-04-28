class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        if (n < 2) return 0;

        int maxProfit=0;
        int minPrice = prices[0];
        

        for(int i=1; i<n; i++){
            int curPrice=prices[i];
            if(minPrice>curPrice){
                minPrice = curPrice;
            } else if(maxProfit< curPrice-minPrice){
                maxProfit = curPrice-minPrice;
            }
        }

        return maxProfit;
        
    }
}
