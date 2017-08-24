import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,i;
        int[] number = new int[10000];
        n = input.nextInt();
        int sum1=0,sum2=0,sum3=0;
        for(i=0;i<n;i++){
            number[i] = input.nextInt();
            if(i==0||i%3==0)sum1+=number[i];
            else if(i==1||i%3==1)sum2+=number[i];
            else if (i==2||i%3==2)sum3+=number[i];
        }
        if(sum1>sum2&&sum1>sum3)System.out.println("chest");
        else if(sum2>sum1&&sum2>sum3)System.out.println("biceps");
        else if(sum3>sum1&&sum3>sum2)System.out.println("back");
    }
    
}
