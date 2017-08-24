import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String a,b;
       int len,i=0,j=0;
       a = input.nextLine();
       b = input.nextLine();
       len = a.length();
       int len1;
       len1 = b.length();
       int count=0,p=0,count1=0;
       int mini,maxi;
       mini = Math.min(len, len1);
       maxi = Math.max(len,len1);
       while(j<mini){
           if(a.charAt(i)!=b.charAt(j))count++;
           else count1++;
           i++;
           j++;
       }
       int res = maxi-mini;
       count=count+res;
       if(count==0)System.out.println("-1");
       else System.out.println((count+count1));
    }
    
}
