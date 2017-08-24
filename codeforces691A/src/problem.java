import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10000];
        int n,i,count=0,count1=0;
        n = input.nextInt();
        for(i=0;i<n;i++){
            arr[i] = input.nextInt();
            if(arr[i]==0)count++;
            else count1++;
        }
        if(n>1){
            if(count==1)System.out.println("YES");
            else System.out.println("NO");
        }
        else {
            if(count==1)System.out.println("NO");
            else System.out.println("YES");
        }
    }
    
}
