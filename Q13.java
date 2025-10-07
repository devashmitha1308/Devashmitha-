//Q13. The Sorcerer’s Spell
//Reverse a string using recursion.
//● Input: abc
//● Output: cba

//CODE
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String reversed = reverseString(str);
        System.out.println(reversed);

        sc.close();
    }


    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return "";
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}