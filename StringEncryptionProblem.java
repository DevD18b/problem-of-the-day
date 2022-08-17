import java.util.*;
public class StringEncryptionProblem {
    public static int encodingInString(String [] str){

        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
        "..-","...-",".--","-..-","-.--","--.."};

        // i  am given a string array consisting of words.
        // i need to return unique morse code letter
        // i can create from it.

        // suppose gig and gone 
        // are two words.
        // so inorder to return the unique
        // occurance of character.
        // what i need to do is
        // i simply need to use set.
        // because i am appending 
        // same character --> like g occures both in gig ans gone
        // so doubles exist therefore we avoid this and
        // we simply use the set to maintain the unique 
        // character occureces.
       HashSet<String> set = new HashSet<>();
               for(String word : str){

            StringBuilder sb =  new StringBuilder();
            for(char ch : word.toCharArray()){
                sb.append(morse[ch-'a']);
            }
       set.add(sb.toString());     

        }

return set.size();
    }
    
}
