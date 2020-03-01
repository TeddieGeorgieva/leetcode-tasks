public class Substract {
    public static int subtractProductAndSum(int n) {
        int prod = 1;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            prod *= digit;
            sum += digit;
            n /= 10;
        }

        return prod - sum;
    }
    public static void main(String[] args) {
        int n = 4421;
        System.out.println(subtractProductAndSum(n));
    }
}