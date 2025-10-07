//Q8. The Royal Diagonal
//In a royal hall represented as a square, find sum of both diagonals.
//Input:
//3 3
//1 2 3
//4 5 6
//7 8 9
//● Output: 1+5+9 =15, 3+5+7 = 15


//CODE
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Input matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int primarySum = 0;
        int secondarySum = 0;

        for (int i = 0; i < rows; i++) {
            primarySum += matrix[i][i];
            secondarySum += matrix[i][cols - 1 - i];
        }

        System.out.println("Primary diagonal sum = " + primarySum);
        System.out.println("Secondary diagonal sum = " + secondarySum);

        sc.close();
    }
}