public class additionOfSlargeNumbers {

    public static String add(String str1 , String str2){

        int n1 = str1.length();
        int n2 =  str2.length();
        
        str1 = new StringBuilder(str1).reverse().toString();
        str2 = new StringBuilder(str2).reverse().toString();
     
        int carry = 0;
        int sum = 0;
          String str = "";
        for(int i =0;  i<n1; i++)
        {
            sum =(int)((str1.charAt(i)-'0')+(str2.charAt(i)-'0')+carry);
            str+=(char)(sum%10+'0');
            carry=sum/10;

        }
        for(int j =n1; j<n2; j++){
            sum=(int)((str2.charAt(j)-'0')+carry);
            str+=(char)(sum%10+'0');
            carry = sum/10;
        }

          if(carry>0){
            str+=(char)(carry+'0');
          }

          str =  new StringBuilder(str).reverse().toString();
          //return str;
int i =0;
int n = str.length();
while(i<n && str.charAt(i)=='0'){
i++;   
}
if(i==n) return "0";

return str.substring(i);

}
}
