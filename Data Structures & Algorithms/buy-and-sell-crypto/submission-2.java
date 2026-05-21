class Solution {
    public int maxProfit(int[] prices) {
        int bestBuyIndex = 0;
        int bestSellIndex = 0; 
        int sellIndex = 0;
        int buyIndex = 0;
        int bestProfit = 0; 
        int currentProfit = 0;

        // brute force: iterate through array twice until we see the highest profit. 
        for (int i = 0; i < prices.length; i++) { 
            
            buyIndex = i; // for readability
            for(int j = i+1; j < prices.length; j++) { 
                // start at i+1 because:   
                // can't sell before we buy
                // assuming can't sell on same day we buy (0 profit)
                sellIndex = j; // for readability
                currentProfit = prices[sellIndex] - prices[buyIndex];
                System.out.println("buyIndex" + buyIndex + " - " + prices[buyIndex]);
                System.out.println("sellIndex" + sellIndex + " - " + prices[sellIndex]);
                System.out.println("currentProfit " + currentProfit + " ");

                if (currentProfit > bestProfit) { 
                    bestBuyIndex = buyIndex;
                    bestSellIndex = sellIndex; 
                    bestProfit = currentProfit;
                }
            }
        }
        System.out.println("bestBuyIndex" + bestBuyIndex + " ");
        System.out.println("bestSellIndex" + bestSellIndex + " ");
        return bestProfit;
    }
}
