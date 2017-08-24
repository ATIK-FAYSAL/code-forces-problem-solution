import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int count=0,score1,score2,i=1,n;
        n = input.nextInt();
        input.nextLine();
        
        while(i<=n){
            name = input.nextLine();
            score1 = input.nextInt();
            score2 = input.nextInt();
            if(score1>=2400&&score2>score1)count++;
            i++;
        }
        if(count>=1)System.out.println("YES");
        else System.out.println("NO");
    }
    
}
