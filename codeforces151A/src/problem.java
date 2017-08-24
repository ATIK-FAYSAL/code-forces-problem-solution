import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,k,l,c,d,p,nl,np;
        int sum1,sum2,sum3,result;
        n = input.nextInt();
        k = input.nextInt();
        l = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        p = input.nextInt();
        nl = input.nextInt();
        np = input.nextInt();
        sum1 = (k*l)/nl;
        sum2 = c*d;
        sum3 = p/np;
        int min;
        min = Math.min(sum1,sum2);
        result = Math.min(min,sum3)/n;
        System.out.println(result);
                
    }
    
}
