import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c,mini,mx;
        int mini1,mx1;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        mini = Math.min(a,b);
        mini = Math.min(mini, c);
        mx = Math.max(a,b);
        mx = Math.max(mx, c);
        System.out.println((mx-mini));
    }
    
}
