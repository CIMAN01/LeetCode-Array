/*

Given an array nums, write a function to move all 0's to the end of it while maintaining the
relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]


Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.


Hint 1:

In-place means we should not be allocating any space for extra array. But we are allowed to
modify the existing array. However, as a first step, try coming up with a solution that makes
use of additional space.

For this problem as well, first apply the idea discussed using an additional array and the
in-place solution will pop up eventually.


Hint 2:

A two-pointer approach could be helpful here.

The idea would be to have one pointer for iterating the array and another pointer that just
works on the non-zero elements of the array.

*/

import java.util.Arrays;

// main class
public class MoveZeroes {

    // a method that takes in an array and moves any or all 0's to the end of the array
    public static void moveZeroes(int[] nums) {
        // empty case
        if (nums == null || nums.length == 0) {
            System.out.println("\noutput array is empty");
            return;
        }
        // create two pointers (one for scanning the array, the other just for non-zero elements)
        int nonZeroPointer = 0; // second pointer for non-zero numbers
        // traverse the array using the first pointer
        for (int p = 0; p < nums.length; p++) { // pointer p
            // if arr[p] is non-zero
            if (nums[p] != 0) {
                // swap the element at index 'nonZeroPointer' with the element at index 'p'
                int swap = nums[nonZeroPointer];
                nums[nonZeroPointer] = nums[p];
                nums[p] = swap;
                // increment non-zero pointer
                nonZeroPointer++;
            }
        }
        // print the array to the console
        System.out.println("\noutput array: " + Arrays.toString(nums));
    }

    // main method
    public static void main(String[] args) {
        System.out.println();
        // create arrays with input values
        int arr1[] = {0, 1, 0, 3, 12};
        int arr2[] = {}; // empty
        // display the input array
        System.out.println("input array: " + Arrays.toString(arr1));
        // invoke method and print the output array
        moveZeroes(arr1); // [1,3,12,0,0]
    }

}
