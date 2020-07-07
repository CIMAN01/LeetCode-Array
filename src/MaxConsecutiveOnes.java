/*

Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:

Input: [1,1,0,1,1,1]
Output: 3

Explanation:

The first two digits or the last three digits are consecutive 1s. The maximum number of
consecutive 1s is 3.

Note:
    The input array will only contain 0 and 1.
    The length of input array is a positive integer and will not exceed 10,000

Hint:

You need to think about two things as far as any window is concerned.

One is the starting point for the window. How do you detect that a new window of 1s has started?

The next part is detecting the ending point for this window. How do you detect the ending point
for an existing window?

If you figure these two things out, you will be able to detect the windows of consecutive ones.

All that remains afterward is to find the longest such window and return the size.

*/

import java.util.Arrays;

// main class
public class MaxConsecutiveOnes {

    // a method that finds and returns the maximum number of consecutive 1's (digits)
    public static int findMaxConsecutiveOnes(int[] nums) {
        // create a max variable and initialize to 0
        int max = 0;
        // create a count variable and initialize to 0
        int count = 0;
        // loop through the array
        for (int i = 0; i < nums.length; i++) {
            // if the i-th array element contains a 1 (detecting the windows of consecutive ones)
            if (nums[i] == 1) {
                // increment the count by one
                count++;
            }
            // else it does not contain a 1 (detecting the ending point for an existing window)
            else {
                // if the count is bigger than max
                if (count > max) {
                    // assign count's value to max
                    max = count;
                }
                // and reset count to zero
                count = 0;
            }
        }
        // return the greater of the two values (finding the longest such window and returning the size)
        return Math.max(max,count);
    }

    // main method
    public static void main(String[] args) {
        // create an array of 1's and 0's
        int[] input = {1, 1, 0, 1, 1, 1}; // input: [1, 1, 0, 1, 1, 1]
        System.out.println();
        System.out.println("input: " + Arrays.toString(input));
        System.out.println();
        // invoke the method and print the result(s)
        System.out.println("output: " + findMaxConsecutiveOnes(input)); // output: 3
    }

}
