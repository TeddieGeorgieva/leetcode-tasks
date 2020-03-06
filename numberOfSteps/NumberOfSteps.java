public class NumberOfSteps {

    public static boolean isEven(int n) {
        return (n % 2 == 0);
    }
    public static int numberOfSteps (int num) {
        int counter = 0;
        while (num > 0) {
        
            if (isEven(num)) {
                num /= 2;
                counter++;
            } else {
                num -= 1;
                counter++;
            }
        }
        return counter;

    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(isEven(n));
        System.out.println(numberOfSteps(123));
    }
}