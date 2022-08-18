import java.util.*;
public class LongestSubArrayWithSumEqualsK {

 // so inside this question we are given a
 // an array and we need to return the max subarray
 // which gives sum equals to given values.

// brute force approach first.
public  static int brute(int [] arr , int val){
int  n = arr.length;
int ans = 0;
for(int i =0; i<n; i++){
    for(int j=0; j<n; j++)
    {
        int sum  =0 ;
        for(int k = i; k<j;k++){
            sum+=arr[k];    
        }
        if(sum==val){
            ans = Math.max(ans , j-i+1);
        }
    }
   
}

return ans;

}

// effective appraoch to solve this problem is using the map.

public static int longestSubArrayWithSumK(int [] arr , int k){


   HashMap<Integer,Integer> map  =  new HashMap<>();
    map.put(0, -1);
    int sum = 0;
    int ans = 0;
    int n = arr.length;
    for(int i =0; i<n; i++)
    {
        sum+=arr[i];
      
       if(!map.containsKey(sum)){
        map.put(sum , i);
       }

        if(map.containsKey(sum-k)){
          ans = Math.max(ans , map.get(sum-k));
        }
    }


    return ans;

}
}
