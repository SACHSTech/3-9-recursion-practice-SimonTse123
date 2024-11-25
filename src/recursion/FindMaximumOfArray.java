package recursion;

public class FindMaximumOfArray {
    public static int findMax(int[] arr, int n) {
        if(n > arr.length || n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else {
            if(arr[n -1] > findMax(arr, n -1)) {
                return arr[n-1];
            }
            else {
                return findMax(arr, n -1);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(findMax(new int[] {1,3,2,5,4}, 3)); // Output: 15
    }
}
