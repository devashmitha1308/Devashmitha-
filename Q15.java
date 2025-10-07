//Q15. The Hidden Chamber
//Find sum of array elements using recursion.
//● Input: arr=[1,2,3,4]
//● Output: 10


//CODE
public class Q15 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int sum = sumArray(arr, arr.length); // pass array and its size
        System.out.println(sum);
    }

    // Recursive function to find sum
    public static int sumArray(int[] arr, int n) {
        if (n == 0) return 0; // base case
        return sumArray(arr, n - 1) + arr[n - 1]; // sum of first n-1 elements + last element
    }
}