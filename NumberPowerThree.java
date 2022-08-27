public class NumberPowerThree {
    public static boolean isPowerOfThree(int n){
        if(n==0) return false;
        while(n!=1){
            if(n%3!=0){
                return false;
            }
            n/=3;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 27;
        System.out.println(isPowerOfThree(n));
    }
}
