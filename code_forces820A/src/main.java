import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c,v,v1,a,l;
        int sum=0,sum1,i,count=0;
        c = input.nextInt();
        v = input.nextInt();
        v1 = input.nextInt();
        a = input.nextInt();
        l = input.nextInt();
        sum+=v;
        i=1;
        while(true)
        {
            if(sum>=c)break;
            sum1 = v+(i*a);
            sum1 = sum1-l;
            if(sum1>v1)
            {
                sum+=v1;
                sum-=l;
            }
            else sum+=sum1;
            count++;
            i++;           
        }
        System.out.println(count+1);
    }
    
}
