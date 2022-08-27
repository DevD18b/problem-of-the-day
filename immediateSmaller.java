public class immediateSmaller {
public static void findImmediateSmaller(int [] arr , int n){
for(int i =0;i<n-1; i++){
    if(arr[i]>arr[i+1]){
        arr[i] = arr[i+1];
    }
}
arr[n-1] = -1; 
}
public static void main(String [] args){
    int [] arr = {5,4,3,2,1};
    findImmediateSmaller(arr, arr.length);
    for(int i: arr){
        System.out.print(i+" ");
    }
}    
}
