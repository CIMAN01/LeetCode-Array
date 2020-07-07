/*

Given two arrays of integers nums and index. Your task is to create target array under the following rules:

    Initially target array is empty.
    From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
    Repeat the previous step until there are no elements to read in nums and index.

Return the target array.

It is guaranteed that the insertion operations will be valid.


Example 1:

Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]

Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]


Example 2:

Input: nums = [1,2,3,4,0], index = [0,1,2,3,0]
Output: [0,1,2,3,4]

Explanation:
nums       index     target
1            0        [1]
2            1        [1,2]
3            2        [1,2,3]
4            3        [1,2,3,4]
0            0        [0,1,2,3,4]


Example 3:

Input: nums = [1], index = [0]
Output: [1]


Constraints:

    1 <= nums.length, index.length <= 100
    nums.length == index.length
    0 <= nums[i] <= 100
    0 <= index[i] <= i


Hint:

Simulate the process and fill corresponding numbers in the designated spots.

*/


import java.util.Arrays;

// main class
public class CreateTargetArrayInTheGivenOrder {

    // a method that takes in two arrays and creates a third target array based on those two arrays
    public static int[] createTargetArray(int[] nums, int[] index) {
        // create a new empty array of similar length as the input arrays
        int[] target = new int[nums.length]; // target array
        // traverse the input array (index)
        for (int i = 0; i < index.length; i++) { // outer loop
            // if current value of the index array is smaller than i
            if (index[i] < i) {
                // traverse backwards over those smaller index values and
                for (int j = i; j > index[i]; j--) { // inner loop
                    // shift values to right
                    target[j] = target[j - 1];
                }
            }
            // copy value of nums into the proper target index using the value of the index array
            target[index[i]] = nums[i];
        }
        // return the the target array
        return target;
    }

    // main method
    public static void main(String[] args) {
        System.out.println();
        // create two arrays with input values
        int[] nums1 = {0, 1, 2, 3, 4}; // nums = [0,1,2,3,4]
        int[] index1 = {0, 1, 2, 2, 1}; // index = [0,1,2,2,1]
        // invoke method and display the output array
        System.out.println("target array: " + Arrays.toString(createTargetArray(nums1, index1))); // [0,4,1,3,2]
        System.out.println();
        // create two arrays with input values
        int[] nums2 = {1, 2, 3, 4, 0}; // nums = [1,2,3,4,0]
        int[] index2 = {0, 1, 2, 3, 0}; // index = [0,1,2,3,0]
        // invoke method and display the output array
        System.out.println("target array: " + Arrays.toString(createTargetArray(nums2, index2))); // [0,1,2,3,4]
        System.out.println();
        // create two arrays with input values
        int[] nums3 = {1}; // nums = [1]
        int[] index3 = {0}; // index = [0]
        // invoke method and display the output array
        System.out.println("target array: " + Arrays.toString(createTargetArray(nums3, index3))); // [1]
    }

}
