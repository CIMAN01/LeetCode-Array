/*

Given an array of integers nums, write a method that returns the "pivot" index of this array.

We define the pivot index as the index where the sum of all the numbers to the left of the
index is equal to the sum of all the numbers to the right of the index.

If no such index exists, we should return -1. If there are multiple pivot indexes, you should
return the left-most pivot index.


Example 1:

Input: nums = [1,7,3,6,5,6]
Output: 3

Explanation:

The sum of the numbers to the left of index 3 (nums[3] = 6) is equal to the sum of numbers to
the right of index 3. Also, 3 is the first index where this occurs.

Example 2:

Input: nums = [1,2,3]
Output: -1

Explanation:

There is no index that satisfies the conditions in the problem statement.


Constraints:

    The length of nums will be in the range [0, 10000].
    Each element nums[i] will be an integer in the range [-1000, 1000].


Hint:

We can pre-compute prefix sums P[i] = nums[0] + nums[1] + ... + nums[i-1].
Then for each index, the left sum is P[i], and the right sum is P[P.length-1]-P[i]-nums[i].

*/


import java.util.Arrays;

// main class
public class FindPivotIndex {

    // a method that that finds and returns the pivot index (if it exists)
    public static int pivotIndex(int[] nums) {
        // pre-compute prefix sums P[i] = nums[0] + nums[1] + ... + nums[i-1]
        int sum = 0; // create a sum variable and set it to 0
        // iterate over the array
        for (int i = 0; i < nums.length; i++) {
            // assign each i-th array value to sum
            sum += nums[i];
        }
        // create variables for left and right sums
        int leftSum = 0; // P[i]
        int rightSum; // no need to initialize
        // loop through the array
        for (int i = 0; i < nums.length; i++) {
            // if i-th value is greater than 0
            if (i > 0) {
                // for each index, the left sum is P[i]
                leftSum += nums[i-1]; // add to the left sum
            }
            // for each index, the right sum is P[P.length-1] - P[i] - nums[i]
            rightSum = sum - leftSum - nums[i]; // to the right sum
            // compare the left sum to the right sum and if they are equal to each other
            if (leftSum == rightSum) {
                // pivot index is found and returned
                return i;
            }
        }
        // otherwise there is no pivot index, and a -1 is returned instead
        return -1;
    }

    // main method
    public static void main(String[] args) {
        System.out.println();
        // create an array with some values
        int[] input1 = {1, 7, 3, 6, 5, 6};
        // display the input array
        System.out.println("for input array: " + Arrays.toString(input1)); // [1,7,3,6,5,6]
        // invoke method and display the output
        System.out.println("the 'pivot' index is: " + pivotIndex(input1)); // 3
        System.out.println();
        // create an array with some values
        int[] input2 = {1, 2, 3};
        // display the input array
        System.out.println("for input array: " + Arrays.toString(input2)); // [1,2,3]
        // invoke method and display the output
        System.out.println("the 'pivot' index is: " + pivotIndex(input2)); // -1
    }

}
