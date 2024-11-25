package recursion;

public class EvenNumbersInARange {
    public static void printEvens(int start, int end) {
        if (start > end) {
            return;
        } else {
            if(end % 2 == 0) {
                printEvens(start, end - 2);
                System.out.println(end);
            }
            else {
                printEvens(start, end - 1);
            }
        }
    }

    public static void main(String[] args) {
        printEvens(1, 11); // Output: 15
    }
}
