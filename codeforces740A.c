#include<stdio.h>
int main()
{
	  	int  n,a,b,c;
        scanf("%d%d%d%d",&n,&a,&b,&c);
        int taka,max,taka1;
        int x,y,z;
        if((n+1)%4==0)printf("%d\n",a);
        else if ((n+2)%4==0){
            taka = a*2;
            if(taka<b)printf("%d\n",taka);
            else printf("%d\n",b);
        }
        else if((n+3)%4==0){
            taka = a*3;
            taka1 = a+b;
            if(taka<c&&taka<taka1)printf("%d\n",taka);
            else if(taka1<taka&&taka1<c)printf("%d\n",taka1);
            else if(c<taka&&c<taka1)printf("%d\n",c);
        }
        
}
