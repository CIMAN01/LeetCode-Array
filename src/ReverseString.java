/*

Write a method that reverses a string. The input string is given as an array of characters char[].

Do not allocate extra space for another array, you must do this by modifying the input array in-place
with O(1) extra memory.

You may assume all the characters consist of printable ascii characters.

Example 1:

Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:

Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

Hint:

The entire logic for reversing a string is based on using the opposite directional two-pointer approach!

*/

import java.util.Arrays;

// main class
public class ReverseString {

    // a method that reverses an array of characters by modifying the input array itself
    public static char[] reverseString(char[] ch) {
        // loop through the input array using two-pointer approach
        for (int i = 0, j = ch.length - 1; i < j; ) {
            // create a temporary variable and swap values
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            // update/move the pointers
            i++; // move index i to right by incrementing it
            j--; // and move index j to left by decrementing it
        }
        // return the array
        return ch;
    }

    // main method
    public static void main(String[] args) {
        System.out.println();
        // input: ["h","e","l","l","o"]
        char[] example1 = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("original string: " + Arrays.toString(example1));
        // output: ["o","l","l","e","h"]
        System.out.println("string reversed: " + Arrays.toString(reverseString(example1)));
        System.out.println();
        // input: ["H","a","n","n","a","h"]
        char[] example2 = {'H','a','n','n','a','h'};
        System.out.println("original string: " + Arrays.toString(example2));
        // output: ["h","a","n","n","a","H"]
        System.out.println("string reversed: " + Arrays.toString(reverseString(example2)));
    }

}
