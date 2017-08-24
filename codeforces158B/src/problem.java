import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,n;
        int[] number = new int[100000];
        int sum=0;
        n = input.nextInt();
        for(i=0;i<n;i++){
            number[i] = input.nextInt();
            sum+=number[i];
        }
        if(sum%4!=0)System.out.println((sum/4)+1);
        else System.out.println(sum/4);
    }
    
}
