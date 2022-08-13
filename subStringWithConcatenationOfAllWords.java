import java.util.*;
public class subStringWithConcatenationOfAllWords{ 

    public static List<Integer> driverFunction(String str , String [] words)
{
int len = words.length;
int wordLength = words[0].length();
//List<Integer> list = new ArrayList<>();
Map<String,Integer> map =  new HashMap<>();
for(String word : words){
    map.put(word, map.getOrDefault(word, 0)+1);
}
List<Integer> ans = new ArrayList<>();
for(int i =0; i<str.length()-wordLength*len; i++){
    HashMap<String,Integer>copyMap = new HashMap<>(map);
    for(int j = 0; j<words.length; j++){
    String subString = str.substring(j*wordLength,j*wordLength+wordLength
    );
    int count = map.get(subString);
    if(count==1){
        copyMap.remove(subString);
    }
    else {
        copyMap.put(subString, count-1);
    }
    if(copyMap.isEmpty()){
        ans.add(i);
        break;
    }
    }
}
    return ans;







}
}