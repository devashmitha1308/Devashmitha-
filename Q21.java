//Q21.The first index where the element is greater than or equal to the target.
//● If element is found → return its first occurrence.
//● If not found → return position where it can be inserted.
//● If not possible → return n (array size).
//Example        Array = [1, 2, 4, 6, 6, 8], target = 6
// Lower bound = index 3 (first 6).
// Array = [1, 2, 4, 6, 6, 8], target = 5
// Lower bound = index 3 (as 6 is the first ≥ 5)


//CODE
public class Q21{
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 6, 8};
        int target1 = 6;
        int target2 = 5;
        int target3 = 9;

        System.out.println(lowerBound(arr, target1));
        System.out.println(lowerBound(arr, target2));
        System.out.println(lowerBound(arr, target3));
    }

    public static int lowerBound(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = arr.length;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] >= target) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }
}