import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int number1,number2,i,j=1;
       String color;
       number1 = input.nextInt();
       number2 = input.nextInt();
       int result =0;
       input.nextLine();
       while(j<=number1){
           color = input.nextLine();
           for(i = 0;i<color.length();i++){
               if(color.charAt(i)=='C'||color.charAt(i)=='M'||color.charAt(i)=='Y'){
                   result=1;
                   break;
               }
           }
           j++;
       }
       if(result==0)System.out.println("#Black&White");
       else System.out.println("#Color");
    }
}
