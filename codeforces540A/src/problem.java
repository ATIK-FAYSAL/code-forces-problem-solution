import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String input1,input2;
        int n,len,len2,i,number1,number2,sub;
        n = input.nextInt();
        input1 = input.next();
        input2 = input.next();
        len = input1.length();
        len2 = input2.length();
        int count=0;
        for(i=0;i<len;i++){
           number1 = input1.charAt(i)-'0';
           number2 = input2.charAt(i)-'0';
           sub = number1-number2;
           if(sub<0)sub*=-1;
           if(sub>5){
               if(number1>number2)count+=(10+number2)-number1;
               else if(number1<number2)count+=(10+number1)-number2;
           }
           else if(sub<=5){
               count+=sub;
           }
        }
        System.out.println(count);
    }
    
}
