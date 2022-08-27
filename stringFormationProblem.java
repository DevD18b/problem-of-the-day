import java.util.*;
public class stringFormationProblem {


    // given two string we need to find out that 
    // can we make string 1 from string 2.
    // that simply means ki are all the character inside the string 1 is present in string 2.

    public static boolean  find(String str1 , String str2){

        HashMap<Character , Integer> map = new HashMap<>();
        
       for(char ch : str2.toCharArray()){
        map.put(ch, map.getOrDefault(ch, 0)+1);
       }

       for(int i =0; i<str1.length(); i++){
           char currentCharacter = str1.charAt(i);
           if(!map.containsKey(currentCharacter) || map.get(currentCharacter)==0) return false;
           else
           map.put(currentCharacter, map.get(currentCharacter)-1);
       }
       return true;




    }

    public static void main(String[] args) {
        String str1  = "aabc";
        String str2 = "aaabbbcc";
        System.out.println(find(str1, str2));
     }
    
}
