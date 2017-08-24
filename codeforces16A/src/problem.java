import java.util.Scanner;
//import java.lang.*;
public class problem {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      String input ;
      String[] copy = new String[1000];
      int len,i,a,b,n,m;
      int p,q,x;
      n = s.nextInt();
      m = s.nextInt();
      int count=0;
      for(i=0;i<=n;i++){
          input = s.nextLine();
          x=0;
          len = input.length();
          for(p=0;p<len;p++){
              for(q=p+1;q<len;q++){
                  if(input.charAt(p)!=input.charAt(q)){
                     x=1;
                     break;
                  }
              }
          }
          if(x==0){
             System.out.println(x);
         }
      }
      //System.out.println(count);
    }
}
