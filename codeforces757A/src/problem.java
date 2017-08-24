import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;
        int len,i,count=0;
        int u=0,l=0,b=0,a=0,s=0,r=0;
        word = input.nextLine();
        len = word.length();
        for(i=0;i<len;i++){
            if(word.charAt(i)=='B')count++;
            else if (word.charAt(i)=='u')u++;
            else if (word.charAt(i)=='l')l++;
            else if (word.charAt(i)=='b')b++;
            else if (word.charAt(i)=='a')a++;
            else if (word.charAt(i)=='s')s++;
            else if (word.charAt(i)=='r')r++;
        }
        System.out.println("B= "+count+" u="+u+" b="+b+" l = "+l+" s="+s+" r="+r+" a="+a);
        u = u/2;
        b=b/2;
        a=a/2;
        int[] min = new int[1000];
        min[0]=count;
        min[1]=u;
        min[2]=l;
        min[3]=b;
        min[4]=a;
        min[5]=s;
        min[6]=r;
        int m;
        m = min[0];
        for(i=0;i<7;i++){
            System.out.println(min[i]+" ");
            if(m>min[i])m = min[i];
        }
        System.out.println(m);
    }
    
}
