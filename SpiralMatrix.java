import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] matrix = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int rowBegin = 0;
        int rowEnd = N - 1;
        int colBegin = 0;
        int colEnd = M - 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {

            for (int j = colBegin; j <= colEnd; j++) {
                System.out.print(matrix[rowBegin][j] + " ");
            }
            rowBegin++;

            for (int i = rowBegin; i <= rowEnd; i++) {
                System.out.print(matrix[i][colEnd] + " ");
            }
            colEnd--;

            if (rowBegin <= rowEnd) {
                for (int j = colEnd; j >= colBegin; j--) {
                    System.out.print(matrix[rowEnd][j] + " ");
                }
                rowEnd--;
            }

            if (colBegin <= colEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    System.out.print(matrix[i][colBegin] + " ");
                }
                colBegin++;
            }
        }
    }
}