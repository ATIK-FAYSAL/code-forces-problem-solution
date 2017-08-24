import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] distance = new int[10000];
        int i,n,s,t,sum1=0,sum2=0,sum3=0;
        n = input.nextInt();
        for(i=1;i<=n;i++){
            distance[i] = input.nextInt();
        }
        s = input.nextInt();
        t = input.nextInt();
        int count=0,a,sum;
        a = t-s;
        if(a>0){
            for(i=s;i<=t;i++){
                sum1+=distance[i];
            }
            for(i=t;i<=n;i++){
                sum2+=distance[i];
            }
            for(i=1;i<=s;i++){
                sum3+=distance[i];
            }
            sum = sum2+sum3;
            if(sum1>sum)System.out.println(sum);
            else if (sum1<sum)System.out.println(sum1);
        }
        else if (a<0){
            for(i=s;i<=t;i++){
                sum1+=distance[i];
            }
            for(i=t;i<=n;i++){
                sum2+=distance[i];
            }
            for(i=1;i<=s;i++){
                sum3+=distance[i];
            }
            sum = sum2+sum3;
            if(sum1>sum)System.out.println(sum);
            else if (sum1<sum)System.out.println(sum1);
        }
        else if (a==0)System.out.println("0");
    }
}
