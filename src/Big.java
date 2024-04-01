import java.math.BigInteger;

public class Big {
    public static BigInteger factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
    public static void displayFactorialTable(int start, int end) {
        System.out.println("Factorial Table:");
        System.out.println("n\tFactorial");
        for (int i = start; i <= end; i++) {
            System.out.println(i + "\t" + factorial(i));
        }
    }
    public static void main(String[] args) {
        displayFactorialTable(0, 30);
    }
}