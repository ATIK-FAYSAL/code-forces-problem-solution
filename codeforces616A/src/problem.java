import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word,word1;
        long  number,number1;
        word = input.nextLine();
        word1 = input.nextLine();
        number = Integer.parseInt(word);
        number1 = Integer.parseInt(word1);
        if(number>number1)System.out.println(">");
        else if (number<number1)System.out.println("<");
        else if(number1==number)System.out.println("=");
    }
    
}
