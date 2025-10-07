//Q7. The Spiral Library
//The King built a library where books are kept in spiral shelves. Print them in spiral order.
//Input:
//3 3
//1 2 3
//4 5 6
//7 8 9
//● Output: [1,2,3,6,9,8,7,4,5]

//CODE
import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];


        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        List<Integer> spiral = new ArrayList<>();
        int top = 0, bottom = r - 1;
        int left = 0, right = c - 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++)
                spiral.add(arr[top][i]);
            top++;


            for (int i = top; i <= bottom; i++)
                spiral.add(arr[i][right]);
            right--;


            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    spiral.add(arr[bottom][i]);
                bottom--;
            }


            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    spiral.add(arr[i][left]);
                left++;
            }
        }

        System.out.println(spiral);
        sc.close();
    }
}