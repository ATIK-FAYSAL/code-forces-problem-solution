import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n,c,count=0,i;
       int[] second = new int[1000000];
       n = input.nextInt();
       c = input.nextInt();
       for(i=0;i<n;i++){
           second[i]= input.nextInt();
       }
       for(i=0;i<n;i++){
           if(second[i+1]-second[i]<=c)count++;
           else count=0;
       }
       System.out.println(count);
    }
    
}
