//Q25. The Treasure Map (Linear Search)
//A treasure map is represented as a grid n x m. Each cell contains a number.The King wants to know if the treasure (target) exists on the map.
//Input:
//n=3, m=3      matrix = [[1,2,3], [4,5,6], [7,8,9]]     target = 5
//● Output: Yes
//● Constraints: 1 ≤ n,m ≤ 500, -10^6 ≤ matrix[i][j] ≤ 10^6

//CODE
import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 3;
        int m = 3;
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 5;

        if (linearSearchMatrix(matrix, target)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }

    public static boolean linearSearchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}