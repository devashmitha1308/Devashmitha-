//Q22.The first index where the element is strictly greater than the target.
//● If all elements ≤ target → return n.
//Example    Array = [1, 2, 4, 6, 6, 8], target = 6
//         Upper bound = index 5 (first element greater than 6 is 8).
//         Array = [1, 2, 4, 6, 6, 8], target = 7
//         Upper bound = index 5 (8 is first > 7)

//CODE
public class Q22 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 6, 8};
        int target1 = 6;
        int target2 = 7;
        int target3 = 8;

        System.out.println(upperBound(arr, target1));
        System.out.println(upperBound(arr, target2));
        System.out.println(upperBound(arr, target3));
    }

    public static int upperBound(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = arr.length;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > target) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }
}