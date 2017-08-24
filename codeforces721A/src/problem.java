import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = new int[100000];
        int len,x=0,count=0,num,i;
        String str;
        int one=0,j;
        num = input.nextInt();
        str = input.next();
        len = str.length();
        int y=-1;
        for(i=0;i<len+1;i++){
            one =0;
            for(j=y+1;j<len;j++){
                if(str.charAt(j)=='B')one++;
                else{
                    break;
                }
            }
            y=j;
            number[i]=one;
        }
        for(x=0;x<len+1;x++){
            if(number[x]!=0)count++;
        }
        System.out.println(count);
        for(x=0;x<len+1;x++){
            if(number[x]!=0)System.out.print(number[x]+" ");
            if(x==len-1)System.out.println();
        }
               
    }
    
}
