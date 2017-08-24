import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;
        char ch,ch1;
        int len,i,j,n,count=0;
        n = input.nextInt();
        word = input.next();
        len = word.length();
        for(i=0;i<len;i++){
            ch = word.charAt(i);
            ch1 = word.charAt(i+1);
            if(ch==ch1)count++;
        }
        System.out.println(count);
    }
    
}
