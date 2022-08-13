import java.util.Arrays;

public class maximumChainLength {
    // this problem can be solved in multiple. ways.
    // this problem is variation of LIS and sorting. 
    // what did we do in LIS
    //problem --> we maintain a prev pointer...
    // we consider two scenarios of either taking the current number
    // or not taking.
    // based on two of such we can think how to deal with this problem
    // there for we run loop from
    // i =n-1 to 1 and j = i-1 to -1;.here j is prev pointer.
    // and we simpply checks multiple conditions.


// this --> is almost quardratic in nature.
// on submission may give you TLE.

    static class pair{
        pair p;
        int x;
        int y;
        public int compare(pair a, pair b)
        {
            return a.x - b.x;
        }
    }

    public static int maximumLengthOfChain(pair[] arr,  int n){

         Arrays.sort(arr ,(p1,p2)->(p1.y-p2.y));
 
         int [] mcl = new int[n];
         int max = 0;

         for(int i =0; i<n; i++){
            mcl [i]=  1;
         }
         for(int i =1; i<n; i++){
            for(int j =0; j<i; j++){
                if(arr[i].x > arr[j].y && mcl[i]<mcl[j]+1)
                {
                    mcl[i] = mcl[j]+1; 
                } 
            }
         }
         for(int i =0; i<n; i++){
            if(mcl[i]<max){
                max = mcl[i];
            }
         }
         return max;
   




    }
    // log(n) approach.

    public static int maxChainLength(pair [] arr , int n){
        Arrays.sort(arr , (p1,p2)->p2.y-p1.y);

       int prev = Integer.MIN_VALUE;
       int ans  = 0;
       for(int i =0; i<n; i++){
        if(arr[i].x<prev){
            prev = arr[i].y;
            ans++;
        }
       }
       return ans;
    }
    
}
