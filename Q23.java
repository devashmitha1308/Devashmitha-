//Q23.The smallest element ≥ target (actual value, not index).
// If no such element exists → return -1.
//Example    Array = [1, 2, 4, 6, 6, 8], target = 5
//      ● Ceil = 6.
//      Array = [1, 2, 4, 6, 6, 8], target = 9
//      ● Ceil = -1 (no element ≥ 9).

//CODE
public class Q23{
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 6, 8};
        int target1 = 5;
        int target2 = 9;

        System.out.println(findCeil(arr, target1));
        System.out.println(findCeil(arr, target2));
    }

    public static int findCeil(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] >= target) {
                result = arr[mid];
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }
}