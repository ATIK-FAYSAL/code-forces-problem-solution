import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;
        int len,i,count=0,count1=0;
        word = input.nextLine();
        len = word.length();
        for(i=0;i<len;i++){
            if(word.charAt(i)>='a'&&word.charAt(i)<='z')count++;
            else if(word.charAt(i)>='A'&&word.charAt(i)<='Z')count1++;
        }
        if(count>=count1)System.out.println(word.toLowerCase());
        else if (count1>count)System.out.println(word.toUpperCase());
    }
    
}
