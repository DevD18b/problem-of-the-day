import java.util.Arrays;

public class specificSortingProblem{
    // we are given a string and we need to sort it 
    // String consist of lowercase and uppercase character.
    public static String solver(String str){
     
        StringBuilder small = new StringBuilder();
        StringBuilder upper = new  StringBuilder();

      for(char ch : str.toCharArray()){
        if(Character.isUpperCase(ch)){
            small.append(ch);
        }
        else{
            upper.append(ch);
        }
      }
      
      char [] lc = small.toString().toCharArray();
      char [] uc = upper.toString().toCharArray();

       
      StringBuilder sb = new StringBuilder();

      Arrays.sort(lc);
      Arrays.sort(uc);

      int i = 0;
      int j = 0;

      for(char ch : str.toCharArray()){
 
        if(Character.isLowerCase(ch)){
          sb.append(lc[i++]);
        }
        else{
sb.append(uc[j++]);
        }


      }


      
return sb.toString();



    }
}