import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len,number,count=0,count1=0;
        String word;
        number = input.nextInt();
        input.nextLine();
        word = input.nextLine();
        len = word.length();
        for(int i=0;i<len;i++){
            if(word.charAt(i)=='>')count++;
            else if (word.charAt(i)=='<')count1++;
        }
        if(count1>count)System.out.println(count1-count);
        else if(count1<count)System.out.println(count-count1);
        else System.out.println(count-count1);
    }
    
}
