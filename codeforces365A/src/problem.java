import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number;
        int len,i,n,k,q=0;
        n = input.nextInt();
        k = input.nextInt();
        int[] array = new int[100000];
        int num,count,count1=0;
        while(q<=n){
             for(i=0;i<=k;i++){
                array[i] = 0;
             }
            count=0;
            number = input.nextLine();
            len = number.length();
            for(i=0;i<len;i++){
                if(number.charAt(i)>='0'&&number.charAt(i)<='9')array[number.charAt(i)-'0']++;
            }
            for(i=0;i<=k;i++){
                if(array[i]==1)count++;
            }
            if(count==k+1)count1++;
            q++;
        }  
        System.out.println(count1);
    }   
}
