public class DuplicateZeros {
    public static void duplicateZeros(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = arr[i];
        }
        for (int i = 0, j = 0; i < res.length && j < arr.length; i++, j++) {
            arr[i] = res[j];
            if (res[j] == 0 && i !=arr.length - 1) {
                arr[i+1] = 0;
                i++;
            }
        }
    }
    //1,0,0,2,3,0,0,4
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
        for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i] +" ");
        }
       
    }
}