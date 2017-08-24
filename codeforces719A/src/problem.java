import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n,i,res,res1,res2;
       int[] number = new int[100000];
       n = input.nextInt();
       for(i=0;i<n;i++){
           number[i] = input.nextInt();
       }
       if(n==1){
           if(number[0]==0)System.out.println("UP");
           else if(number[0]==15)System.out.println("DOWN");
           else System.out.println("-1");
       }
       else {
           res = number[n-1]-number[n-2];
            if((res>0&&n!=1&&number[n-1]!=15)||number[n-1]==0)System.out.println("UP");
            else if (res<0||number[n-1]==15)System.out.println("DOWN");
            else System.out.println("-1");
       }
    }
}
