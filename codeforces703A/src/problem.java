import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int round,a,b,a1=0,b1=0,j=1;
        round = input.nextInt();
        while(j<=round){
            a = input.nextInt();
            b = input.nextInt();
            if(a>b)a1++;
            else if(b>a)b1++;
            j++;
        }
        if(a1>b1)System.out.println("Mishka");
        else if(b1>a1)System.out.println("Chris");
        else if(a1==b1)System.out.println("Friendship is magic!^^");
    }
}
