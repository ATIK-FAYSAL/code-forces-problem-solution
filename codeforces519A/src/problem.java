import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;
        int i,j=1,count=0,count1=0;
        while(j<=8){
            word = input.nextLine();
            for(i=0;i<word.length();i++){
                if(word.charAt(i)=='Q')count+=9;
                else if(word.charAt(i)=='R')count+=5;
                else if(word.charAt(i)=='B'||word.charAt(i)=='N')count+=3;
                else if(word.charAt(i)=='P')count+=1;
                else if(word.charAt(i)=='K')count+=0;
                if(word.charAt(i)=='q')count1+=9;
                else if(word.charAt(i)=='r')count1+=5;
                else if(word.charAt(i)=='b'||word.charAt(i)=='n')count1+=3;
                else if(word.charAt(i)=='p')count1+=1;
                else if(word.charAt(i)=='k')count1+=0;
            }
            j++;
        }
            if(count>count1)System.out.println("White");
            else if (count<count1)System.out.println("Black");
            else if(count==count1)System.out.println("Draw");
    }
    
}
