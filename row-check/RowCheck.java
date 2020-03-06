import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;

public class RowCheck {

    // public  static String[] findWords(String[] words){
        
    //     String[] res = new String[words.length];
    //     String[] row1 =  {
    //         "q","w","e","r","t","y","u","i","o","p"
    //     };
    //     String[] row2 = {
    //         "a","s","d","f","g","h","j","k","l"
    //     };
    //     String[] row3 = { 

    //      "z","x","c","v","b","n","m"
    //     };

    
    //     boolean isInRow = true;
    //     boolean isLetter = false;
    //     int counter = 0;
    //     for (String wordOriginal : words) {
    //         String word = wordOriginal.toLowerCase();

    //         isInRow = true;
    //         isLetter = false;

    //         for (int i = 0; i < word.length(); i++) {
    //             for (int j = 0; j < row1.length; j++) {
    //                 if (word.charAt(i) == row1[j].charAt(0) ){
    //                     isLetter=true;
    //                     break;
    //                 }
    //             }
    //             if(!isLetter){
    //                 isInRow = false;
    //                 break;
    //             }
    //             isLetter = false;
    //         }
    //         if(isInRow){
    //             //System.out.println(word);
    //             res[counter] = wordOriginal;
    //             counter++;
                
    //         }

    //         isInRow =true;
    //         isLetter = false;
    //         for (int i = 0; i < word.length(); i++) {
    //             for (int j = 0; j < row2.length; j++) {
    //                 if (word.charAt(i) == row2[j].charAt(0) ){
    //                     isLetter=true;
    //                     break;
    //                 }
    //             }
    //             if(!isLetter){
    //                 isInRow = false;
    //                 break;
    //             }
    //             isLetter = false;
    //         }
    //         if(isInRow){
    //             //System.out.println(word);
    //             res[counter] = wordOriginal;
    //             counter++;
                
    //         } 
            
    //         isInRow =true;
    //         isLetter = false;
    //         for (int i = 0; i < word.length(); i++) {
    //             for (int j = 0; j < row3.length; j++) {
    //                 if (word.charAt(i) == row3[j].charAt(0) ){
    //                     isLetter=true;
    //                     break;
    //                 }
    //             }
    //             if(!isLetter){
    //                 isInRow = false;
    //                 break;
    //             }
    //             isLetter = false;
    //         }
    //         if(isInRow){
    //             //System.out.println(word);
    //             res[counter] = wordOriginal;
    //             counter++;
                
    //         }     
    //     }
    //     String[] ans = new String[counter];
    //     for (int i = 0; i < counter; i++) {
    //         ans[i] = res[i];
    //     }
    //     return ans;
    // }

    public  static String[] findWords(String[] words){
        String[] res = new String[words.length];
        HashSet<Character> row1 =  new HashSet<>(Arrays.asList(
            'q','w','e','r','t','y','u','i','o','p'
        ));
        HashSet<Character> row2 = new HashSet<>(Arrays.asList(
            'a','s','d','f','g','h','j','k','l'
        ));
        HashSet<Character> row3 = new HashSet<>(Arrays.asList(
            'z','x','c','v','b','n','m'
        ));
        int counter = 0;
        for (String wordOriginal : words) {
            String word = wordOriginal.toLowerCase();
            boolean isRow1 = true;
            for (int i = 0; i < word.length(); i++) {
               if(! row1.contains(word.charAt(i))){
                   isRow1 = false;
                   break;
               }
            }
            if(isRow1){
                res[counter] = wordOriginal;
                counter++;
                continue;
            }

            boolean isRow2 = true;
            for (int i = 0; i < word.length(); i++) {
               if(! row2.contains(word.charAt(i))){
                   isRow2 = false;
                   break;
               }
            }
            if(isRow2){
                res[counter] = wordOriginal;
                counter++;
                continue;
            }

            boolean isRow3 = true;
            for (int i = 0; i < word.length(); i++) {
               if(! row3.contains(word.charAt(i))){
                   isRow3 = false;
                   break;
               }
            }
            if(isRow3){
                res[counter] = wordOriginal;
                counter++;
            }
        }

        String[] ans = new String[counter];
        for (int i = 0; i < counter; i++) {
            ans[i] = res[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] words={"asdfghjkl","qwertyuiop","zxcvbnm"};
        String[] res = findWords(words);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i] + ", ");
        }
    }
}