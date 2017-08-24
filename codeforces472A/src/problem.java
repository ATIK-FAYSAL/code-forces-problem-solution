import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,number,i,is_prime,j;
        int[] arr;
        arr = new int[1000000];
        number = input.nextInt();
        int count=0,k=0;
        for(i=1;i<=number;i++){
          is_prime = 0;
          for(j = 2;j<=i/2;j++){
              if(i%j==0){
                  is_prime = 1;
                  break;
              }
          }
           if(is_prime!=0){
               arr[k] = i;
               k++;
               count++;
           }
        }
        int res,big,end,mid;
        
        for(k=0;k<count;k++){
            //System.out.println(arr[k]);
            res = number-arr[k];
            big = 0;
            end = count-1;
            mid = (big+end)/2;
            while(big<=end){
                if(arr[mid]<res)big = mid+1;
                else if (arr[mid]>res)end = mid-1;
                else if(arr[mid]==res){
                    
                    break;
                }
                mid = (big+end)/2;
            }
            if(big<=end){
                System.out.println(arr[k]+" "+res);
                break;
            }
        }
    }
    
}
