import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      String move;
      move = input.nextLine();
      if((move.charAt(0)=='a')&&(move.charAt(1)>='2'&&move.charAt(1)<='7'))System.out.println("5");
      else if ((move.charAt(0)=='h')&&(move.charAt(1)>='2'&&move.charAt(1)<='7'))System.out.println("5");
      else if ((move.charAt(0)>='b'&&move.charAt(0)<='g')&&move.charAt(1)=='1')System.out.println("5");
      else if ((move.charAt(0)>='b'&&move.charAt(0)<='g')&&move.charAt(1)=='8')System.out.println("5");
      else if ((move.charAt(0)=='a')&&(move.charAt(1)=='1'||move.charAt(1)=='8'))System.out.println("3");
      else if ((move.charAt(0)=='h')&&(move.charAt(1)=='1'||move.charAt(1)=='8'))System.out.println("3");
      else if ((move.charAt(0)>='a'&&move.charAt(0)<='h')&&move.charAt(1)=='8')System.out.println("3");
      else System.out.println("8");
    }
}
