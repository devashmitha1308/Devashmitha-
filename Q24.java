//Q24. The largest element ≤ target.
// If no such element exists → return -1.
//Example                Array = [1, 2, 4, 6, 6, 8], target = 5
//                 Floor = 4.
//                  Array = [1, 2, 4, 6, 6, 8], target = 0
//                   Floor = -1 (no element ≤ 0).

//CODE
public class Q24{
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 6, 8};
        int target1 = 5;
        int target2 = 0;

        System.out.println(findFloor(arr, target1));
        System.out.println(findFloor(arr, target2));
    }

    public static int findFloor(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] <= target) {
                result = arr[mid];
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}