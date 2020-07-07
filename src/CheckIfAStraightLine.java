/*

You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate
of a point. Check if these points make a straight line in the XY plane.

Example 1:

Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
Output: true

Example 2:

Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
Output: false

Constraints:

    2 <= coordinates.length <= 1000
    coordinates[i].length == 2
    -10^4 <= coordinates[i][0], coordinates[i][1] <= 10^4
    coordinates contains no duplicate point.

Hint 1: If there're only 2 points, return true.

Hint 2: Check if all other points lie on the line defined by the first 2 points.

Hint 3: Use cross product to check co-linearity.

*/


// main class
public class CheckIfAStraightLine {

    // a method that checks if coordinate points make a straight line in the XY plane
    public static boolean checkStraightLine2(int[][] coordinates) {
        // if there're only 2 points, return true
        if (coordinates.length == 2) {
            return true;
        }
        // check if all other points lie on the line defined by the first 2 points
        for (int i = 1; i < coordinates.length - 1; i++) {
            // x and y-coordinates for 3 points
            int x1 = coordinates[i - 1][0], y1 = coordinates[i - 1][1];
            int x2 = coordinates[i + 0][0], y2 = coordinates[i + 0][1];
            int x3 = coordinates[i + 1][0], y3 = coordinates[i + 1][1];
            // use cross product to check for co-linearity, if it isn't return false
            if ((y2 - y1) * (x3 - x2) != (y3 - y2) * (x2 - x1)) {
                return false;
            }
        }
        // otherwise it's on the same slope, return true
        return true;
    }

    // main method
    public static void main(String[] args) {
        // create some coordinates
        int[][] coordinates1 = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        // display the input coordinates
        System.out.println("input : " + coordinates1); // [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
        // invoke method and display the output
        System.out.println(checkStraightLine2(coordinates1));  // true
        // create some coordinates
        int[][] coordinates2 = {{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}};
        // display the input coordinates
        System.out.println("input : " + coordinates2); // [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
        // invoke method and display the output
        System.out.println(checkStraightLine2(coordinates2));  // false
    }

}
