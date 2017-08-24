import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,i,len,x=0,X=0;
        String word;
        number = input.nextInt();
        input.nextLine();
        word = input.nextLine();
        len = word.length();
        char ch;
        for(i=0;i<len;i++){
            if(word.charAt(i)=='X')X++;
            else if(word.charAt(i)=='x')x++;
        }
        if(X>x)System.out.println((len/2));
        else if (x>X)System.out.println((len)/2);
        else System.out.println("0");
        if((X-x)==0){
            System.out.println(word);
        }
        else {
            for(i=0;i<len;i++){
                ch = word.charAt(i);
                if(i==0&&ch=='x'){
                    ch = (char)(ch-32);
                    System.out.print(ch);
                }
                else if (i==0&&ch=='X'){
                    ch = (char)(ch+32);
                    System.out.print(ch);
                }
                else {
                    if(i%2==0&&word.charAt(0)=='x'&&i!=0){
                        if(word.charAt(i)=='x'){
                            ch = (char)(ch-32);
                            System.out.print(ch);
                        }
                        else System.out.print(ch);
                    }
                    else if(i%2!=0&&word.charAt(0)=='X'&&i!=0){
                        if(word.charAt(i)=='X'){
                            ch = (char)(ch+32);
                            System.out.print(ch);
                        }
                        else System.out.print(X);
                    }
                }
            }
        }
        
    }
}
