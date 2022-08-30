import java.util.*;
public class minRemovalToMakeStringValid {

    public static int getMinRemoval(String str){
        int open =   0;
        int close  = 0;

        for(int i =0; i<str.length(); i++){
            if(str.charAt(i)=='('){
                open++;
            }
            if(str.charAt(i)==')'){
                if(open==0){
                    close++;
                }
                else{
                    open--;
                }
            }
            
        }
        return open+close;
    }


    public static void dfs(String input , int index, int open , String processed,int minRemoval , HashSet<String> set){


        if(index == input.length()){
            if(minRemoval==0 && open==0)
            set.add(processed);
            return;
        }

        if(minRemoval<0) return;

        char ch = input.charAt(index);
        String append = processed+ch;

        if(ch == '('){
            dfs(input, index+1, open+1, processed, minRemoval, set);
            dfs(input, index+1, open, processed, minRemoval-1, set);
        }
        else if(ch==')'){
            if(open>0)
               dfs(input, index+1, open-1, processed, minRemoval, set);
               dfs(input, index+1, open, processed, minRemoval-1, set);
        }
        else{
            dfs(input, index+1, open, processed, minRemoval, set);
        }
    }

public static List<String> find(String str){

HashSet<String> set = new HashSet<>();
int min = getMinRemoval(str);
dfs(str, 0, 0, "", min, set);
return  new ArrayList<>(set);
}





    
}
