class Solution {
    public int maxProfit(int[] prices) {
        int bestProfit = 0; 
        int currentProfit = 0;

        // brute force: iterate through array twice until we see the highest profit. 
        for (int i = 0; i < prices.length; i++) { 
            for(int j = i+1; j < prices.length; j++) { 
                currentProfit = prices[j] - prices[i];

                if (currentProfit > bestProfit) { 
                    bestProfit = currentProfit;
                }
            }
        }
        return bestProfit;
    }
}
