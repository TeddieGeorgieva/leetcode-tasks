public class FindNumbers {
    public static int findNumbers(int[] nums) {
        int counter = 0;
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0) {
                int digit = nums[i] % 10;
                counter++;
                nums[i] /= 10;

            }
            if (counter % 2 == 0) {
                res ++;
            }
            counter = 0;
        }
        return res;
        
    }
    public static void main(String[] args) {
        int[] arr = {555,901,482,1771};
        System.out.println(findNumbers(arr));
    }
}