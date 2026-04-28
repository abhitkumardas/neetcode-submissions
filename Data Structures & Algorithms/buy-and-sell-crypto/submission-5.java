class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len < 2)
            return 0;

        int maxProfit = 0;
        int minPrice = prices[0];

        for (int i = 1; i < len; i++) {
            int p = prices[i];
            if (p < minPrice) {
                minPrice = p;
            } else if (p - minPrice > maxProfit) {
                maxProfit = p - minPrice;
            }
        }

        return maxProfit;
    }
}
