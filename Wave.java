import java.util.Scanner;

public class Wave{
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

        for (int j = 0; j < M; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < N; i++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {

                for (int i = N - 1; i >= 0; i--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }

        sc.close();
    }
}