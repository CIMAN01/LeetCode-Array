/*

An array is monotonic if it is either monotone increasing or monotone decreasing.

An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if
for all i <= j, A[i] >= A[j].

Return true if and only if the given array A is monotonic.


Example 1:

Input: [1,2,2,3]
Output: true


Example 2:

Input: [6,5,4,4]
Output: true


Example 3:

Input: [1,3,2]
Output: false


Example 4:

Input: [1,2,4,5]
Output: true


Example 5:

Input: [1,1,1]
Output: true


Note:

    1 <= A.length <= 50000
    -100000 <= A[i] <= 100000


*/


import java.util.Arrays;

// main class
public class MonotonicArray {

    // a method that takes in an array and checks whether or not it is monotonic
    public static boolean isMonotonic(int[] A) {
        // base case A is null or empty
        if (A == null || A.length == 0) {
            return false;
        }
        // base case A is length 1
        if (A.length == 1) {
            return true;
        }
        // create boolean flags and set to true
        boolean increasing = true;
        boolean decreasing = true;
        // traverse the array
        for (int i = 0; i < A.length-1; i++) {
            // if the next element is decreasing
            if (A[i] > A[i+1]) {
                // boolean condition becomes false
                increasing = false;
            }
            // if the next element is increasing
            if (A[i] < A[i+1]) {
                // boolean condition becomes false
                decreasing = false;
            }
        }
        // if elements are either increasing or decreasing it is monotonic and true is returned
        return increasing || decreasing;
    }

    // main method
    public static void main(String[] args) {
        System.out.println();
        // create two arrays with input values
        int[] arr1 = {1, 2, 2, 3};
        // invoke method and display the output array
        System.out.println(Arrays.toString(arr1)); // [1,2,2,3]
        System.out.println("is monotonic: " + isMonotonic(arr1)); // true
        System.out.println();
        // create two arrays with input values
        int[] arr2 = {6, 5, 4, 4};
        // invoke method and display the output array
        System.out.println(Arrays.toString(arr2)); // [6,5,4,4]
        System.out.println("is monotonic: " + isMonotonic(arr2)); // true
        System.out.println();
        // create two arrays with input values
        int[] arr3 = {1, 3, 2};
        // invoke method and display the output array
        System.out.println(Arrays.toString(arr3)); // [1,3,2]
        System.out.println("is monotonic: " + isMonotonic(arr3)); // false
        System.out.println();
        // create two arrays with input values
        int[] arr4 = {1, 2, 4, 5};
        // invoke method and display the output array
        System.out.println(Arrays.toString(arr4));  // [1,2,4,5]
        System.out.println("is monotonic: " + isMonotonic(arr4)); // true
        System.out.println();
        // create two arrays with input values
        int[] arr5 = {1, 1, 1};
        // invoke method and display the output array
        System.out.println(Arrays.toString(arr5)); // [1,1,1]
        System.out.println("is monotonic: " + isMonotonic(arr5)); // true
    }

}

