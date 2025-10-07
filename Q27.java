//Q27. The Battle Formation (Binary Search - Flattened)
//Soldiers stand in a grid formation. Their strengths are sorted row-wise and the first element of each row is greater than the last of the previous row.The commander wants to know if a soldier with strength x exists.
//● Input:  matrix = [[1,3,5], [7,10,11], [16,20,30]]  target = 10
//● Output: True ● Constraints: 1 ≤ n,m ≤ 300

//Code
public class Q27{
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5},
                {7, 10, 11},
                {16, 20, 30}
        };
        int target = 10;

        System.out.println(searchMatrix(matrix, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int left = 0;
        int right = n * m - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / m;
            int col = mid % m;

            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}