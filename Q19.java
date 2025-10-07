//Q19. The Archer’s Range
//Find the first occurrence of an arrow’s distance.
//● Input: arr=[1,2,2,2,3], key=2
//● Output: 1

//CODE
public class Q19{
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3};
        int key = 2;

        int index = firstOccurrenceBinary(arr, key);
        System.out.println(index);
    }

    public static int firstOccurrenceBinary(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                result = mid;
                right = mid - 1;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}