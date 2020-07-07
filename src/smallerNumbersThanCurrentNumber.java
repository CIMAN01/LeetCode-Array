/*

Given the array nums, for each nums[i] find out how many numbers in the array are smaller
than it.

That is, for each nums[i] you have to count the number of valid j's such that j != i
and nums[j] < nums[i].

Return the answer in an array.


Example 1:

Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]

Explanation:

For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
For nums[1]=1 does not exist any smaller number than it.
For nums[2]=2 there exist one smaller number than it (1).
For nums[3]=2 there exist one smaller number than it (1).
For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).


Example 2:

Input: nums = [6,5,4,8]
Output: [2,1,0,3]

Example 3:

Input: nums = [7,7,7,7]
Output: [0,0,0,0]

Constraints:

    2 <= nums.length <= 500
    0 <= nums[i] <= 100


Hint 1:

Brute force for each array element.

Hint 2:

In order to improve the time complexity, we can sort the array and get the answer
for each array element.

*/

import java.util.Arrays;

// main class
public class smallerNumbersThanCurrentNumber {

    // a method that finds how many smaller numbers than the current number are in the array
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        // create a new array and give it the old array's length
        int[] output = new int[nums.length];
        // create and initialize a count variable
        int count = 0;
        // create two loops to compare the array with itself
        for (int i = 0; i < nums.length; i++) { // outer loop
            // inner loop
            for (int j = 0; j < nums.length; j++) {
                // if j != i and nums[j] < nums[i]
                if((j!=i) && (nums[j] < nums[i])) {
                    // increment count
                    count++;
                }
            }
            // set the i-th element the value of count
            output[i] = count;
            // reset count to 0 after inner loop finishes
            count = 0;
        }
        // return the array
        return output;
    }

    // main method
    public static void main(String[] args) {
        System.out.println();
        // create an array with some values
        int[] arr1 = {8, 1, 2, 2, 3};
        // display the input array
        System.out.println("input array: " + Arrays.toString(arr1)); // [8,1,2,2,3]
        // invoke method and display the output
        System.out.println("output array: " + Arrays.toString(smallerNumbersThanCurrent(arr1))); // [4,0,1,1,3]
        System.out.println();
        // create an array with some values
        int[] arr2 = {6, 5, 4, 8};
        // display the input array
        System.out.println("for input array: " + Arrays.toString(arr2)); // [6,5,4,8]
        // invoke method and display the output
        System.out.println("output array: " +  Arrays.toString(smallerNumbersThanCurrent(arr2))); // [2,1,0,3]
        System.out.println();
        // create an array with some values
        int[] arr3 = {7, 7, 7, 7};
        // display the input array
        System.out.println("input array: " + Arrays.toString(arr3)); // [7,7,7,7]
        // invoke method and display the output
        System.out.println("output array: " + Arrays.toString(smallerNumbersThanCurrent(arr3))); // [0,0,0,0]
    }

}
