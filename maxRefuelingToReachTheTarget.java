import java.util.*;

public class maxRefuelingToReachTheTarget {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        int n =  stations.length;
        int [] dp  = new int[n+1];
        dp[0] = startFuel;

     for(int i =0; i<n; i++){
      
        for(int refill = i; refill>=0&&dp[refill]>=stations[i][0]; refill--){
            dp[refill+1] = Math.max(dp[refill+1],dp[refill]+stations[i][1]);
        }
     }

     for(int i =0; i<=n; i++){
        if(dp[i]>=target){
            return i;
        }
     }
     return -1;
    }
    // approach 2 for this problem
    // using the max heap priority queue.
    public static int minRefillStops(int target , int startFuel , int [][] stations){

        int n = stations.length;
         
        PriorityQueue<Integer[]> pq = new PriorityQueue<>((a,b)->b[1]-a[1];)



        int refill  =0;
        int distance  =startFuel;
        int i =0;



        while(distance<target){
            while(i<n && distance >= stations[i][0]){
                pq.add(stations[i]);
                i++;
            }
            if(pq.isEmpty()) return -1;
            distance+=pq.remove()[1];
            refill++;
        }


return -1;


    }
}
