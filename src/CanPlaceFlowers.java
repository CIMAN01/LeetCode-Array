/*

Suppose you have a long flowerbed in which some of the plots are planted and some are not. However,
flowers cannot be planted in adjacent plots - they would compete for water and both would die.

Given a flowerbed (represented as an array containing 0 and 1, where 0 means empty and 1 means not empty),
and a number n, return if n new flowers can be planted in it without violating the no-adjacent-flowers
rule.

Example 1:

Input: flowerbed = [1,0,0,0,1], n = 1
Output: True

Example 2:

Input: flowerbed = [1,0,0,0,1], n = 2
Output: False

Note:

    The input array won't violate no-adjacent-flowers rule.
    The input array size is in the range of [1, 20000].
    n is a non-negative integer which won't exceed the input array size.

*/


import java.util.Arrays;


// main class
public class CanPlaceFlowers {

    // a method that takes in a flowerbed (array) and n flowers and returns a true or false based on
    // whether the flower can be planted in the plots or not given the no-adjacent-flowers rule
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        // empty case

        if (flowerbed == null || flowerbed.length == 0) {
            return false;
        }
        // create a plot variable and initialize to zero
        int plot = 0;
        // traverse the array
        for (int i = 0; i < flowerbed.length; i++) {
            // if the first plot || previous plot is empty && current plot is empty && the next plot || or last plot is empty
            if ((i == 0 || flowerbed[i - 1] == 0) && flowerbed[i] == 0 && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
//                // can plant a flower here
//                flowerbed[i] = 1; /* not using to avoid changing the original array */
                // increment count
                plot++;
            }
            // if the count is greater or equal to n, return true
            if (plot >= n) { // the amount of available plots (count) must equal or exceed the number of existing flowers (n)
                return true;
            }
        }
        // otherwise, return false
        return false;
    }

    // main method
    public static void main(String[] args) {
        System.out.println();
        // create flowerbed array with input values
        int arr[] = {1, 0, 0, 0, 1}; // [1,0,0,0,1]
        // display the input array with n = 1
        System.out.println("if input array is " + Arrays.toString(arr) + " and n = 1");
        // invoke method and print the boolean output
        System.out.println("flowers can be planted? " + canPlaceFlowers(arr, 1)); // true
        System.out.println();
        // display the input array with n = 2
        System.out.println("if input array is: " + Arrays.toString(arr) + " and n = 2");
        // invoke method and print the boolean output
        System.out.println("flowers can be planted? " + canPlaceFlowers(arr, 2)); // false
    }

}
