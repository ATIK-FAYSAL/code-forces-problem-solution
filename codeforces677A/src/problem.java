import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,h;
        n = input.nextInt();
        h = input.nextInt();
        int[] number = new int[n];
        int i,sum=0;
        for(i=0;i<n;i++){
            number[i] = input.nextInt();
            if(number[i]>h)sum+=2;
            else sum+=1;
        }
        System.out.println(sum);
    }
    
}
