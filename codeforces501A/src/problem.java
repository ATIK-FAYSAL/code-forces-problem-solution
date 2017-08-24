import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c,d,res1,res2,res3,res4;
        int max1,max2;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        res1 = (3*a)/10;
        res2 = (a-(a/250)*c);
        res3 = (3*b)/10;
        res4 = (b-(b/250)*d);
        max1 = Math.max(res1,res2);
        max2 = Math.max(res3,res4);
        if(max1>max2)System.out.println("Misha");
        else if (max1<max2)System.out.println("Vasya");
        else System.out.println("Tie");
    }
    
}
