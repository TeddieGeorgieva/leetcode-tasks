public class JewelsAndStones {
    public static int numJewelsInStones(String J, String S) {
        int counter = 0;

        for (int i = 0; i < J.length(); i++) {

            for (int k = 0; k < S.length(); k++) {
                
                if( J.charAt(i) == S.charAt(k)) {
                    counter++;
                }
            }
            
        }

        return counter;
        
    }
    public static void main(String[] args) {
        String first = "aA";
        String sec = "aAAbbbb";
        System.out.println(numJewelsInStones(first, sec));

    }
}