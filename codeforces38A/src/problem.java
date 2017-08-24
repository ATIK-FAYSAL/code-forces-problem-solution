import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int[] year = new int[100000];
        int[] rank =  new int[100000];
        int n,i;
        n = input.nextInt();
        for(i=0;i<n-1;i++){
            year[i] = input.nextInt();
        }
        int a,b;
        a = input.nextInt();
        b = input.nextInt();
        int sum=0,sub;
        sub = b-a;
        for(i=a-1;i<b-1;i++){
            sum+=year[i];
        }
        System.out.println(sum);
    }
}
