//Q29. The Hidden Scrolls (Staircase Search)
//The King hides scrolls in a 2D matrix where rows and columns are sorted.Find if a scroll with ID x exists. Use O(n+m) method (start from top-right corner).
//● Input: matrix = [[1,4,7,11], [2,5,8,12], [3,6,9,16], [10,13,14,17]]   target = 6
//● Output: True
//● Constraints: 1 ≤ n,m ≤ 1000

//CODE
public class Q29 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11},
                {2, 5, 8, 12},
                {3, 6, 9, 16},
                {10, 13, 14, 17}
        };
        int target = 6;

        System.out.println(searchScroll(matrix, target));
    }

    public static boolean searchScroll(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int row = 0;
        int col = m - 1;

        while (row < n && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }

        return false;
    }
}