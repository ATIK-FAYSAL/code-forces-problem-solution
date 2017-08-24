import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1,str2;
        int n,i=1;
        n = input.nextInt();
        int count=1;
        str1 = input.next();
        str2 = str1;
        while(i<n){
            str1 = input.next();
            if(str1.equals(str2))count+=0;
            else count++;
            str2 = str1;
            i++;
        }
        System.out.println(count);
    }
    
}
