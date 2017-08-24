import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int len,i;
        len = input.nextInt();
        name = input.next();
        if(len==8)System.out.println("vaporeon");
        else if(len==6)System.out.println("espeon");
        else if(name.charAt(0)=='j'||name.charAt(1)=='o'||name.charAt(3)=='t')System.out.println("jolteon");
        else if (name.charAt(0)=='l'||name.charAt(1)=='e'||name.charAt(3)=='f')System.out.println("leafeon");
        else if (name.charAt(0)=='g'||name.charAt(3)=='c')System.out.println("glaceon");
        else if (name.charAt(0)=='s'||name.charAt(1)=='y'||name.charAt(2)=='l'||name.charAt(3)=='v')System.out.println("sylveon");
        else if (name.charAt(0)=='u'||name.charAt(1)=='m'||name.charAt(2)=='b')System.out.println("umbreon");
        else if (name.charAt(0)=='f'||name.charAt(3)=='r')System.out.println("flareon");
    }
    
}
