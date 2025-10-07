

//Q16. The Ancient Scroll
//Search for a scroll ID in the archive.
//● Input: arr=[2,5,7,8], key=7
//● Output: 2

//CODE
public class Q16 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 8};
        int key = 7;

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