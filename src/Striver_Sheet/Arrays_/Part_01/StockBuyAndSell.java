package Striver_Sheet.Arrays_.Part_01;

public class StockBuyAndSell {

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int todayProfit = 0;
        int maxProfit = Integer.MIN_VALUE;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minPrice) minPrice = prices[i];
            todayProfit = prices[i] - minPrice;
            if(todayProfit > maxProfit) maxProfit = todayProfit;
        }
        return maxProfit;
    }

}