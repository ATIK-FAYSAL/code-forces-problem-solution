import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int a,b,c,count=0,sum;
       a = input.nextInt();
       b = input.nextInt();
       c = input.nextInt();
       while(a>=1&&b>=2&&c>=4){
           count++;
           a = a-1;
           b = b-2;
           c = c-4;
       }
       sum = 1*count+2*count+4*count;
       System.out.println(sum);
    }
    
}
