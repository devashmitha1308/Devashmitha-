//Q14. The Dragon’s Roar
//Print numbers 1 to n using recursion.
//● Input: n=5
//● Output: 1 2 3 4 5

//CODE
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printNumbers(1, n);

        sc.close();
    }

    public static void printNumbers(int current, int n) {
        if (current > n) return;
        System.out.print(current + " ");
        printNumbers(current + 1, n);
    }
}