//Q11. Tower of Temples (Hanoi)
//Temples have n golden disks. Move them from source → destination using helper temple. Return moves.
//● Input: n=3
//● Output: 7


//CODE
public class Q11 {

    public static void main(String[] args) {
        int n = 3;
        int totalMoves = hanoi(n, "Source", "Destination", "Helper");
        System.out.println("Total moves: " + totalMoves);
    }

    public static int hanoi(int n, String source, String dest, String helper) {
        if (n == 0) return 0;

        int moves = 0;

        moves += hanoi(n - 1, source, helper, dest);

        System.out.println("Move disk " + n + " from " + source + " to " + dest);
        moves++;

        moves += hanoi(n - 1, helper, dest, source);

        return moves;
    }
}