/*

Given an array A of integers, return true if and only if it is a valid mountain array.

Recall that A is a mountain array if and only if:

    A.length >= 3
    There exists some i with 0 < i < A.length - 1 such that:
        A[0] < A[1] < ... A[i-1] < A[i]
        A[i] > A[i+1] > ... > A[A.length - 1]


Example 1:

Input: [2,1]
Output: false

Example 2:

Input: [3,5,5]
Output: false

Example 3:

Input: [0,3,2,1]
Output: true


Note:

    0 <= A.length <= 10000
    0 <= A[i] <= 10000


Hint:

It's very easy to keep track of a monotonically increasing or decreasing ordering of elements.
You just need to be able to determine the start of the valley in the mountain and from that point onwards,
it should be a valley i.e. no mini-hills after that.

Use this information in regards to the values in the array and you will be able to come up with a
straightforward solution.


*/


import java.util.Arrays;

// main class
public class ValidMountainArray {

    // a method that takes in an array integers and returns true if it is a valid mountain array
    public static boolean validMountainArray(int[] A) {
        // base case A is null or its length is less than 3
        if ((A == null || A.length < 3)) {
            return false;
        }
        // create an increment counter i (a pointer) and set to 0
        int i = 0;
        // walking up (from left to right) until reaching the peak (while strictly increasing)
        while (i+1 < A.length && A[i] < A[i+1]) {
            // keep incrementing counter i
            i++;
        }
        // peak must not be first or last element, if it is then
        if (i == 0 || i == A.length-1) {
            // false is returned because the end has been reached and we cannot proceed walking down
            return false;
        }
        // walking down (from left to right) until reaching the end of mountain (while strictly decreasing)
        while (i+1 < A.length && A[i] > A[i+1]) {
            // keep incrementing counter i
            i++;
        }
        // if the end of the mountain is reached, the array is valid, otherwise it is not
        return i == A.length-1; // return true if end of mountain is reached, false otherwise
    }


    // main method
    public static void main(String[] args) {
        System.out.println();
        // create two arrays with input values
        int[] arr1 = {2, 1};
        // invoke method and display the output array
        System.out.println(Arrays.toString(arr1)); // [2,1]
        System.out.println("is mountain array valid: " + validMountainArray(arr1)); // false
        System.out.println();
        // create two arrays with input values
        int[] arr2 = {3, 5, 5};
        // invoke method and display the output array
        System.out.println(Arrays.toString(arr2)); // [3,5,5]
        System.out.println("is mountain array valid: " + validMountainArray(arr2)); // false
        System.out.println();
        // create two arrays with input values
        int[] arr3 = {0, 3, 2, 1};
        // invoke method and display the output array
        System.out.println(Arrays.toString(arr3)); // [0,3,2,1]
        System.out.println("is mountain array valid: " + validMountainArray(arr3)); // true
    }

}
