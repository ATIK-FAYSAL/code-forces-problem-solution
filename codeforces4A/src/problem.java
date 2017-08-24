import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        number = input.nextInt();
        if(number%2 ==0)System.out.println("YES");
        else System.out.println("NO");
    }
    
}
