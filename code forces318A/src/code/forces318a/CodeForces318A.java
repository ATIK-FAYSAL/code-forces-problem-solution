package code.forces318a;
import java.util.Scanner;
public class CodeForces318A {

    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int[] number;
        number = new int[1000];
        int count=0,i,num,num1;
        num = input.nextInt();
        num1 = input.nextInt();
        int y=0;
        for(i=1;i<=num;i++){
            if(i%2!=0){
                number[y]=i;
                y++;count++;
            }
        }
        for(i=1;i<=num;i++){
            if(i%2==0){
                number[y]=i;
                y++;count++;
            }
        }
        for(y=0;y<count;y++){
            if(y==num1-1)System.out.println(number[y]);
        }
    }   
}
