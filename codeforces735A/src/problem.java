import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String str;
       int len,i,ind1=0,ind2=0;
       int n,k;
       n = input.nextInt();
       k = input.nextInt();
       str = input.next();
       len = str.length();
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
       for(i=0;i<len;i++){
           if(str.charAt(i)=='G'){
               ind1 = i;
               break;
           }
       }
       for(i=0;i<len;i++){
           if(str.charAt(i)=='T'){
               ind2 = i;
               break;
           }
       }
       if(ind1<ind2){
          
           for(i=ind1;i<=ind2;i=i+k){
               if(str.charAt(i)=='#'){
                   flag1 = true;
                   break;
               }
               else if(str.charAt(i)=='T'){
                   flag2 = true;
                   break;
               }
           }
           if(flag2==true&&flag1==false)System.out.println("YES");
           else System.out.println("NO");
       }
       else {
           for(i=ind1;i>=ind2;i=i-k){
               if(str.charAt(i)=='#'){
                   flag1 = true;
                   break;
               }
               else if(str.charAt(i)=='T'){
                   flag2 = true;
                   break;
               }
           }
           if(flag1==false&&flag2==true)System.out.println("YES");
           else System.out.println("NO");
       }
    }
    
}
