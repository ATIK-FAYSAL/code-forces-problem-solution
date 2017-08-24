import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;
        boolean flag = false;
        boolean flag1 = false;
        int len,i,count=0,count1=0;
        int[] number = new int[10];
        word = input.nextLine();
        len = word.length();
        int ascii;
        for(i=0;i<10;i++)number[i]=0;
        for(i=0;i<len;i++){
            ascii = (int) word.charAt(i);
            if(word.charAt(i)>='0'&&word.charAt(i)<='9')number[ascii-48]++;
        }
        boolean flag3 = false;
        boolean flag4 = false;
        boolean flag5 = false;
        for(i=0;i<10;i++){
            if(number[i]==4)flag=true;
            else if (number[i]==2)flag1=true;
            else if(number[i]==6)flag3 = true;
            else if(number[i]==5)flag4 = true;
            else if (number[i]==1)flag5 = true;
        }
       if((flag==true&&flag1==true)||(flag3==true))System.out.println("Elephant");
        else if((flag1==false&&flag==true)||(flag4==true&&flag5==true))System.out.println("Bear");
        else System.out.println("Alien");
    }
}
