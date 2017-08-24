import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = new int[10000];
        int sum=0,i,j,avg,size;
        size = input.nextInt();
        for(i=1;i<=size;i++){
            number[i] = input.nextInt();
            sum+=number[i];
        }
        boolean[] flag = new boolean[10000];
        avg = 2*(sum/size);
        for(i=1;i<=size;i++){
            if(!flag[i]){
                for(j=i+1;j<=size;j++){
                    if(!flag[j]&&number[i]+number[j]==avg){
                        System.out.println(i+" "+j);
                        flag[i]=flag[j]=true;
                        break;
                    }
                }
            }
        }
    }
    
}
