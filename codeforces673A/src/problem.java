import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int j,size,i,num=0;
        int[] number = new int[10000];
        size = input.nextInt();
        for(i=0;i<size;i++)number[i] = input.nextInt();
        boolean flag = false;
        number[size]=90;
        if(number[0]>15)System.out.println(15);
        else {
            for(i=0;i<size+1;i++){
                if(number[i+1]-number[i]>15){
                    num = number[i];
                    flag = true;
                    break;
                }
            }
            if(flag==false)System.out.println("90");
            else System.out.println(num+15);
        }
    }
    
}
