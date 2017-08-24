import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n,s,sum=0,i;
       boolean flag = false;
       int[] number = new int[10000];
       n = input.nextInt();
       s = input.nextInt();
       int temp,j;
       for(i=0;i<n;i++)number[i] = input.nextInt();
       for(i=0;i<n;i++){
           for(j=i+1;j<n;j++){
               if(number[i]>number[j]){
                   temp = number[i];
                   number[i] = number[j];
                   number[j] = temp;
               }
           }
       }
       for(i=0;i<n-1;i++){
           sum+=number[i];
           if(sum>s){
               flag = true;
               break;
           }
       }
       if(flag == true)System.out.println("NO");
       else System.out.println("YES");
    }
    
}
