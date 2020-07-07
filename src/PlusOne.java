/*

Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list,
and each element in the array contains a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]

Explanation: The array represents the integer 123.

Example 2:

Input: [4,3,2,1]
Output: [4,3,2,2]

Explanation: The array represents the integer 4321.


*/


import java.util.Arrays;

// main class
public class PlusOne {
    /*
    a method that adds one to the last element in the array as long it's not the value 9
    (i.e. the right most number in the array that is not a 9 will increment by one) and any
    trailing 9's to the right of that incremented digit will be changed to 0 instead
    */
    public static int[] plusOne(int[] digits) {
        // iterate backwards over the array
        for (int i = digits.length - 1; i >= 0; i--) {
            // if the i-th array number is equal to 9
            if (digits[i] == 9) {
                // set it to 0
                digits[i] = 0;
            }
            else {
                // increment each digit (plus one)
                digits[i]++; // same as digits[i] += 1;
                // return the digits
                return digits;
            }
        }
        // create a new array of one size larger
        int[] modifiedArray = new int[digits.length + 1];
        // assign the value 1 to the first element
        modifiedArray[0] = 1;
        // return the array
        return modifiedArray;
    }


    // main method
    public static void main(String[] args) {
        System.out.println();
        // create an array with some values
        int[] digits1 = {1, 2, 3};
        // display the input
        System.out.println("input: " + Arrays.toString(digits1)); // input: [1,2,3]
        // invoke method and print the output
        System.out.println("output: " + Arrays.toString(plusOne(digits1))); // output: [1,2,4]
        System.out.println();
        // create an array with some values
        int[] digits2 = {4, 3, 2, 1};
        // display the input
        System.out.println("input: " + Arrays.toString(digits2)); // input: [4,3,2,1]
        // invoke method and print the output
        System.out.println("output: " + Arrays.toString(plusOne(digits2))); // output: [4,3,2,2]
    }

}
