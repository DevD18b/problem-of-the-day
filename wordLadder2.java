import java.util.*;
public class wordLadder2 {
   static Set<String> set =  new HashSet<>();
 //  static  List<List<String>> list =  new ArrayList<>();
   static  String beginWord ,endWord;
   static  List<List<String>> res;
   static HashMap<String,Integer> dist;
    
    
    
    
    public static void shortest_path(){
        
        
     Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        
        dist.put(beginWord ,  0);
        
        
        while(queue.size()!=0)
        {
            String cur = queue.peek();
            if(cur.equals(endWord)) break;
            queue.poll();
            char [] curChar = cur.toCharArray();
            for(int i =0; i<cur.length(); i++){
                char ch = curChar[i];
                for(char j = 'a'; j<='z'; j++){
                    curChar[i] = j;
                    String str = new String(curChar);
                    if(set.contains(str) && dist.get(str)==null){
                        queue.offer(str);
                        dist.put(str , dist.get(cur)+1);
                    }
                }
                curChar[i] = ch;
            }
        }
    }
    
    public static void dfs(String word , List<String> path){
        if(word.equals(beginWord)){
           // path.add(word);
            List list =  new ArrayList(path);
            Collections.reverse(list);
            
            res.add(list);
            // path.remove(path.size()-1);
            return;
        }
        char [] arr = word.toCharArray();
        for(int i=0; i<word.length(); i++){
            char ch = arr[i];
            for(char j ='a'; j<='z'; j++){
                arr[i] = j;
                String str =  new String(arr);
                if(dist.get(str)!=null && dist.get(str)+1==dist.get(word)){
                    path.add(str);
                    dfs(str , path);
                    path.remove(path.size()-1);
                }
                
            }
            arr[i]=ch;
        }
    }
    
    
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        
    this.beginWord = beginWord;
    this.endWord = endWord;
    
        Queue<String> queue =  new LinkedList<>();
        
        for(String str : wordList){
            set.add(str);
        }
        
        shortest_path();
        
        if(dist.get(endWord)==null) return null;
        
        ArrayList<String> path = new ArrayList<>();
        
        path.add(endWord);
        
        dfs(endWord , path);
        return res;
    }
}
