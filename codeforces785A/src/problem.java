import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String str;
        int n,i=1,count=0;
        n = input.nextInt();
        while(i<=n){
            str = input.next();
            if(str.equals("Tetrahedron"))count+=4;
            else if (str.equals("Cube"))count+=6;
            else if(str.equals("Octahedron"))count+=8;
            else if (str.equals("Dodecahedron"))count+=12;
            else if (str.equals("Icosahedron"))count+=20;
            i++;
        }
        System.out.println(count);
    }
    
}
