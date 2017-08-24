import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;
        String found = "WUB";
        int len,i;
        word = input.nextLine();
        len = word.length();
        int j,ab,count=0;
        for(i=0;i<len-3;i++){
           ab=1;
           for(j=0;j<3;j++){
               if(word.charAt(i+j)!=found.charAt(j)){
                   ab=1;
                   break;
               }
           }
           if(ab==1)count++;
          // else System.out.println(word.charAt(i));
        }
        System.out.println(count);
    }
    
}
