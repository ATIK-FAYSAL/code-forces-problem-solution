import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int stop,i,total=0;
        stop = input.nextInt();
        int[] number1 = new int[stop];
        int[] number2 = new int[stop];
        int max=0;
        for(i=0;i<stop;i++){
            number1[i] = input.nextInt();
            number2[i] = input.nextInt();
        }
        for(i=0;i<stop;i++){
            if(i==0)total=number1[0]+number2[0];
            else {
                total=total-number1[i];
                total= total+number2[i];
            }
            if(max<total)max = total;
        }
        System.out.println(max);
    }
}
