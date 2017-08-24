import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int sum=0,n,k,i,a=0;
        n = input.nextInt();
        k = input.nextInt();
        //hour = input.nextInt();
        for(i=1;i<=n;i++){
            sum+= i*5;
            if(((1200+k)+sum)>1440){
                a=1;
                break;
            }
        }
        if(a==1)System.out.println((i-1));
        else System.out.println(n);
    }
    
}
