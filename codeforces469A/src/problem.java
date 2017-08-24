import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int level,j,p,q,i,count1=0,count=0;
        int[] number1 = new int[10000];
        int[] number2 = new int[10000];
        int[] number3 = new int[10000];
        int[] number4 = new int[10000];
        level = input.nextInt();
        for(j=0;j<level;j++){
            number4[j] = j+1;
        }
        p = input.nextInt();
        for(i=0;i<p;i++){
            number1[i] = input.nextInt();
        }
        q = input.nextInt();
        for(i=0;i<q;i++){
            number2[i] = input.nextInt();
        }
        int k,x=0;
        int size = p+q;
        for(i=0,j=0,k=0;i<size;i++){
            if(j>=p||k>=q)break;
            if(number1[j]<number2[k]){
                number3[i]=number1[j];
                j++;
            }
            else{
                number3[i]=number2[k];
                k++;
            }
        }
        while(j<p){
            number3[i]=number1[j];
            i++;
            j++;
        }
        while(k<q){
            number3[i]=number2[k];
            i++;
            k++;
        }
        for(j=0;j<level;j++){
            for(i=0;i<size;i++){
                if(number4[j]==number3[i]){
                    count++;
                    break;
                }
            }
        }
        if(count==level)System.out.println("I become the guy.");
        else System.out.println("Oh, my keyboard!");
    }
}
