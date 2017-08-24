import java.util.Scanner;
public class problem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number1,number2;
        int i,j=0;
        number1 = input.nextLine();
        number2 = input.nextLine();
        for(i=0;i<number1.length();i++){
            if(number1.charAt(i)==number2.charAt(j))System.out.print("0");
            else System.out.print("1");
            if(i==number1.length()-1)System.out.print("\n");
            j++;
        }
        
    }
    
}
