import java.util.Scanner;

public class DSA_Assignment_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];


        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // reverse each row and print
        for(int i = 0; i < N; i++) {
            for(int j = M - 1; j >= 0; j--) {
                System.out.print(arr[i][j]);
                if(j > 0) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
