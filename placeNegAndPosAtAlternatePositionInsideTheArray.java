import java.util.*;
public class placeNegAndPosAtAlternatePositionInsideTheArray {
    public static void rearrange(int [] arr ){
        int n = arr.length;

        ArrayList<Integer> positive =  new ArrayList<>();
        ArrayList<Integer> neg =  new ArrayList<>();

        for(int i =0; i<n; i++){
          if(arr[i]<0){
            neg.add(arr[i]);
          }
          else{
            positive.add(arr[i]);
          }
        }

        int i =0;
        int j =0;
        int k =0;
        while(j<neg.size() && i<positive.size()){
arr[k++] = positive.get(i++);
arr[k++] =  neg.get(j++);
        }
        while(i<positive.size()){
            arr[k++] = positive.get(i++);
        }
        while(j<neg.size()){
            arr[k++] = neg.get(j++);
        }
    }
    public static void main(String[] args) {
        int [] arr  ={8,-9,4,6,7,9,-7,-6,-2};
        rearrange(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }

    }
    
}
