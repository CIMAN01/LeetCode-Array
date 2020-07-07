/*

Given a 2D grid of size m x n and an integer k. You need to shift the grid k times.

In one shift operation:

    Element at grid[i][j] moves to grid[i][j + 1].
    Element at grid[i][n - 1] moves to grid[i + 1][0].
    Element at grid[m - 1][n - 1] moves to grid[0][0].

Return the 2D grid after applying shift operation k times.


Example 1:

Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
Output: [[9,1,2],[3,4,5],[6,7,8]]


Example 2:

Input: grid = [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4
Output: [[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]


Example 3:


Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 9
Output: [[1,2,3],[4,5,6],[7,8,9]]


Constraints:

    m == grid.length
    n == grid[i].length
    1 <= m <= 50
    1 <= n <= 50
    -1000 <= grid[i][j] <= 1000
    0 <= k <= 100


Hint 1:

Simulate step by step. move grid[i][j] to grid[i][j+1]. Handle last column of the grid.

Hint 2:

Put the matrix row by row to a vector. take k % vector.length and move last k of the vector to the
beginning. Put the vector to the matrix back the same way.


*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// main class
public class Shift2DGrid {

/*

The idea is to find proper start position in original grid. Then starting from that position we can
copy every element to a new grid starting from 0,0 position. One catch is to optimize k if it's very
large. Every rows x cols shifts grid became the same, so we can do k = k % (rows x cols).

O(mxn) time - iterate over every element in the grid once, O(1) space - no extra space apart from
result grid

*/

    // a method that that takes in a grid (a 2D array of integers), shifts it, and returns the
    // grid as a list of integers
    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        // create a new ArrayList of integers
        List<List<Integer>> output = new ArrayList();
        // create rows and columns and assign them each an appropriate length
        int rows = grid.length;
        int columns = grid[0].length;
        // fill rows of result with empty lists
        for (int r = 0; r < rows; r++)
            output.add(new ArrayList());
        // every rows*columns shifts grid became the same, so cut off unnecessary shifts
        k %= (rows*columns);
        //
        int dimension = rows * columns;
        // element at (start) will be at 0,0 in new grid
        int start = dimension - k;
        // this is a counter for our new grid
        int index = 0;
        for (int i = start; i < start + dimension; i++) {
            //calculate row and cell from which we take an element for new grid
            int row = (i / columns) % rows, col = i % columns;
            //get proper new row and add new element
            output.get(index / columns).add(grid[row][col]);
            index++;
        }
        // return the ArrayList
        return output;
    }

    // main method
    public static void main(String[] args) {
        System.out.println();
        // create an array with some input values
        int grid1[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        // display the input array
        System.out.println("grid1: " + Arrays.deepToString(grid1)); // [[1,2,3],[4,5,6],[7,8,9]], k = 1
        // invoke method and print the output
        System.out.println("output1: " + shiftGrid(grid1, 1)); // [[9,1,2],[3,4,5],[6,7,8]]
        System.out.println();
        // create an array with some input values
        int grid2[][] = {{3,8,1,9}, {19,7,2,5}, {4,6,11,10}, {12,0,21,13}};
        // display the input array
        System.out.println("grid2: " + Arrays.deepToString(grid2)); // [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4
        // invoke method and print the output
        System.out.println("output2: " + shiftGrid(grid2, 4)); // [[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]
        System.out.println();
        // create an array with some input values
        int grid3[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        // display the input array
        System.out.println("grid3: " + Arrays.deepToString(grid3)); // [[1,2,3],[4,5,6],[7,8,9]], k = 9
        // invoke method and print the output
        System.out.println("output3: " + shiftGrid(grid3, 9)); // [[1,2,3],[4,5,6],[7,8,9]]
    }

}

