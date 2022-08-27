import java.util.*;
public class maxSumOfRectangleNoLargerThenK{

    public static int driverFunction(int [][] grid , int k){
        int row = grid.length;
        int col = grid[0].length;

        int max = Integer.MIN_VALUE;

        for(int i =0; i<row; i++){
          int [] colSum = new int[col];
          for(int j =i; j<row; j++){
            for(int c = 0; c<col; c++){
                  colSum[c] +=  grid[j][c];
            }
            max = Math.max(max, findPrefixSum(colSum, k));
          }
        }
        return max;
    }



    public static int findPrefixSum(int [] arr , int k){

        TreeSet<Integer> set  = new TreeSet<>();
        int result = Integer.MIN_VALUE;
        int prefixSum = 0;
        for(int i =0; i<arr.length; i++){
           prefixSum += arr[i];
           Integer target = set.ceiling(prefixSum-k);
           if(target!=null){
            result = Math.max(prefixSum-target, result);
           }
           set.add(prefixSum);
        } 
        return result;
    }
}