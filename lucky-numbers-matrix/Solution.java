import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> luckyNumbers(int[][] matrix) {

        List<Integer> res = new ArrayList<Integer>();

        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < matrix[0].length; j++) {
                max = Integer.MIN_VALUE;
                for (int a = 0; a < matrix[0].length; a++) {
                    if (matrix[i][a] < min) {
                        min = matrix[i][a];
                    }
                }

                for (int k = 0; k < matrix.length; k++) {

                    if (matrix[k][j] > max) {
                        max = matrix[k][j];
                    }
                }
                if (min == max && min == matrix[i][j]) {
                    res.add(min);
                }
            }

        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 3, 7, 8 }, { 9, 11, 13 }, { 15, 16, 17 } };
        System.out.println(luckyNumbers(matrix));

    }
}