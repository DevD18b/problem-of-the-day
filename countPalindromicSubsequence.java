public class countPalindromicSubsequence {
// so am given a string --> aaba.
// i want to find out how many palindromic string 
// combination is possible.
//lets think recursively about this problem.

// ki meh usually palindromes kese generate kr pata hoon.
// final character or last character ko compare kr keh and pointers move kr keh.
// acha yeh practise meh tb tk karunga jb tk mera i<=j.

// also i belive ki agar koi character string keh palindromic subsequence ban neh meh
// contribute nhi krta so i can handle those cases...
public static int palindromicSubseq(String str){
    return helper(str , 0 , str.length()-1);
}
public static int helper(String str,  int low , int high){
    if(low>high) return 0;

    if(low==high) return str.charAt(low)==str.charAt(high)?1:0;

    if(str.charAt(low)==str.charAt(high)){
        return 1+helper(str, low+1, high)+helper(str, low, high-1);
    }
    else
        // agar character match nhi kr raha hai to meh aage keh character 
        // keh liye check kr neh ki koshis meh lagaa rahungaa..
        // but there may be substring 
        // may exist jab palindromic subsequence possible hoo.
        // so what can i do is i simply substract matched-unmatched.
        return helper(str, low+1, high)+helper(str, low, high-1)-helper(str, low+1, high-1);
    
}
// lets write the tabulation code for this problem...

public static int tabulation(String str){
    int n= str.length(); 
    int [][]  dp = new int[n][n];

    for(int i =str.length()-1; i>=0; i--){
        dp[i][i] = 1;
        // now lets think about how our next pointer j will work.
        for(int j =  i+1; j<str.length(); j++)
        {
            if(str.charAt(i)==str.charAt(j)){
                dp[i][j] = 1+dp[i+1][j]+dp[i][j-1];
            }
            else{
                dp[i][j] = dp[i+1][j]+dp[i][j-1]-dp[i+1][j-1];
            }
        }
    }
    return dp[0][str.length()-1];




}




public static void main(String [] args){
  System.out.println(tabulation("aba"));
}



}
