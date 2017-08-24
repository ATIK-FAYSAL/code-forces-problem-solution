import java.util.Scanner;
public class problem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1,number2;
        int i,j,k,x;
        number1 = input.nextInt();
        number2 = input.nextInt();
        int y=1;
        for(i=1;i<=number1;i++){
           if(i%2!=0){
               for(j=1;j<=number2;j++){
                   System.out.print("#");
               }
           }
           else if(i%4==0){
               for(j=1;j<=number2;j++){
                   if(j==1)System.out.print("#");
                   else System.out.print(".");
               }
           }
           else {
               for(j=1;j<=number2;j++){
                   if(j==number2)System.out.print("#");
                   else System.out.print(".");
               }
           }
           System.out.print("\n");
        }
    }
    
}
