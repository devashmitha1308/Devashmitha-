//Q17. The Farmer’s Basket
//Find if a fruit (number) exists in the basket.
//● Input: arr=[10,20,30], key=25
//● Output: -1

//CODE
public class Q17 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int key = 25;

        int index = search(arr, key);
        System.out.println(index);
    }

    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }
}