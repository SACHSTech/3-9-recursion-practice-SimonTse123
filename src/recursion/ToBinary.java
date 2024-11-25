package recursion;

public class ToBinary {
    public static void toBinary(int n) {
        if(n == 1) {
             System.out.print(n);
        } else {
            toBinary(n/2);
            System.out.print(n % 2);
        }
    }
    public static void main(String[] args) {
        toBinary(4); 
    }
}
