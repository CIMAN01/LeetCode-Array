/*

Say you have an array prices for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like
(i.e., buy one and sell one share of the stock multiple times).

Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before
you buy again).


Example 1:

Input: [7,1,5,3,6,4]
Output: 7

Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
             Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.


Example 2:

Input: [1,2,3,4,5]
Output: 4

Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
             Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
             engaging multiple transactions at the same time. You must sell before buying again.


Example 3:

Input: [7,6,4,3,1]
Output: 0

Explanation: In this case, no transaction is done, i.e. max profit = 0.


Constraints:

    1 <= prices.length <= 3 * 10 ^ 4
    0 <= prices[i] <= 10 ^ 4


*/

import java.util.Arrays;

// main class
public class BestTimeToBuyAndSellStock2 {

    // a method that takes in array of stock prices and returns the maximum profit
    public static int maxProfit(int[] prices) {
        // base case (i.e. an empty array)
        if(prices == null) {
            return 0;
        }
        // create a variable that will hold the max profit
        int maxProfit = 0; // initialize to 0
        // scan the array of stock prices starting at second index (i = 1)
        for (int i = 1; i < prices.length; i++) {
            // if i-th element is larger than the previous element (if a profit can be made)
            if (prices[i] > prices[i-1]) {
                // add the difference between the two (the profit for a particular transaction)
                // to the overall profit gained for all transactions (max profit)
                maxProfit += prices[i] - prices[i-1];
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
        System.out.println("the maximum profit is: " + maxProfit(arr1)); // 7
        System.out.println();
        // create an array with some input values
        int arr2[] = {1, 2, 3, 4, 5};
        // display the input array
        System.out.println("array of stock prices: " + Arrays.toString(arr2)); // [1,2,3,4,5]
        // invoke method and print the output
        System.out.println("the maximum profit is: " + maxProfit(arr2)); // 4
        System.out.println();
        // create an array with some input values
        int arr3[] = {7, 6, 4, 3, 1};
        // display the input array
        System.out.println("array of stock prices: " + Arrays.toString(arr3)); // [7,6,4,3,1]
        // invoke method and print the output
        System.out.println("the maximum profit is: " + maxProfit(arr3)); // 0
    }

}
