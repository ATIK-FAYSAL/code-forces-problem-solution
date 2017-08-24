import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;
        int len,i,h=0,e=0,l=0,o=0;
        word = input.nextLine();
        len = word.length();
        for(i=0;i<len;i++){
            if(word.charAt(i)=='h'){
                h = i;
                break;
            }
        }
        for(i=0;i<len;i++){
            if(word.charAt(i)=='e'){
                e = i;
                break;
            }
        }
        for(i=0;i<len;i++){
            if(word.charAt(i)=='l'){
                l = i;
                break;
            }
        }
        for(i=0;i<len;i++){
            if(word.charAt(i)=='o'){
                o = i;
                break;
            }
        }
        if(h<e&&e<l&&l<o)System.out.println("YES");
        else System.out.println("NO");
    }
    
}
