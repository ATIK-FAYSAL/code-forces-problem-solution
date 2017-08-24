import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n,m,a;
        long row,col;
        n = input.nextInt();
        m = input.nextInt();
        a = input.nextInt();
       row = n/a;
       col = m/a;
       if(n%a!=0)row++;
       if(m%a!=0)col++;
       System.out.println(row*col);
    }
    
}
