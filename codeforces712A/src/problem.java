import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = new int[1000000];
        int i,size,j;
        size = input.nextInt();
        for(i=0;i<size;i++){
            number[i] = input.nextInt();
        }
        for(i=0;i<size;i++){
            for(j=i+1;j<=i+1;j++){
               System.out.print((number[j]+number[i])+" ");
            }
            if(i==size-1)System.out.println();
        }
    }
}
