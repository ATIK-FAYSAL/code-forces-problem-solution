import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,j=0,count=0,number;
        int[] arr = new int[1000000];
        long num;
        num = input.nextLong();
        number = input.nextInt();
        for(i=1;i<=Math.sqrt(num);i++){
            if(num%i==0){
                arr[j]=i;
                j++;
            }
        }
        for(i=0;i<j;i++)System.out.print(arr[i]+" ");
    }
    
}
