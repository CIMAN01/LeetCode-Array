/*

Given an array of integers A sorted in non-decreasing order, return an array of the
squares of each number, also in sorted non-decreasing order.



Example 1:

Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]

Example 2:

Input: [-7,-3,2,3,11]
Output: [4,9,9,49,121]



Note:

    1 <= A.length <= 10000
    -10000 <= A[i] <= 10000
    A is sorted in non-decreasing order.

*/

import java.util.Arrays;

// main class
public class SquaresOfASortedArray {

    // a method that squares each array number and returns it in a sorted non-decreasing order
    public static int[] sortedSquares(int[] A) {
        // scan the array
        for (int i = 0; i < A.length; i++) {
            // store the i-th array value
            int num = A[i];
            // square the value and assign it back to the i-th array index
            A[i] = num * num;
        }
        // use nested loops to sort the array in ascending order by comparing indexes
        for (int i = 0; i < A.length; i++) {
            // inner loop where j = i + 1;
            for (int j = i + 1; j < A.length; j++) {
                // A[i] is larger than A[j]
                if (A[i] > A[j]) {
                    // swap values between the two variables
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        // return the sorted non-decreasing array
        return A;
    }


    // main method
    public static void main(String[] args) {
        System.out.println();
        // create an array with some input values
        int arr1[] = {-4, -1, 0, 3, 10};
        // display the input array
        System.out.println("input: " + Arrays.toString(arr1)); // [-4,-1,0,3,10]
        // invoke method and print the output
        System.out.println("output: " + Arrays.toString(sortedSquares(arr1))); // [0,1,9,16,100]
        System.out.println();
        // create an array with some input values
        int arr2[] = {-7, -3, 2, 3, 11};
        // display the input array
        System.out.println("input: " + Arrays.toString(arr2)); //  [-7,-3,2,3,11]
        // invoke method and print the output
        System.out.println("output: " + Arrays.toString(sortedSquares(arr2))); // [4,9,9,49,121]
    }

}
