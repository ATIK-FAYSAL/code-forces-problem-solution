import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int hh,mm,sum,a;
       int hh1,mm1;
       char ch;
       hh = input.nextInt();
       ch = input.nextLine().charAt(0);
       input.nextLine().charAt(0);
       mm = input.nextInt();
       a = input.nextInt();
       sum = hh*60+mm+a;
       hh1 = sum/60;
       mm1 = sum%60;
       if(hh1==24){
           System.out.print("00:");
           if(mm1<10)System.out.println("0"+mm1);
           else System.out.println(mm1);
       }
       if(hh1<10){
           System.out.print("0"+hh1+":");
           if(mm1<10)System.out.println("0"+mm1);
           else System.out.println(mm1);
       }
       else if(hh1!=24){
           System.out.print(hh1+":");
           if(mm1<10)System.out.println("0"+mm1);
           else System.out.println(mm1);
       }
    }
    
}
