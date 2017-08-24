import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,b,p,i,a,mod,count=0,sum=0;
        int match,num;
        n = input.nextInt();
        b = input.nextInt();
        p = input.nextInt();
        num = n;
        while(n>=2){
            mod=n%2;
            n=n/2;
            sum+=n+mod;
        }
        match = (sum*2*b)+sum;
        System.out.println(match+" "+(num*p));
    }
    
}
