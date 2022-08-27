import java.util.*;
public class generateIpAddress {
    public static ArrayList<String> driver(String str){
        int n=str.length();
    for(int i =1;  i<=n-3; i++)
    {
        for(int j =1; j<=n-2; j--){
            for(int k = 1; k<=n-1; k++){
                helper(i, j , k , str);
            }
        }
    }
    return ans;



    }
    static ArrayList<String> ans = new ArrayList<>();

    public static void helper(int i ,int j , int k , String str){
        if(i>str.length() ||  i+j>str.length() || i+j+k>str.length()){
            return;
        }
        String str1 = str.substring(0,i);
        String str2 =  str.substring(i,i+j);
        if(str1.isEmpty()){
            str1 = " ";
        }
    
        String str3 = str.substring(i+j , i+j+k);
        if(str3==null){
            str2  = " ";
        }
        String str4 =  str.substring(i+j+k , str.length());
          if(str4==null){
            str4 = " ";
          }
          if(check(str1) && check(str2) && check(str3) && check(str4)){
            ans.add(str1+ "."+str2+"."+str3+"."+str4);
          }
    }
   public static boolean check(String str){
    if(str.isBlank()) return false;
    if(str.length()>3) return false;
    if(str.length()>1 && str.charAt(0)=='0') return false;
    int n = Integer.valueOf(str);
    if(n>=0 && n<=255) return true;
    else return false;
   } 
}

