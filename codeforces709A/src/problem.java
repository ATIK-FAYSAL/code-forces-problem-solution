import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int sum=0,n,b,d,count=0,i;
       int[] number = new int[1000000];
       n = input.nextInt();
       b = input.nextInt();
       d = input.nextInt();
       for(i=0;i<n;i++){
           number[i] = input.nextInt();
       }
       for(i=0;i<n;i++){
           if(number[i]<=b)sum+=number[i];
           if(sum>d){
               count++;
               sum-=sum;
           }
       }
       System.out.println(count);
    }
    
}
