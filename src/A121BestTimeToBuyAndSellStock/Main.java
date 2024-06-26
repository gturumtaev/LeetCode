package A121BestTimeToBuyAndSellStock;
//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
//
//Вам дан массив prices, в котором prices[i]указана цена данной акции на текущий день.ith
//Вы хотите максимизировать свою прибыль, выбрав один день для покупки одной акции и выбрав другой день в будущем для продажи этой акции.
//Верните максимальную прибыль, которую вы можете получить от этой сделки . Если вы не можете получить никакой прибыли, вернитесь 0.
//
//Example 1:
//
//Input: prices = [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
//Example 2:
//
//Input: prices = [7,6,4,3,1]
//Output: 0
//Explanation: In this case, no transactions are done and the max profit = 0.
public class Main {
    public static void main(String[] args) {
        int[] array1 = {7, 1, 5, 3, 4, 6};
        System.out.println(maxProfit(array1));
        int[] array2 = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(array2));
    }

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        int current = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) min = prices[i];

            current = prices[i] - min;
            if (current > max) max = current;
        }
        return max;
    }

}