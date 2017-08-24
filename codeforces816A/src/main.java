import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str,revers="";
        String[] value;
        int number1,number2;
        str = input.nextLine();
        value = str.split(":");
        for(int i=value[0].length()-1;i>=0;i--)revers+=value[0].charAt(i);
        number1 = Integer.parseInt(revers);
        number2 = Integer.parseInt(value[1]);
        int sub;
        sub = number1-number2;
        if(sub<0)sub = 1440+sub;
        System.out.println(sub);
    }
    
}
