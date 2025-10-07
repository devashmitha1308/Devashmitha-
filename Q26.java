//Q26. The Magical Scrolls (Linear Search Return Index)
//In the royal library, scrolls are arranged in a 2D cabinet of size n x m.Find the row and column of the scroll with ID = target. If not found, return (-1,-1).
//● Input:
//matrix = [[10,20,30], [40,50,60], [70,80,90]] target = 60
//● Output: (1,2) ● Constraints: 1 ≤ n,m ≤ 1000

//CODE
public class Q26 {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        int target = 60;

        int[] position = findScroll(matrix, target);
        System.out.println("(" + position[0] + "," + position[1] + ")");
    }

    public static int[] findScroll(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }
}