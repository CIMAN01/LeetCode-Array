/*

In a given integer array nums, there is always exactly one largest element.

Find whether the largest element in the array is at least twice as much as every other number
in the array.

If it is, return the index of the largest element, otherwise return -1.

Example 1:

Input: nums = [3, 6, 1, 0]
Output: 1

Explanation: 6 is the largest integer, and for every other number in the array x,
6 is more than twice as big as x.  The index of value 6 is 1, so we return 1.

Example 2:

Input: nums = [1, 2, 3, 4]
Output: -1

Explanation: 4 isn't at least as big as twice the value of 3, so we return -1.


Note:

    nums will have a length in the range [1, 50].
    Every nums[i] will be an integer in the range [0, 99].


Hint:

Scan through the array to find the unique largest element 'm',
keeping track of it's index 'maxIndex'.

Scan through the array again.

If we find some 'x != m' with 'm < 2*x', we should return '-1'.
Otherwise, we should return 'maxIndex'.

*/

// main class
public class LargestNumberAtLeastTwiceOfOthers {

    // a method that
    public static int dominantIndex(int[] nums) {
        // unique largest element m
        int max = nums[0];
        // index for largest value
        int maxIndex = 0;
        // scan through the array
        for (int i = 0; i < nums.length; i++) {
            // if the i-th array value is larger than max
            if (nums[i] > max) {
                // assign that value to max
                max = nums[i];
                // keep track of index for that value
                maxIndex = i;
            }
        }
        // scan through the array again
        for (int i = 0; i < nums.length; i++) {
            // if we find some 'x != m' with 'm < 2*x', we should return '-1'
            if ((nums[i] != max) && (max < (2*nums[i]))) {
                return -1;
            }
        }
        // otherwise, we should return 'maxIndex'
        return maxIndex;
    }

    // main method
    public static void main(String[] args) {
        System.out.println();
        // create an array with some input values
        int[] nums1 = {3, 6, 1, 0};
        // display the input
        System.out.println("input :" + nums1); // input: [3, 6, 1, 0]
        // invoke method and print the output
        System.out.println(dominantIndex(nums1)); // output: 1
        System.out.println();
        // create an array with some input values
        int[] nums2 = {1, 2, 3, 4};
        // display the input
        System.out.println("input :" + nums2); // input: [1, 2, 3, 4]
        // invoke method and print the output
        System.out.println(dominantIndex(nums2)); // output: -1
    }

}
