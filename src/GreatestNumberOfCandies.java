/*

Given the array candies and the integer extraCandies, where candies[i] represents the number of candies
that the ith kid has.

For each kid check if there is a way to distribute extraCandies among the kids such that he or she can
have the greatest number of candies among them. Notice that multiple kids can have the greatest number
of candies.

Example 1:

Input: candies = [2,3,5,1,3], extraCandies = 3

Output: [true,true,true,false,true]

Explanation:

Kid 1 has 2 candies and if he or she receives all extra candies (3) will have 5 candies --- the greatest
number of candies among the kids.

Kid 2 has 3 candies and if he or she receives at least 2 extra candies will have the greatest number of
candies among the kids.

Kid 3 has 5 candies and this is already the greatest number of candies among the kids.

Kid 4 has 1 candy and even if he or she receives all extra candies will only have 4 candies.

Kid 5 has 3 candies and if he or she receives at least 2 extra candies will have the greatest number of
candies among the kids.

Example 2:

Input: candies = [4,2,1,1,2], extraCandies = 1

Output: [true,false,false,false,false]

Explanation: There is only 1 extra candy, therefore only kid 1 will have the greatest number of candies
among the kids regardless of who takes the extra candy.

Example 3:

Input: candies = [12,1,12], extraCandies = 10

Output: [true,false,true]


Constraints:

    2 <= candies.length <= 100
    1 <= candies[i] <= 100
    1 <= extraCandies <= 50

Hint:

Use greedy approach. For each kid check if candies[i] + extraCandies ≥ maximum in Candies[i].

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// main class
public class GreatestNumberOfCandies {

    // a method that checks whether or not each kid has the greatest amount of candies
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ///////////////////////////////////////////////////
        // find the maximum number of candies a kid has //
        //////////////////////////////////////////////////
        // create variable and initialize to 0
        int max = 0;
        // loop through the array to find max
        for (int i = 0; i < candies.length; i++) {
            // if the i-th value is bigger than the current max
            if (candies[i] > max) {
                // assign max that value
                max = candies[i];
            }
        }
        // create a new ArrayList
        List<Boolean> output = new ArrayList<>();
        // loop through the array and compare if the number of candies the kid already has plus the
        // number of extra candies given is greater than max, and if so add true to the list, otherwise
        // add false instead
        for (int i = 0; i < candies.length; i++) {
            // use greedy approach: candies[i] + extraCandies ≥ maximum in Candies[i]
            output.add(candies[i] + extraCandies >= max);
        }
        // return the boolean list
        return output;
    }

    // main method
    public static void main(String[] args) {
        System.out.println();
        // input: candies = [2, 3, 5, 1, 3], extraCandies = 3
        int[] candies1 = {2, 3, 5, 1, 3};
        int extraCandies1 = 3;
        System.out.println("candies = "+Arrays.toString(candies1)+", extra candies: "+extraCandies1);
        // output: [true, true, true, false, true]
        System.out.println("result = " + kidsWithCandies(candies1, extraCandies1));
        System.out.println();
        // input: candies = [4, 2, 1, 1, 2], extraCandies = 1
        int[] candies2 = {4, 2, 1, 1, 2};
        int extraCandies2 = 1;
        System.out.println("candies = "+Arrays.toString(candies2)+", extra candies: "+extraCandies2);
        // output: [true, false, false, false, false]
        System.out.println("result = " + kidsWithCandies(candies2, extraCandies2));
        System.out.println();
        // input: candies = [12, 1, 12], extraCandies = 10
        int[] candies3 = {12, 1, 12};
        int extraCandies3 = 10;
        System.out.println("candies = "+Arrays.toString(candies3)+", extra candies: "+extraCandies3);
        // output: [true, false, true]
        System.out.println("result = " + kidsWithCandies(candies3, extraCandies3));
    }

}
