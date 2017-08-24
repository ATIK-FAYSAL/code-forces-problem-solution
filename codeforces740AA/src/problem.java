import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n,a,b,c;
        double taka,taka1;
        n = input.nextDouble();
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        if((n+1)%4==0)System.out.printf("%.0f\n",a);
        else if ((n+2)%4==0){
            taka = a*2;
            if(taka<b)System.out.printf("%.0f\n",taka);
            else System.out.printf("%.0f\n",b);
        }
        else if((n+3)%4==0){
            taka = a*3;
            taka1 = a+b;
            if(taka<c&&taka<taka1)System.out.printf("%.0f\n",taka);
            else if(taka1<taka&&taka1<c)System.out.printf("%.0f\n",taka1);
            else if(c<taka&&c<taka1)System.out.printf("%.0f\n",c);
        }
        else if((n+0)%4==0)System.out.println("0");
    }
}
