/*

Given an integer array nums, find the contiguous subarray (containing at least one number) which has
the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4]
Output: 6

Explanation: [4,-1,2,1] has the largest sum = 6.

Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer
approach, which is more subtle.


*/


import java.util.Arrays;

// main class
public class MaximumSubArray {

    // a method that takes in an array and returns the max value from its sub-array
    public static int maxSubArray(int[] nums) {
        // base case: if null or empty
        if (nums.length == 0) {
            return 0;
        }
        // base case: if only one element exists
        if (nums.length == 1) {
            // return the value of the first and only element
            return nums[0];
        }
        // create variables sum and max and assign the value of the first element to each
        int sum = nums[0];
        int max = nums[0];
        // traverse the array
        for (int i = 1; i < nums.length; i++) {
            // compute the sum
            sum += nums[i];
            // if sum is decreasing
            if (sum <= nums[i]) {
                // reset sum (with first element of the next sub-array)
                sum = nums[i];
            }
            // if max is less than sum
            if (max < sum) {
                // update the value of max
                max = sum;
            }
        }
        // return the max value found
        return max;
    }

    // main method
    public static void main(String[] args) {
        System.out.println();
        // create an array with some input values
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        // display the input array
        System.out.println("array: " + Arrays.toString(arr)); // [-2,1,-3,4,-1,2,1,-5,4]
        // invoke method and print the output
        System.out.println("\nsub-array's largest sum: " + maxSubArray(arr)); // 6
    }
    
}
