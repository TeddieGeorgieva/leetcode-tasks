public class SmallerThanCurrent {
    public static void smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] > nums[j] && i != j) {
                    counter++;
                }
            }

            ans[i] = counter;
            counter = 0;
            
        }

       
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }



    }
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        smallerNumbersThanCurrent(arr);
    }
}