import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = new int[10000];
        int taka,max=0,i,n,total=0;
        n = input.nextInt();
        for(i=0;i<n;i++){
            number[i] = input.nextInt();
            if(max<number[i])max = number[i];
        }
        for(i=0;i<n;i++){
            total+=max-number[i];
        }
        System.out.println(total);
    }
    
}
