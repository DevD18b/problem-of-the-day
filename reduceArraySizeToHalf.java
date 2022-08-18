import java.util.*;
public class reduceArraySizeToHalf {
    // we are given an array and we need to remove element.
    // in a way that new array formed.
    // given in a question that we need to remove element 
    // with most frequency in the array.

public static int reduceArray(int [] arr ){

// step1 inorder to remove the element i need to know the
// frequency of every element inside the array.

// there fore this gives me a hope to use the map
int n = arr.length;
HashMap<Integer,Integer> map = new HashMap<>();
for(int i =0; i<n; i++){
    map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
}

// step 2 now i now freq of each element . 
 
ArrayList<Integer> frequence =  new ArrayList<>(map.values());


frequence.sort(Collections.reverseOrder());

int totalFreq =  n;
int i =0;
int ans =0;

while(totalFreq>n/2){
    totalFreq = totalFreq-frequence.get(i);
    i++;
    ans++;
}
return ans;
}
}
