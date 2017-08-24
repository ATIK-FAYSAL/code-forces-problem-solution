import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int div,a,b,sum,mod;
       a = input.nextInt();
       b = input.nextInt();
       sum=a;
       while(a>=b){
           mod = a%b;
           div=a/b;
           a = div+mod;
           sum=sum+a;
       }
       System.out.println(sum);
    }
}
