import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;
        int index=0,len,i,index2=0;
        int count=0;
        word = input.nextLine();
        len = word.length();
        for(i=0;i<len;i++){
            if(word.charAt(i)=='e')index = i;
            if(word.charAt(i)=='.')index2=i;
        }
        for(int j=index+1;j<len;j++){
           count++;
        }
        for(i=0;i<len;i++){
            
        }
    }
    
}
