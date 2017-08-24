import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,ans=0;
        number = input.nextInt();
        if((number%4==0)||(number%7==0)||(number%47==0)||(number%444==0)||(number%447==0)||(number%474==0)||(number%477==0)||(number%744==0)||(number%747==0))System.out.println("YES");
        else System.out.println("NO");
    }
    
}
