import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int x,y,z;
        a = input.nextInt();
        int num = a;
       x = a/1234;
       a = a-(x*1234);
       System.out.println(x+"\n"+a);
    }
}