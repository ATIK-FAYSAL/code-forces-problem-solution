import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ch,word;
        int len,i;
        ch = input.nextLine();
        word = input.nextLine();
        len = word.length();
        for(i=0;i<len;i++){
            if(ch.charAt(0)=='R'){
                if(word.charAt(i)=='w')System.out.print('q');
                else if(word.charAt(i)=='e')System.out.print('w');
                else if(word.charAt(i)=='r')System.out.print('e');
                else if(word.charAt(i)=='t')System.out.print('r');
                else if(word.charAt(i)=='y')System.out.print('t');
                else if(word.charAt(i)=='u')System.out.print('y');
                else if(word.charAt(i)=='i')System.out.print('u');
                else if(word.charAt(i)=='o')System.out.print('i');
                else if(word.charAt(i)=='p')System.out.print('o');
                else if(word.charAt(i)=='s')System.out.print('a');
                else if(word.charAt(i)=='d')System.out.print('s');
                else if(word.charAt(i)=='f')System.out.print('d');
                else if(word.charAt(i)=='g')System.out.print('f');
                else if(word.charAt(i)=='h')System.out.print('g');
                else if(word.charAt(i)=='j')System.out.print('h');
                else if(word.charAt(i)=='k')System.out.print('j');
                else if(word.charAt(i)=='l')System.out.print('k');
                else if(word.charAt(i)==';')System.out.print('l');
                else if(word.charAt(i)=='x')System.out.print('z');
                else if(word.charAt(i)=='c')System.out.print('x');
                else if(word.charAt(i)=='v')System.out.print('c');
                else if(word.charAt(i)=='b')System.out.print('v');
                else if(word.charAt(i)=='n')System.out.print('b');
                else if(word.charAt(i)=='m')System.out.print('n');
                else if(word.charAt(i)==',')System.out.print('m');
                else if(word.charAt(i)=='.')System.out.print(',');
                else if(word.charAt(i)=='/')System.out.print('.');
            }
            else if(ch.charAt(0)=='L'){
                if(word.charAt(i)=='w')System.out.print('e');
                else if(word.charAt(i)=='e')System.out.print('r');
                else if(word.charAt(i)=='r')System.out.print('t');
                else if(word.charAt(i)=='t')System.out.print('y');
                else if(word.charAt(i)=='y')System.out.print('u');
                else if(word.charAt(i)=='u')System.out.print('i');
                else if(word.charAt(i)=='i')System.out.print('o');
                else if(word.charAt(i)=='o')System.out.print('p');
                else if(word.charAt(i)=='s')System.out.print('d');
                else if(word.charAt(i)=='d')System.out.print('f');
                else if(word.charAt(i)=='f')System.out.print('g');
                else if(word.charAt(i)=='g')System.out.print('h');
                else if(word.charAt(i)=='h')System.out.print('j');
                else if(word.charAt(i)=='j')System.out.print('k');
                else if(word.charAt(i)=='k')System.out.print('l');
                else if(word.charAt(i)=='l')System.out.print(';');
                else if(word.charAt(i)=='x')System.out.print('c');
                else if(word.charAt(i)=='c')System.out.print('v');
                else if(word.charAt(i)=='v')System.out.print('b');
                else if(word.charAt(i)=='b')System.out.print('n');
                else if(word.charAt(i)=='n')System.out.print('m');
                else if(word.charAt(i)=='m')System.out.print(',');
                else if(word.charAt(i)==',')System.out.print('.');
                else if(word.charAt(i)=='.')System.out.print('/');
                else if (word.charAt(i)=='q')System.out.print('w');
                else if(word.charAt(i)=='a')System.out.print('s');
                else if (word.charAt(i)=='z')System.out.print('x');
            }
            if(i==len-1)System.out.printf("\n");
        }
    }
    
}
