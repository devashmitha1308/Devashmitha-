//Q4. The Secret Message
//A spy wrote a secret message as numbers. To decode it, reverse the array.
//● Input: arr=[1,2,3,4]
//● Output: [4,3,2,1]


//CODE
import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = {0, 1, 2, 4, 5};
        int[] rarray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            rarray[i] = array[array.length - 1 - i];
        }

        System.out.println("Reversed array: " + Arrays.toString(rarray));
        sc.close();
    }
}
