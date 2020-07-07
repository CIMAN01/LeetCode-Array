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
public class ElementAppearingMoreThanAQuarterInSortedArray {

    // a method that
    public static int findSpecialInteger(int[] arr) {

        // write code here

        return -1;
    }

    // main method
    public static void main(String[] args) {
        System.out.println();
        // create an array with some input values
        int arr1[] = {-4, -1, 0, 3, 10};
        // display the input array
        System.out.println("input: " + Arrays.toString(arr1)); // [-4,-1,0,3,10]
        // invoke method and print the output
        System.out.println("output: " + findSpecialInteger(arr1)); // [0,1,9,16,100]
        System.out.println();
        // create an array with some input values
        int arr2[] = {-7, -3, 2, 3, 11};
        // display the input array
        System.out.println("input: " + Arrays.toString(arr2)); //  [-7,-3,2,3,11]
        // invoke method and print the output
        System.out.println("output: " + findSpecialInteger(arr2)); // [4,9,9,49,121]
    }

}
