
package codeforeces825a;
import java.util.Scanner;
import java.util.Vector;
public class Codeforeces825A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i=0,len,count=0;
        String string;
        len = input.nextInt();
        input.nextLine();
        string = input.next();
        String[] value;
        value = string.split("0");
        Vector<Integer> number = new Vector<>();
        for(i=0;i<value.length;i++)
        {
            int length;
            length = value[i].length();
            number.add(length);
            number.add(0);
        }
        for(i=0;i<number.size();i++)System.out.print(number.get(i)+"  ");
    }
    
}
