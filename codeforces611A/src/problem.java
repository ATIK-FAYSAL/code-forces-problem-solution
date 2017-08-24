import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day;
        String word;
        day = input.nextInt();
        input.nextLine();
        word = input.nextLine();
        System.out.println(word.charAt(5));
    }
    
}
