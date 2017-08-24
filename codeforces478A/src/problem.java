import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = new int[5];
        int sum=0,i;
        for(i=0;i<5;i++){
            number[i] = input.nextInt();
            sum+=number[i];
        }
        
        if(sum%5==0)System.out.println((sum/5));
        else System.out.println("-1");
    }
    
}
