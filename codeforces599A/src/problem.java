import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int d1,d2,d3;
        int sum1,sum2,sum3,sum4;
        d1 = input.nextInt();
        d2 = input.nextInt();
        d3 = input.nextInt();
            sum1 = d1+d2+d3;
            d1 = d1*2;
            d2 = d2*2;
            d3 = d3*2;
            sum2 = d1+d2;
            sum3 = d1+d3;
            sum4 = d2+d3;
        if(sum1<sum2&&sum1<sum3&&sum1<sum4)System.out.println(sum1);
        else if(sum2<sum1&&sum2<sum3&&sum2<sum4)System.out.println(sum2);
        else if(sum3<sum1&&sum3<sum2&&sum3<sum4)System.out.println(sum3);
        else if(sum4<sum1&&sum4<sum3&&sum4<sum2)System.out.println(sum4);
        else System.out.println(sum1);
    }
    
}
