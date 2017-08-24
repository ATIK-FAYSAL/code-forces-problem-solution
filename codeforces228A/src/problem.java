import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = new int[4];
        int i,count=0,j;
        for(i=0;i<4;i++){
            number[i] = input.nextInt();
        }
        for(i=0;i<4;i++){
            for(j=i+1;j<4;j++){
                if(number[i]==number[j]){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
    
}
