public class DecompressEncodedList {
    public static int[] decompressRLElist(int[] nums) {
        int first = 0;
        int sec = 0;
        int length = 0;

        for (int i = 0; i < nums.length; i+=2) {
            length += nums[i];
        }

        int[] res = new int[length];
        int counter = 0;
        
        
        for (int i = 0; i < nums.length - 1; i+=2) {

            first = nums[i];
            sec = nums[i+1];            

            while (first > 0) {
                res[counter] = sec;
                first--;
                counter++;
                
                
            }
        }
        
       return res;
    }
    public static void main(String[] args) {
        int[] nums = {5,2};
        System.out.println(decompressRLElist(nums));
       
    }
}