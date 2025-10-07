//Q10. The Rainwater Pond
//Count the number of water ponds in a village (1 = water, 0 = land).
//Input:
//3 3
//1 0 1
//0 1 0
//1 0 1
//● Output: 5

//CODE
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int pondCount = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    pondCount++;
                    dfs(grid, i, j, n, m);
                }
            }
        }

        System.out.println(pondCount);
        sc.close();
    }

    private static void dfs(int[][] grid, int i, int j, int n, int m) {

        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == 0) return;

        grid[i][j] = 0;

        dfs(grid, i + 1, j, n, m);
        dfs(grid, i - 1, j, n, m);
        dfs(grid, i, j + 1, n, m);
        dfs(grid, i, j - 1, n, m);
        dfs(grid, i + 1, j + 1, n, m);
        dfs(grid, i + 1, j - 1, n, m);
        dfs(grid, i - 1, j + 1, n, m);
        dfs(grid, i - 1, j - 1, n, m);
    }
}