//Q12. The Magical Staircase
//A child climbs 1 or 2 steps. Find number of ways to reach step n.
//● Input: n=4
//● Output: 5

//CODE
public class Q12 {
    public static void main(String[] args) {
        int n = 4;
        int ways = countWays(n);
        System.out.println(ways);
    }

    public static int countWays(int n) {
        if (n == 0 || n == 1) return 1; // base cases
        return countWays(n - 1) + countWays(n - 2);
    }
}