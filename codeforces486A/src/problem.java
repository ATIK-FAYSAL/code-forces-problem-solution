import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n;
        double sum,sum1;
        n = input.nextLong();
        if(n%2==0){
            n/=2;
            sum = (n/2)*((2*2)+(n-1)*2);
            System.out.println(sum);
            sum1 = (n/2)*((2*1)+(n-1)*2);
            System.out.println(sum1);
        }
    }
    
}
