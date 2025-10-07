//Q30. The Magic Portal (Binary Search 2D)
//A wizard created portals in a 2D grid sorted in ascending order row-wise andcolumn-wise. To activate a portal, he must find a specific number x.Return "Activated" if found else "Failed".
//● Input:matrix = [[1, 2, 8], [3, 6, 10], [7, 9, 12]] target = 9
//● Output: Activated
//● Constraints: 1 ≤ n,m ≤ 500

//Code
public class Q30{
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 8},
                {3, 6, 10},
                {7, 9, 12}
        };
        int target = 9;

        System.out.println(searchPortal(matrix, target));
    }

    public static String searchPortal(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int row = 0;
        int col = m - 1;
        while (row < n && col >= 0) {
            if (matrix[row][col] == target) {
                return "Activated";
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }

        return "Failed";
    }
}