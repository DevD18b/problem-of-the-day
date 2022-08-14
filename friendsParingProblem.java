public class friendsParingProblem {

    // meko is question n number of friends.
    // how to make them paired up in a ways 
    // that they can either be single or may present in the pairs...
    public static int friendsPairing(int n){

        return recursive(n);

    }
    public static int recursive(int n){
     
        if(n==1) return 1;

        if(n==2) return 2;

        // we have two scenarios --> 
        // either paired up.
        // either or single.

        return recursive(n-1)+(n-1)*recursive(n-2);
    }
    // memoization...
    public static int memoization(int n , int [] dp){
        if(n==1) return 1;
        if(n==2) return 2;
        
        return dp[n] =  memoization(n-1, dp)+(n-1)*memoization(n-2, dp);
    }
    // top down...
    public static int tabulation(int n){
        int [] dp = new int[n+1];
        // base case
        dp[1] = 1;
        dp[2] = 2;
        for(int i =3; i<=n; i++)
            dp[i] = dp[i-1]+(i-1)*dp[i-2];
        
            return dp[n];
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(tabulation(n));
    }



}
