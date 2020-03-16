import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> res = new ArrayList<>();
        boolean isDiv = true;
        for (int i = left; i <= right; i++) {
            int copy = i;
            while (copy != 0) {
                int digit = copy % 10;
                if (digit == 0 || i % digit != 0) {
                    isDiv = false;
                    break;
                }
                copy /= 10;
            }
            if (isDiv) {
                res.add(i);
            }
            isDiv = true;
        }
        return res;
    }

    public static void main(String[] args) {
        int left = 20;
        int right = 22;
        System.out.println(selfDividingNumbers(left, right));

    }
}