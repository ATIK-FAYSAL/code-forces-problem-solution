import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,k,i;
        n = input.nextInt();
        k = input.nextInt();
        System.out.println(((n/k+1)*k));
    }
    
}
