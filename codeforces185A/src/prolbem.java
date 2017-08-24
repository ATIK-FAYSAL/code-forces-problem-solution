import java.util.Scanner;
public class prolbem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,k,count=0,num,i;
        int[] number = new int[100000];
        n = input.nextInt();
        k = input.nextInt();
        for(i=0;i<n;i++){
            number[i] = input.nextInt();
        }
        num = number[k-1];
        for(i=0;i<n;i++){
            if(number[i]>=num&&number[i]>0)count++;
        }
        System.out.println(count);
    }
    
}
