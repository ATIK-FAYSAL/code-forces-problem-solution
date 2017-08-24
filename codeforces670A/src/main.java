import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,i,count=0,mod;
        n = input.nextInt();
        if(n==1)System.out.println("0 1");
        else if (n==2||n==3||n==4||n==5)System.out.println("0 2");
        else if(n==6)System.out.println("1 2");
        else if(n==7)System.out.println("2 2");
        else {
            mod = n%7;
            n/=7;
            if(mod==1)System.out.println((n*2)+" "+((n*2)+1));
            else if (mod==2||mod==3||mod==4||mod==5)System.out.println((n*2)+" "+((n*2)+2));
            else if (mod==6)System.out.println(((n*2)+1)+" "+((n*2)+2));
            else if (mod==0)System.out.println((n*2)+" "+(n*2));
        }
    }
    
}
