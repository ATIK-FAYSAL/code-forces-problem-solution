package codeforces.pkg405a;
import java.util.Scanner;
public class CodeForces405A {
   public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       int number ,i ; 
       String input1 = "I hate that";
       String input2 ="I love that";
       number = input.nextInt();
       if(number==1)System.out.println("I hate it");
       else if(number == 2) System.out.println("I hate that I love it");
       else if(number==3) System.out.println("I hate that I love that I hate it");
       else {
           for(i=1;i<number;i++){
               if(i%2!=0)System.out.print(input1+" ");
               else if(i%2==0)System.out.print(input2+" ");
           }
           if(number%2==0)System.out.println("I love it");
           else if(number%2!=0)System.out.println("I hate it"); 
       }
    }
}
