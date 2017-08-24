import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String word;
        int len,i,j=0,sum,k;
        k = input.nextInt();
        word = input.next();
        len = word.length();
        if(len<k)System.out.println("NO");
        else {
            System.out.println("YES");
            int sum1=0;
            for(i=1;i<=k;i++){
                sum = j;
                sum1+=len/k;
                for(j=sum;j<sum1;j++){
                    System.out.print(word.charAt(j));
                    if(j==sum1-1)System.out.println();
                }
            }
        }
    }
    
}
