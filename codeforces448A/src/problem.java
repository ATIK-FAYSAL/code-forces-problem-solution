import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a1,a2,a3,b1,b2,b3,sum1,sum2,number;
        a1 = input.nextInt();
        a2 = input.nextInt();
        a3 = input.nextInt();
        b1 = input.nextInt();
        b2 = input.nextInt();
        b3 = input.nextInt();
        number = input.nextInt();
        sum1 = a1+a2+a3;
        sum2 = b1+b2+b3;
        if(sum1/number>5||sum2/number>10||number==1)System.out.println("NO");
        else System.out.println("YES");
    }
    
}
