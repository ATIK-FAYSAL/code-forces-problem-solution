import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String year,str="";
        int year1,year2,len;
        year = input.nextLine();
        len = year.length();
        int i,result=0;
        if(len>2)
        {
            for(i=1;i<len;i++)str+=year.charAt(i);
            year1 = Integer.parseInt(str);
            year2 = Integer.parseInt(year);
            if(len==3)result=100-year1;
            else if(len==4)result=1000-year1;
            else if(len==5)result=10000-year1;
            else if(len==6)result=100000-year1;
            else if(len==7)result=1000000-year1;
            else if(len==8)result=10000000-year1;
            else if(len==9)result=100000000-year1;
            else if (len==10)result=1000000000-year1;
            System.out.println(result);
        }
        else if (len==2)
        {
            year2 = Integer.parseInt(year);
            if(year2>=10&&year2<20)System.out.println(20-year2);
            else if(year2>=20&&year2<30)System.out.println(30-year2);
            else if(year2>=30&&year2<40)System.out.println(40-year2);
            else if(year2>=40&&year2<50)System.out.println(50-year2);
            else if(year2>=50&&year2<60)System.out.println(60-year2);
            else if(year2>=60&&year2<70)System.out.println(70-year2);
            else if(year2>=70&&year2<80)System.out.println(80-year2);
            else if(year2>=80&&year2<90)System.out.println(90-year2);
            else if(year2>=90&&year2<100)System.out.println(100-year2);
        }
        else {
            year1 = Integer.parseInt(year);
            System.out.println("1");
        }
        
    }
    
}
