/*

Given an array arr, replace every element in that array with the greatest element among
the elements to its right, and replace the last element with -1.

After doing so, return the array.


Example 1:

Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]


Constraints:

    1 <= arr.length <= 10^4
    1 <= arr[i] <= 10^5

Hint 1:

Loop through the array starting from the end.

Hint 2:

Keep the maximum value seen so far.


*/

import java.util.Arrays;

// main class
public class ReplaceElementsWithMaxNumberOnRightSide {

    // a method that replaces every element in an array with the greatest element among
    // them to its right, and replaces the last element with -1
    public static int[] replaceElements(int[] arr) {
        // create a max and assign it the last element value
        int max = arr[arr.length-1];
        /////////////////////////////////////////////////
        // find and store maximum value seen so far ////
        ///////////////////////////////////////////////
        // loop through the array starting from the end
        for (int i = arr.length-1; i >= 0; i--) {
            // create a variable that holds the current maximum value
            int currentMax = max;
            // if max is smaller than i-th element
            if (max < arr[i]) {
                // assign the maximum value to max
                max = arr[i];
            }
            // assign the current max to the i-th element
            arr[i] = currentMax; // [18,6,6,6,1,-1]
//            // for testing purposes (comparing max to currentMax for each iteration)
//            System.out.println("i: " + i  + "\t" + "currentMax: " + currentMax
//                    + "\t" + "max: " + max);

        }
        // last step is to replace the value of last array index with the value of -1
        arr[arr.length-1] = -1;
        // return the array that has had its elements replaced
        return arr;
    }

    // main method
    public static void main(String[] args) {
        System.out.println();
        // create an array with some input values
        int arr[] = {17, 18, 5, 4, 6, 1};
        // display the input
        System.out.println("input: " + Arrays.toString(arr)); // [17,18,5,4,6,1]
        // invoke method and print the output
        System.out.println("output: " + Arrays.toString(replaceElements(arr))); // [18,6,6,6,1,-1]
    }

}
