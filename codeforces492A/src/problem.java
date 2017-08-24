import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int j,number,i,sum=0;
       number = input.nextInt();
       if(number==1)System.out.println("1");
       else {
           for(i=1;i<=number;i++){
           for(j=1;j<=i;j++){
               sum+=j;
           }
           if(sum>number){
               System.out.println((i-1));
               break;
           }
       }
       }
    }
    
}
