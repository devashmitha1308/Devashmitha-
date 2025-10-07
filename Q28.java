//Q28. The Queen’s Jewels (Binary Search First Occurrence)
//The Queen’s jewels are stored in a 2D sorted grid. She wants to find the first position of a jewel type x.
//● Input: matrix = [[1,2,2], [3,4,4], [5,6,7]] target = 4
//● Output: (1,1)
//● Constraints: 1 ≤ n,m ≤ 1000

//Code
public class Q28{
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 2},
                {3, 4, 4},
                {5, 6, 7}
        };
        int target = 4;

        int[] pos = firstOccurrence(matrix, target);
        System.out.println("(" + pos[0] + "," + pos[1] + ")");
    }

    public static int[] firstOccurrence(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int left = 0, right = n * m - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / m;
            int col = mid % m;

            if (matrix[row][col] == target) {
                result = mid;
                right = mid - 1;
            } else if (matrix[row][col] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (result == -1) return new int[]{-1, -1};
        return new int[]{result / m, result % m};
    }
}