import java.util.Scanner;
public class problem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,i;
        int[] number;
        number = new int[10000];
        num = input.nextInt();
        int even=0,odd=0;
        for(i=0;i<num;i++){
            number[i] = input.nextInt();
            if(number[i]%2==0)even++;
            else if(number[i]%2!=0)odd++;
        }
        for(i=0;i<num;i++){
           if(even>1){
               if(number[i]%2!=0){
                   System.out.println((i+1));
                   break;
               }
           }
           else if(odd>1){
               if(number[i]%2==0){
                   System.out.println((i+1));
                   break;
               }
           }
        }
    }   
}
