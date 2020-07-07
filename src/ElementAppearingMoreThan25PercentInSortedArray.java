/*

Given an integer array sorted in non-decreasing order, there is exactly one integer in the
array that occurs more than 25% of the time.

Return that integer.


Example 1:

Input: arr = [1,2,2,6,6,6,6,7,10]
Output: 6


Constraints:

    1 <= arr.length <= 10^4
    0 <= arr[i] <= 10^5


Hint 1:

Divide the array in four parts [1 - 25%] [25 - 50 %] [50 - 75 %] [75% - 100%]

Hint 2:

The answer should be in one of the ends of the intervals.

Hint 3:

In order to check which is element is the answer we can count the frequency with binarySearch.


*/


import java.util.Arrays;

// main class
public class ElementAppearingMoreThan25PercentInSortedArray {

    // a method that finds a special integer in the array that occurs more than 25% of the time
    public static int findSpecialInteger(int[] arr) {
        // basic case
        if (arr.length == 0) {
            return -1;
        }
        // create a variable set to a quarter array length (binary search)
        int quarter = arr.length / 4;
        // create a frequency count and initialize it to 0
        int count = 0;
        // scan the array
        for (int i = 0; i < arr.length-1 ; i++) {
            // if two elements have the same integer (frequency)
            if (arr[i] == arr[i+1]) {
                // increment count
                count++;
                // if the integer (count) appears more than 25% of the time (quarter)
                if(count > quarter) {
                    // return the integer found at the i-th index of the array
                    return arr[i];
                }
            }
        }
        // if an element is not found, a -1 is returned
        return -1;
    }

    // main method
    public static void main(String[] args) {
        System.out.println();
        // create arrays with input values
        int arr1[] = {1, 2, 2, 6, 6, 6, 6, 7, 10};
        int arr2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // this array will return a -1
        // display the input array
        System.out.println("input: " + Arrays.toString(arr1)); // [1,2,2,6,6,6,6,7,10]
        // invoke method and print the output
        System.out.println("output: " + findSpecialInteger(arr1)); // 6
    }

}
