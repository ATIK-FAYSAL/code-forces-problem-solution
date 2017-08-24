import java.util.Scanner;
public class problem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,result;
        n = input.nextInt();
        result = n/5;
        if((result*5)<n)System.out.println(result+1);
        else System.out.println(result);
    }
    
}
