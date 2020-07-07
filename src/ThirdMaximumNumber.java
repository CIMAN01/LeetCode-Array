/*

Given a non-empty array of integers, return the third maximum number in this array.

If it does not exist, return the maximum number. The time complexity must be in O(n).

Example 1:

Input: [3, 2, 1]

Output: 1

Explanation: The third maximum is 1.

Example 2:

Input: [1, 2]

Output: 2

Explanation: The third maximum does not exist, so the maximum (2) is returned instead.

Example 3:

Input: [2, 2, 3, 1]

Output: 1

Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.


*/

import java.util.Arrays;

// main class
public class ThirdMaximumNumber {

    // a method that returns the third largest number in an array
    public static int thirdMax(int[] nums) {
        // store the array size
        int arraySize = nums.length;
        // there should be at least three elements, if there isn't
        if (arraySize < 3) {
            // third maximum integer doesn't exist so the array size is returned instead
            return arraySize;
        }
        ////////////////////////////////////
        // find the first largest number //
        //////////////////////////////////
        int first = nums[0];
        // iterate over the array using a for-loop
        for (int i = 1; i < arraySize; i++) {
            // if i-th element is larger than first largest element
            if (nums[i] > first) {
                // assign it to first
                first = nums[i];
            }
        }
        /////////////////////////////////////
        // find the second largest number //
        ///////////////////////////////////
        // create a variable and assign it the lowest possible value
        int second = Integer.MIN_VALUE;
        // iterate over the array using an enhanced for-loop
        for (int num : nums) {
            // if the i-th element's value is smaller than first and larger than second
            if ((num < first) && (num > second)) {
                // assign it to second
                second = num;
            }
        }
        ////////////////////////////////////
        // find the third largest number //
        //////////////////////////////////
        // create a variable and assign it the lowest possible value
        int third = Integer.MIN_VALUE;
        // iterate over the array using an enhanced for-loop
        for (int num : nums) {
            // if the i-th element's value is smaller than second and larger than third
            if ((num < second) && (num > third)) {
                // assign it to third
                third = num;
            }
        }
        // return the third largest integer value
        return third;
    }

    // main method
    public static void main(String[] args) {
        System.out.println();
        // create an array with some input values
        int arr1[] = {3, 2, 1};
        // display the input
        System.out.println("input: " + Arrays.toString(arr1)); // input: [3, 2, 1]
        // invoke method and print the output
        System.out.println("the third largest element is: " + thirdMax(arr1)); // output: 1
        System.out.println();
        // create an array with some input values
        int arr2[] = {1, 2};
        // display the input
        System.out.println("input: " + Arrays.toString(arr2)); // input: [1, 2]
        // invoke method and print the output
        System.out.println("the third largest element is: " + thirdMax(arr2)); // output: 2
        System.out.println();
        // create an array with some input values
        int arr3[] = {2, 2, 3, 1};
        // display the input
        System.out.println("input: " + Arrays.toString(arr3)); // input: [2, 2, 3, 1]
        // invoke method and print the output
        System.out.println("the third largest element is: " + thirdMax(arr3)); // output: 1
    }

}
