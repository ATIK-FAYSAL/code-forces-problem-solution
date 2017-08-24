import java.util.Scanner;
public class problem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n,i,count=0;
        int[] number = new int[100000];
        int[] zero = new int[1000];
        int x=0,zerocount=0,onecount=0;
        n = input.nextInt();
        for(i=0;i<n;i++){
            number[i] = input.nextInt();
        }
        int j,count1=0;
        for(i=0;i<n-1;i++){
            for(j=i;j<=i+1;j++){
                if(number[i]==0&&number[j]==1||number[i]==1&&number[j]==1||number[i]==1&&number[j]==0)count++;
            }
        }
        //System.out.println(count1);
        System.out.println(count);
        //System.out.println(zerocount);
        //System.out.println(count+zerocount);
    }
    
}
