import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n,a,b,s;
        n = input.nextInt();
        a = input.nextInt();
        b = input.nextInt();
        s = a+b;
        if(n>=s){
            if(s<0)s=s*-1;
            if(s!=0)System.out.println(s);
            else System.out.println(n);
        }
        else {
            if(s<0)s=s*-1;
            s = s%n;
            if(s!=0)System.out.println(s);
            else System.out.println(n);
        }
    }
    
}
