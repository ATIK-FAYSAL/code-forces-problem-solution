import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,i,j,count=0;
        num = input.nextInt();
        int[] number = new int[num];
        for(i=0;i<num;i++){
            number[i] = input.nextInt();
        }
        for(i=0;i<num;i++){
            for(j=i+1;j<=i+1;j++){
                if(number[i]>=1&&number[j]==-1)count+=0;
                else count++;
            }
        }
        System.out.println(count);
    }
    
}
