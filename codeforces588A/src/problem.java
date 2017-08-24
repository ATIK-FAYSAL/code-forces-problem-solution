import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,n,count=0;
        int[] a = new int[100000];
        int[] p = new int[100000];
        n = input.nextInt();
        int min;
        a[0] = input.nextInt();
        p[0] = input.nextInt();
        min = p[0];
        count = a[0]*p[0];
        for(i=1;i<n;i++){
            a[i] = input.nextInt();
            p[i] = input.nextInt();
            if(p[i]>min){
                count+=a[i]*min;
               
            }
            else {
                count+=a[i]*p[i];
                min = p[i];
            }
        }
        System.out.println(count);
    }
    
}
