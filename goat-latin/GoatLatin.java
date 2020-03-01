public class GoatLatin {
    public static String toGoatLatin(String S) {

        String[] words = S.split(" "); 
        StringBuilder res = new StringBuilder();
        int counter = 1;
        for (String word : words) {
            char firstLetter = Character.toLowerCase(word.charAt(0));
            StringBuilder changedWord = new StringBuilder();
            if (firstLetter == 'a' || firstLetter == 'e'
                || firstLetter == 'i' || firstLetter == 'o' || firstLetter == 'u') {
                    changedWord.append(word);
                    changedWord.append("ma");
                   
            } else {
                char temp = word.charAt(0); 
                changedWord.append(word.substring(1, word.length()));
                changedWord.append(temp);
                changedWord.append("ma");
                
            }
            String appended = new String();
            for (int i = 0; i < counter; i++) {
                appended = appended + "a";
            }
          
            if(res.length() != 0) {
                res.append(" ");
            } 
            res.append(changedWord);
            res.append(appended);
            counter++;
        }
        return res.toString();
        
    }
    public static void main(String[] args) {
        String input = "Each word consists of lowercase and uppercase letters only";
        System.out.println(toGoatLatin(input));



        
    }

}