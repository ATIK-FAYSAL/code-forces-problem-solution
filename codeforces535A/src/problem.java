import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String number;
       int len;
       number = input.nextLine();
       len = number.length();
       if(len==1){
           if(number.charAt(0)=='0')System.out.println("zero");
           else if(number.charAt(0)=='1')System.out.println("one");
           else if(number.charAt(0)=='2')System.out.println("two");
           else if(number.charAt(0)=='3')System.out.println("three");
           else if(number.charAt(0)=='4')System.out.println("four");
           else if(number.charAt(0)=='5')System.out.println("five");
           else if(number.charAt(0)=='6')System.out.println("six");
           else if(number.charAt(0)=='7')System.out.println("seven");
           else if(number.charAt(0)=='8')System.out.println("eight");
           else if(number.charAt(0)=='9')System.out.println("nine");
       }
       else if(len==2){
           if(number.charAt(0)=='1'){
               if(number.charAt(1)=='0')System.out.println("ten");
                else if(number.charAt(1)=='1')System.out.println("eleven");
                else if(number.charAt(1)=='2')System.out.println("twelve");
                else if(number.charAt(1)=='3')System.out.println("thirteen");
                else if(number.charAt(1)=='4')System.out.println("fourteen");
                else if(number.charAt(1)=='5')System.out.println("fifteen");
                else if(number.charAt(1)=='6')System.out.println("sixteen");
                else if(number.charAt(1)=='7')System.out.println("seventeen");
                else if(number.charAt(1)=='8')System.out.println("eighteen");
                else if(number.charAt(1)=='9')System.out.println("nineteen");
           }
           else if (number.charAt(0)=='2'){
                if(number.charAt(1)=='0')System.out.println("twenty");
                else if(number.charAt(1)=='1')System.out.println("twenty-one");
                else if(number.charAt(1)=='2')System.out.println("twenty-two");
                else if(number.charAt(1)=='3')System.out.println("twenty-three");
                else if(number.charAt(1)=='4')System.out.println("twenty-four");
                else if(number.charAt(1)=='5')System.out.println("twenty-five");
                else if(number.charAt(1)=='6')System.out.println("twenty-six");
                else if(number.charAt(1)=='7')System.out.println("twenty-seven");
                else if(number.charAt(1)=='8')System.out.println("twenty-eight");
                else if(number.charAt(1)=='9')System.out.println("twenty-nine");
           }
           else if (number.charAt(0)=='3'){
                if(number.charAt(1)=='0')System.out.println("thirty");
                else if(number.charAt(1)=='1')System.out.println("thirty-one");
                else if(number.charAt(1)=='2')System.out.println("thirty-two");
                else if(number.charAt(1)=='3')System.out.println("thirty-three");
                else if(number.charAt(1)=='4')System.out.println("thirty-four");
                else if(number.charAt(1)=='5')System.out.println("thirty-five");
                else if(number.charAt(1)=='6')System.out.println("thirty-six");
                else if(number.charAt(1)=='7')System.out.println("thirty-seven");
                else if(number.charAt(1)=='8')System.out.println("thirty-eight");
                else if(number.charAt(1)=='9')System.out.println("thirty-nine");
           }
           else if (number.charAt(0)=='4'){
                if(number.charAt(1)=='0')System.out.println("forty");
                else if(number.charAt(1)=='1')System.out.println("forty-one");
                else if(number.charAt(1)=='2')System.out.println("forty-two");
                else if(number.charAt(1)=='3')System.out.println("forty-three");
                else if(number.charAt(1)=='4')System.out.println("forty-four");
                else if(number.charAt(1)=='5')System.out.println("forty-five");
                else if(number.charAt(1)=='6')System.out.println("forty-six");
                else if(number.charAt(1)=='7')System.out.println("forty-seven");
                else if(number.charAt(1)=='8')System.out.println("forty-eight");
                else if(number.charAt(1)=='9')System.out.println("forty-nine");
           }
           else if (number.charAt(0)=='5'){
                if(number.charAt(1)=='0')System.out.println("fifty");
                else if(number.charAt(1)=='1')System.out.println("fifty-one");
                else if(number.charAt(1)=='2')System.out.println("fifty-two");
                else if(number.charAt(1)=='3')System.out.println("fifty-three");
                else if(number.charAt(1)=='4')System.out.println("fifty-four");
                else if(number.charAt(1)=='5')System.out.println("fifty-five");
                else if(number.charAt(1)=='6')System.out.println("fifty-six");
                else if(number.charAt(1)=='7')System.out.println("fifty-seven");
                else if(number.charAt(1)=='8')System.out.println("fifty-eight");
                else if(number.charAt(1)=='9')System.out.println("fifty-nine");
           }
           else if (number.charAt(0)=='6'){
                if(number.charAt(1)=='0')System.out.println("sixty");
                else if(number.charAt(1)=='1')System.out.println("sixty-one");
                else if(number.charAt(1)=='2')System.out.println("sixty-two");
                else if(number.charAt(1)=='3')System.out.println("sixty-three");
                else if(number.charAt(1)=='4')System.out.println("sixty-four");
                else if(number.charAt(1)=='5')System.out.println("sixty-five");
                else if(number.charAt(1)=='6')System.out.println("sixty-six");
                else if(number.charAt(1)=='7')System.out.println("sixty-seven");
                else if(number.charAt(1)=='8')System.out.println("sixty-eight");
                else if(number.charAt(1)=='9')System.out.println("sixty-nine");
           }
           else if (number.charAt(0)=='7'){
                if(number.charAt(1)=='0')System.out.println("seventy");
                else if(number.charAt(1)=='1')System.out.println("seventy-one");
                else if(number.charAt(1)=='2')System.out.println("seventy-two");
                else if(number.charAt(1)=='3')System.out.println("seventy-three");
                else if(number.charAt(1)=='4')System.out.println("seventy-four");
                else if(number.charAt(1)=='5')System.out.println("seventy-five");
                else if(number.charAt(1)=='6')System.out.println("seventy-six");
                else if(number.charAt(1)=='7')System.out.println("seventy-seven");
                else if(number.charAt(1)=='8')System.out.println("seventy-eight");
                else if(number.charAt(1)=='9')System.out.println("seventy-nine");
           }
           else if (number.charAt(0)=='8'){
                if(number.charAt(1)=='0')System.out.println("eighty");
                else if(number.charAt(1)=='1')System.out.println("eighty-one");
                else if(number.charAt(1)=='2')System.out.println("eighty-two");
                else if(number.charAt(1)=='3')System.out.println("eighty-three");
                else if(number.charAt(1)=='4')System.out.println("eighty-four");
                else if(number.charAt(1)=='5')System.out.println("eighty-five");
                else if(number.charAt(1)=='6')System.out.println("eighty-six");
                else if(number.charAt(1)=='7')System.out.println("eighty-seven");
                else if(number.charAt(1)=='8')System.out.println("eighty-eight");
                else if(number.charAt(1)=='9')System.out.println("eighty-nine");
           }
           else if (number.charAt(0)=='9'){
                if(number.charAt(1)=='0')System.out.println("ninety");
                else if(number.charAt(1)=='1')System.out.println("ninety-one");
                else if(number.charAt(1)=='2')System.out.println("ninety-two");
                else if(number.charAt(1)=='3')System.out.println("ninety-three");
                else if(number.charAt(1)=='4')System.out.println("ninety-four");
                else if(number.charAt(1)=='5')System.out.println("ninety-five");
                else if(number.charAt(1)=='6')System.out.println("ninety-six");
                else if(number.charAt(1)=='7')System.out.println("ninety-seven");
                else if(number.charAt(1)=='8')System.out.println("ninety-eight");
                else if(number.charAt(1)=='9')System.out.println("ninety-nine");
           }
       }
    }
    
}
