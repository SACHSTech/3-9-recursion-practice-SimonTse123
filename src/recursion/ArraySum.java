package recursion;

public class ArraySum {
    public static int sumArray(int[] arr, int n) {
        if(n > arr.length || n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else {
            return arr[n -1] + sumArray(arr, n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(sumArray(new int[]{1, 2, 3, 4},4)); // Output: 10
    }
}
