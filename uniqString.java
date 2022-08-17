import java.util.*;
public class uniqString {
    
    // is me mujhe ek string deh dii gayi hai
    // and i need to return character with min frequecy 
    // appearing first.

    public static int minFreq(String str){
        int n = str.length();
       HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0; i<n; i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
       }
       for(int  i =0; i<n; i++){
        if(map.get(str.charAt(i))==1)
        return i;
       }
       return -1;
    }


}
