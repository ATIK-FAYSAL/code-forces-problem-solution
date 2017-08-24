import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,n,count=0;
        int[] a = new int[1000000];
        int[] b = new int[1000000];
        n = input.nextInt();
        for(i=0;i<n;i++){
            a[i] = input.nextInt();
            b[i] = input.nextInt();
        }
        int j,min,max;
        min = a[0];
        max = b[0];
        for(i=1;i<n;i++){
            if(a[i]<min&&max<b[i]){
                min = a[i];
                max = b[i];
            }
        }
        if(min<=max)System.out.println("Happy Alex");
        else System.out.println("Poor Alex");
    }
    
}
