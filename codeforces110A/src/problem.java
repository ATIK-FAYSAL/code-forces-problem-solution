import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number;
        int len,i,count=0;
        number = input.nextLine();
        len = number.length();
        for(i=0;i<len;i++){
            if(number.charAt(i)=='4'||number.charAt(i)=='7')count++;
        }
        if(count==4||count==7)System.out.println("YES");
        else System.out.println("NO");
    }
    
}
