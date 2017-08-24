import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c;
        int i,j,h1,h2;
        int[] num = new int[5];
        int[] num1 = new int[5];
        int number;
        double d;
        for(i=0;i<5;i++){
            num[i]=input.nextInt();
        }
        for(j=0;j<5;j++){
            num1[j] = input.nextInt();
        }
        h1 = input.nextInt();
        h2 = input.nextInt();
        j = 0;
        double sum=0;
        for(i=0;i<5;i++){
            if(i==0){
                a =(double) 0.3*500;
                b =(double) num[i]/250;
                c =(1-b)*(500)-(50*num1[j]);
                number = (int)c;
                d =(double) c-number;
                c = c+d;
                sum+=Math.max(a,c);
            }
            else if(i==1){
                a =(double) 0.3*1000;
                b =(double) num[i]/250;
                c =(1-b)*(1000) -(50*num1[j]);
                number = (int)c;
                d =(double) c-number;
                c = c+d;
                sum+=Math.max(a,c);
            }
            else if(i==2){
                a =(double) 0.3*1500;
                b =(double) num[i]/250;
                c =(1-b)*(1500) -(50*num1[j]);
                number = (int)c;
                d =(double) c-number;
                c = c+d;
                sum+=Math.max(a,c);
            }
            else if(i==3){
                a =(double) 0.3*2000;
                b =(double) num[i]/250;
                c =(1-b)*(2000) -(50*num1[j]);
                number = (int)c;
                d =(double) c-number;
                c = c+d;
                sum+=Math.max(a,c);
            }
            else if(i==4){
               a =(double) 0.3*2500;
                b =(double) num[i]/250;
                c =(1-b)*(2500) -(50*num1[j]);
                number = (int)c;
                d =(double) c-number;
                c = c+d;
                sum+=Math.max(a,c);
            }
            j++;
        }
        int result ;
        result = (int)sum;
            h1 = h1*100;
            h2 = h2*50;
            System.out.println((result+h1)-h2);
    }
    
}
