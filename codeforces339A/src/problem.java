import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number;
        int len,i;
        number = input.nextLine();
        len = number.length();
        int[] array = new int[100000];
        int x=0,digit=0;
        for(i=0;i<len;i++){
            if(number.charAt(i)>='0'&&number.charAt(i)<='9'){
                array[x]=number.charAt(i)-'0';
                x++;
                digit++;
            }
        }
        int temp;
        for(i=0;i<digit;i++){
            for(x=i;x<digit;x++){
                if(array[i]>array[x]){
                    temp = array[i];
                    array[i]=array[x];
                    array[x] = temp;
                }
            }
        }
        for(i=0;i<digit;i++){
            System.out.print(array[i]);
            if(i==digit-1){
                System.out.println();
                break;
            }
            else System.out.print("+");
        }
    }
    
}
