//Q9. The Messenger’s Path
//A messenger wants to go from (0,0) to (n-1,m-1). Cells with 1 are blocked. Can he reach?
//Input:
//3 3
//0 0 0
//0 1 0
//0 0 0
//● Output: true


//CODE
import java.util.Scanner;

public class Q9 {

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

        boolean canReach = dfs(grid, 0, 0);
        System.out.println(canReach);

        sc.close();
    }


    public static boolean dfs(int[][] grid, int i, int j) {
        int n = grid.length;
        int m = grid[0].length;

        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == 1) {
            return false;
        }

        if (i == n - 1 && j == m - 1) {
            return true;
        }


        grid[i][j] = 1;

        if (dfs(grid, i + 1, j)) return true;
        if (dfs(grid, i - 1, j)) return true;
        if (dfs(grid, i, j + 1)) return true;
        if (dfs(grid, i, j - 1)) return true;

        return false;
    }
}