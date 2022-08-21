import java.util.*;
public class minStamppingProblem{
    public static int [] find(String stamp , String target){
        char [] stampArray = stamp.toCharArray();
        char [] targetArray = target.toCharArray();

        int count = 0;
        List<Integer>list = new ArrayList<>();
        boolean [] visited = new boolean[targetArray.length];
        while(count!=targetArray.length){
            boolean didChange  = false;
            for(int i =0; i<targetArray.length-stampArray.length; i++){
                if(!visited[i] && canReplace(targetArray , i, stampArray)){
                    count = replace(targetArray , i , stampArray.length,count);
                    visited[i] = true;
                    didChange = true;
                if(count==targetArray.length){
                    break;
                }
                }
            }
            if(didChange==false){
                return new int[0];
            }
        }
int [] res = new int[list.size()];
int k =0;

for(int i =list.size()-1; i>=0; i--){
res[k++]=list.get(i);
}
return res;
    }
    public static boolean canReplace(char[] target, int pos , char[] stampArray){


        for(int  i =0; i<stampArray.length; i++) {
          if(target[i+pos]!='?' && target[i+pos]!=stampArray[i]){
            return false;
          }   
        }
        return true;



    }
    public static int replace(char [] targetArray , int pos , int n , int count){
        for(int i =0; i<n; i++){
            if(targetArray[pos+i]!='?'){
                targetArray[pos+i]='?';
                count++;
            }
            
        }
        return count;
    }
}
