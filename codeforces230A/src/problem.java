import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,a,i,count=0;
        int[] x = new int[10000];
        int[] y = new int[10000];
        a = input.nextInt();
        n = input.nextInt();
        for(i=0;i<n;i++){
            x[i] = input.nextInt();
            y[i] = input.nextInt();
            if(x[i]>=a)count++;
            else a+=y[i];
        }
        
        if(count>0)System.out.println("NO");
        else System.out.println("YES");
    }    
}

