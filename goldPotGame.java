public class goldPotGame{

    // Two players X and Y are playing a game in which there are pots
    //  of gold arranged in a line, each containing some gold coins. They get alternating 
    //  turns in which the player can pick a pot from one of the ends of the line.
    //   The winner is the player who has a higher number of coins at the end. 
    //   The objective is to maximize the number of coins collected by X, assuming Y also plays optimally.
    //   Return the maximum coins X could get while playing the game. Initially, X starts the game.
public static int earnMaximumCoins(int [] arr , int n){
// i will be writting the recursive approach first of all.
// there are two player. who can choose coins of any choice they want.
// so lets give them choice to pick either from the extreme left or extreme right.
return solver(0 , arr.length-1 , arr);

}

public  static int tabulation(int [] arr , int n){
    int [][] dp = new int[n][n];

for(int goldCoin =0 ; goldCoin<n; goldCoin++){
     for(int left  = 0 , right = 0; right<n; right++){
        int option1  = 0;
        int option2  = 0;
           if(goldCoin ==0){
            dp[left][right] = arr[goldCoin];
           }
           if(goldCoin==1){
            dp[left][right] = Math.max(arr[left],arr[right]);
           }
     
           else{
             option1 = arr[left]  +  Math.min(dp[left+2][right], dp[left+1][right-1]);
             option2 = arr[right] +  Math.min(dp[left][right-2], dp[left+1][right-1]);
           }
           dp[left][right] = Math.max(option1, option2); 
    }
}
return dp[0][n-1];



}






public static int solver(int left, int right , int [] arr){
    // base case if there are only two coins left,
    // and if there are only one coins left.

     if(left==right){
        return arr[left];
     }
     if(left+1 == right){
        return Math.max(arr[left], arr[right]);
     }

      //  question comes in my mind why are am doing min and then returning the maximum of the two
       // option.
       // how --> as x's oponent i want ki woh minimum coin  choose kare there for i do minimum is both the cases.


     int option1 = Math.min(solver(left+2, right, arr), solver(left+1, right-1, arr));
     int option2 = Math.min(solver(left, right-2, arr), solver(left+1, right-1, arr));

     return Math.max(option1, option2);

}
//



public static void main(String[] args) {
    
}




}