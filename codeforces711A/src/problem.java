import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String word;
       int count=0,count1=0;
       int i,test_case,j=1;
       test_case = input.nextInt();
       while(j<=test_case){
           word = input.next();
           if((word.charAt(0)=='O'&&word.charAt(1)=='O'))count1++;
           else if(word.charAt(3)=='O'&&word.charAt(4)=='O')count1++;
           else {
               count++;
           }
           j++;
       }
    }
    
}
System.out.println("YES\n"+"++|"+word.charAt(3)+word.charAt(4));
System.out.println("YES\n"+word.charAt(0)+word.charAt(2)+"|++");