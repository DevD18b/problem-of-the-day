public class findIfNumberIsPowerOf4 {

public static boolean find(int n){

    if(n==0) return false;

    while(n!=1){
        if(n%4!=0){
            return false;
        }
        n/=4;
    }
    return true;
}
public static void main(String[] args) {
    System.out.println(find(18));
}



    
}
