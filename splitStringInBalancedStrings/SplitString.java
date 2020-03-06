public class SplitString {   
    public static int balancedStringSplit(String s) {
       
        int counter = 0;
        int countR = 0;
        int countL = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) =='L'){
                countL++;
            } else {
                countR++;
            }
            if (countL == countR) {
                counter++;
                countL = 0;
                countR = 0;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        String s = "RRLRRLRLLLRL";
        System.out.println(balancedStringSplit(s));
    }
}