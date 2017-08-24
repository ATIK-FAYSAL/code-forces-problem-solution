import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int m,d;
       m = input.nextInt();
       d = input.nextInt();
       if(m==1||m==3||m==5||m==7||m==8||m==10||m==12){
           if(d==6||d==7){
               System.out.println("6");
           }
           else System.out.println("5");
       }
       else if (m==4||m==6||m==9||m==11){
           if(d==7)System.out.println("6");
           else System.out.println("5");
       }
       else if(m==2){
           if(d==1)System.out.println("4");
           else System.out.println("5");
       }
    }
}
