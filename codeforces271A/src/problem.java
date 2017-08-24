import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        int[] number = new int[10];
        year = input.nextInt();
        while(true){
            year++;
            number[0] = year/1000;
            number[1] = year/100%10;
            number[2] = year/10%10;
            number[3] = year%10;
            if(number[0]!=number[1]&&number[0]!=number[2]&&number[0]!=number[3]&&number[1]!=number[2]&&number[1]!=number[3]&&number[2]!=number[3]){
		 break;
              }
        }
        System.out.println(year);
    }
    
}
