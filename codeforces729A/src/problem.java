import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a;
        int i=0,num;
        num = input.nextInt();
        a = input.nextLine();
        while(true){
            if(a.charAt(i)=='o'){
               if(a.charAt(i+1)=='g'||a.charAt(i-1)=='g')System.out.print("*");
               else System.out.print(a.charAt(i));
            }
            else if (a.charAt(i)=='g'){
                if(a.charAt(i-1)=='o'&&a.charAt(i+1)=='o')System.out.print("*");
                else System.out.print(a.charAt(i));
            }
            i++;
            if(i==num+2){
                System.out.println();
                break;
            }
        }
    }
    
}
