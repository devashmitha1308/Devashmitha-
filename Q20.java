//Q20. The Treasure Chest
//Find the last occurrence of a key using binary search.
//● Input: arr=[1,2,2,2,3], key=2
//● Output: 3

//CODE
public class Q20{
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3};
        int key = 2;

        int index = lastOccurrenceBinary(arr, key);
        System.out.println(index);
    }

    public static int lastOccurrenceBinary(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                result = mid;
                left = mid + 1;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}