import java.util.Scanner;
public class problem {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String name;
        int a=0,b=0,len,num,i;
        num = input.nextInt();
        input.nextLine();
        name = input.nextLine();
        len = name.length();
        for(i=0;i<len;i++){
            if(name.charAt(i)=='A'){
                a++;
            }
            else if(name.charAt(i)=='D'){
                b++;
            }
        }
        if(a>b)System.out.println("Anton");
        else if(b>a)System.out.println("Danik");
        else System.out.println("Friendship");
    }
    
}
