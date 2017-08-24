import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int len,i,sum1=0,sum2=0,a,b,result,result1;
        char ch,ch1='a';
        name = input.nextLine();
        len = name.length();
        for(i=0;i<len;i++){
            ch = name.charAt(i);
            a = ch-97;
            b = ((ch+123)-(2*97));
            if(a<0)a = a*(-1);
            else if (b<0)b = b*(-1);
            //System.out.println((a+1)+" "+(b+1));
            ch1 = ch;
            result = (ch1-97)-a;
            result1 = (ch1-97)-b;
            System.out.println(result+"  "+result1);
        }
        //System.out.println(sum1);
    }
    
}
