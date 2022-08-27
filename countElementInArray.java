import java.util.ArrayList;
import java.util.*;
public class countElementInArray {
    // Given two unsorted arrays arr1[] and arr2[].
    //  They may contain duplicates. 
    // For each element in arr1[] count 
    // elements less than or equal to it in array arr2[].
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
       // add your code here
       Arrays.sort(arr2);
       ArrayList<Integer> res = new ArrayList<>();
       for(int i = 0; i<m; i++){
           int index =  helper(arr2 , 0 , arr2.length-1 , arr1[i]);
           res.add(index+1);
       }
       return res;
    }
    
    public static int helper(int [] arr , int low , int high , int key){
        while(low<=high){
            int mid = (low+(high-low)/2);
            if(arr[mid]<=key){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return high;
    }
        
        public static void main(String[] args) {
          int   m = 6, n = 6;
         int arr1[] = {1,2,3,4,7,9};
         int  arr2[] = {0,1,2,1,1,4};

         System.out.println(countEleLessThanOrEqual(arr1, arr2, m, n));


        }
}
