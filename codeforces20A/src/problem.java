import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
       Scanner input1 = new Scanner(System.in);
       String input;
       int len,i;
       input = input1.nextLine();
       len = input.length();
       for(i=0;i<len;i++){
           if(input.charAt(i)=='/'&&input.charAt(i+1)=='/')System.out.print("/");
           else System.out.print(input.charAt(i));
       }
    }
    
}
