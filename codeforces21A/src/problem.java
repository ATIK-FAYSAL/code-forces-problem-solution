import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      String name;
      int len,a=0,b=0,c=0,i;
      int user=0,host=0,reso=0;
      name = s.nextLine();
      len = name.length();
      int index = 0;
      for(i=0;i<len;i++){
          if(name.charAt(i)=='@'){
              index = i;
              break;
          }
          if(name.charAt(i)>='a'&&name.charAt(i)<='z'||name.charAt(i)>='A'&&name.charAt(i)<'Z'||name.charAt(i)=='_'){
              user++;
          }
          else  a++;
          
      }
      int j = 0;
      for(i=index+1;i<len;i++){
          if(name.charAt(i)=='.'){
              j = i;
              break;
          }
          if(name.charAt(i)>='a'&&name.charAt(i)<='z'||name.charAt(i)>='A'&&name.charAt(i)<'Z'||name.charAt(i)=='_'){
              host++;
          }
          else b++;
      }
      for(i = j+1 ;j<len;j++){
          if(name.charAt(i)>='a'&&name.charAt(i)<='z'||name.charAt(i)>='A'&&name.charAt(i)<'Z'||name.charAt(i)=='_'){
              reso++;
          }
          else c++;
      }
      if(a==0&&b==0&&c==0&&user<=16&&host<=32&&reso<=16)System.out.println("YES");
      else System.out.println("NO");
    }
    
}
