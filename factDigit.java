import java.util.*;
public class factDigit {
    // is problem meh mujhe ek Number 
    // diya hua hai and i need to tell them ki  yeh kis ka factorial hai.

    // meri approach first of all yeh rehne waali hai ki meh sab se phele
    // fact array meh factorial store kr looh 1-->9 tk.
    public static ArrayList<Integer> driverFunction(int n){
        int [] fact = new int[10];
        Arrays.fill(fact , 1);
        for(int i =2; i<10; i++)
        {
            fact[i] = i*fact[i-1];
        }
         ArrayList<Integer> ansList =  new ArrayList<>();
         // so now ab meh ek loop chala kr check kr raha rahunga 
         // if n>=  fact[i]  so i subtract and 
         // also  i will store that index into my list.
         // so that  i can realise ki yeh number kis range meh jaah kr
         // kisi perticular number ka factorial ho sakta hai.
        for(int i = 9; i>=0;  i--){
            if(n>=fact[i]){
                n-=fact[i];
                ansList.add(i);
            }
        }
        return ansList;
            }
            public static void main(String[] args) {
                // 40320 is factorial of 8 and add 1! to it so --> 40321. 
                System.out.println(driverFunction(40321));
            }
    
}
