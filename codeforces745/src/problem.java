import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String word,copy;
       //String[] word1 = new String[1000];
       //String word1;
       char[] word1 = new char[1000];
       int j,i,count=0,len,t=0;
       word = input.nextLine();
       len = word.length();
       copy = word;
       while(t<0){
           j=0;
           for(i=0;i<len;i++){
              if(j==0){
                  word1[0] = new Character(word.charAt(len-1));
              }
              else if(j==1)word1[1] = new Character(word.charAt(1));
              else {
                  word1[j] = new Character(word.charAt(i));
                  j++;
              }
           }
           int check;
           //check = copy.compareTo(word1);
       }
    }
    
}
