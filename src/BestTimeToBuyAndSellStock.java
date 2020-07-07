/*

Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (i.e., buy one and sell one
share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.

Example 1:

Input: [7,1,5,3,6,4]
Output: 5

Explanation:

Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Not 7-1 = 6, as selling price needs to be larger than buying price.

Example 2:

Input: [7,6,4,3,1]
Output: 0

Explanation: In this case, no transaction is done, i.e. max profit = 0.


*/


import java.util.Arrays;

// main class
public class BestTimeToBuyAndSellStock {

    // a method that takes in array of stock prices and returns the maximum profit
    public static int maxProfit(int[] prices) {
        // base case (i.e. an empty array)
        if(prices.length <= 1) {
            return 0;
        }
        //////////////////////////////////////////////////////////////////////
        // create variables to hold minimum stock price and maximum profit //
        ////////////////////////////////////////////////////////////////////
        int minStockPrice = prices[0]; // assign to variable the first i-th array element
        int maxProfit = 0; // initialize to 0
        // scan the array of stock prices
        for (int i = 0; i < prices.length; i++) {
            ///////////////////////////////////////////////////////////////
            // use two if-blocks to make sure that we find and keep the //
            // lowest stock price and highest profit in each iteration //
            ////////////////////////////////////////////////////////////
            // if the i-th stock price is less than minimum stock price
            if (prices[i] < minStockPrice) {
                // assign that value to minimum stock price variable
                minStockPrice = prices[i];
            }
//            int profit = prices[i] - minStockPrice; // current i-th profit
            // if the i-th profit is larger than the maximum profit
            if((prices[i] - minStockPrice) > maxProfit) { // profit > maxProfit
                // assign that value to maximum profit variable
                maxProfit = prices[i] - minStockPrice;
            }
        }
        // return the maximum profit found
        return maxProfit;
    }

    // main method
    public static void main(String[] args) {
        System.out.println();
        // create an array with some input values
        int arr1[] = {7, 1, 5, 3, 6, 4};
        // display the input array
        System.out.println("array of stock prices: " + Arrays.toString(arr1)); // [7,1,5,3,6,4]
        // invoke method and print the output
        System.out.println("the maximum profit is: " + maxProfit(arr1)); // 5
        System.out.println();
        // create an array with some input values
        int arr2[] = {7, 6, 4, 3, 1};
        // display the input array
        System.out.println("array of stock prices: " + Arrays.toString(arr2)); // [7,6,4,3,1]
        // invoke method and print the output
        System.out.println("the maximum profit is: " + maxProfit(arr2)); // 0
    }

}
