import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number1,number2;
        number1 = new int[100000];
        number2 = new int[100000];
        int shop,j,coin,i,count;
        shop = input.nextInt();
        for(i=0;i<shop;i++){
            number1[i] = input.nextInt();
        }
        coin = input.nextInt();
        for(j=0;j<coin;j++){
            number2[j] = input.nextInt();
        }
        
        for(j=0;j<coin;j++){
            count=0;
           for(i=0;i<shop;i++){
               if(number1[i]<=number2[j])count++;
           }
           System.out.println(count);
        }
    }
    
}
