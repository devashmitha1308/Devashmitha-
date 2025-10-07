//Q5. The King’s Parade
//Soldiers stand in line. Check if their heights are sorted in non-decreasing order.
//● Input: arr=[1,3,5,7] → Output: true
//● Input: arr=[3,2,1] → Output: false

//CODE
public class Q5 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7}; // You can change this to test
        boolean sorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }

        System.out.println(sorted);
    }
}