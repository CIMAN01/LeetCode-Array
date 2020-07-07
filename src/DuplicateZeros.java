/*

Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining
elements to the right.

Note that elements beyond the length of the original array are not written.

Do the above modifications to the input array in place, do not return anything from your function.


Example 1:

Input: [1,0,2,3,0,4,5,0]
Output: null
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]

Example 2:

Input: [1,2,3]
Output: null
Explanation: After calling your function, the input array is modified to: [1,2,3]


Note:

    1 <= arr.length <= 10000
    0 <= arr[i] <= 9


Hint 1:

This is a great introductory problem for understanding and working with the concept of in-place operations.
The problem statement clearly states that we are to modify the array in-place. That does not mean we cannot
use another array. We just don't have to return anything.


Hint 2:

A better way to solve this would be without using additional space. The only reason the problem statement
allows you to make modifications in place is that it hints at avoiding any additional memory.


Hint 3:

The main problem with not using additional memory is that we might override elements due to the zero
duplication requirement of the problem statement. How do we get around that?


Hint 4:

If we had enough space available, we would be able to accommodate all the elements properly.
The new length would be the original length of the array plus the number of zeros.
Can we use this information somehow to solve the problem?


*/


import java.util.Arrays;

// main class
public class DuplicateZeros {

    // a method that that takes in an array of integers, duplicates each occurrence of zero, and shifts the
    // remaining elements to the right.
    public static void duplicateZeros(int[] arr) {
        // traverse the array
        for (int i = 0; i < arr.length-1; i++) {
            // if any occurrences of zero is found
            if (arr[i] == 0) {
                // start from the end of the array and iterate backwards
                for (int j = arr.length-1; j > i; j--) {
                    // shift remaining elements to the right
                    arr[j] = arr[j-1];
                }
                // duplicate the zero and insert it at the next index
                arr[i+1] = 0; // this line is not needed to get desired output but kept for consistency
                // skip the new 0's
                i++; // we don't want to traverse over the duplicate zero
            }
        }
        // display the modified array
        System.out.println(Arrays.toString(arr));
    }


    // main method
    public static void main(String[] args) {
        System.out.println();
        // create two arrays with input values
        int[] arr1 = {1, 0, 2, 3, 0, 4, 5, 0}; // [1,0,2,3,0,4,5,0]
        // invoke method and display the output array
        System.out.println("modified array: ");
        duplicateZeros(arr1); // [1,0,0,2,3,0,0,4]
        System.out.println();
    }

}
