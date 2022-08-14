

import java.util.*;

public class wordLadder1 {
public static int ladderLength(String beginWord , String endWord, List<String>wordList){
    Set<String> set = new HashSet<>(wordList);
    Queue<String> queue = new LinkedList<>();
    int changes =1;
    queue.offer(beginWord);
Set<String> visited = new HashSet<>();

if(!set.contains(endWord)) return 0;
    while(!queue.isEmpty()){
        int size = queue.size();
        for(int i=0; i<size; i++) {
            String word = queue.peek();
            assert word != null;
            if (word.equals(endWord)) return changes;
            for (int j = 0; j < word.length(); j++) {
                for (int k = 'a'; k <= 'z'; k++) {
                    char[] arr = word.toCharArray();
                    arr[j] = (char) k;
                    String str = new String(arr);
                    if (set.contains(str) && !visited.contains(str)) {
                        visited.add(str);
                        queue.offer(str);
                    }
                }
            }
        }
        changes++;
    }
    return 0;


}
}
