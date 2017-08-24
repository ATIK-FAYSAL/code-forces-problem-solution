import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n,m,a,b,i;
       n = input.nextInt();
       m = input.nextInt();
       a = input.nextInt();
       b = input.nextInt();
       int cost;
       if(b < m * a){
            cost = (n / m ) * b ;
            if((n % m ) * a >= b)
       	        cost += b;
	    else
		cost += (n % m) * a;
	}
	else
	   cost = n * a;
       System.out.println(cost);
    }
    
}
