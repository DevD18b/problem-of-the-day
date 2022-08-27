public class reorder {
    public boolean reorderedPowerOf2(int n) {
        String str = Integer.toString(n);

       int len  = str.length();

       int [] arr = new int[len];

       for(int i =0; i<len; i++)
           arr[i] = str.charAt(i)-'0';
       

           return permutation(arr,0);

   }
   
   public static void swap(int [] arr , int i , int j){
       int temp  = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
   }
   
   public static boolean isPowerOfTwo(int [] arr){
       if(arr[0]==0) return false;
       
       int n= 0;
       for(int i:arr){
           n = n*10+i;
       }
       while((n>0) && ((n&1)==0))
       n>>=1;

       return n==1;
   }
    public static boolean permutation(int [] arr , int index){

       if(index == arr.length){
           return isPowerOfTwo(arr);
       }

       for(int i = index; i<arr.length; i++){
           swap(arr , index, i );
           if(permutation(arr, index+1)) return true;
           swap(arr, index, i);
       }


return false;
   }

}
