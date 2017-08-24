#include<stdio.h>
int main()
{
	 int hh,mm,sum,a;
       int hh1,mm1;
       char ch;
       scanf("%d%c%d%d",&hh,&ch,&mm,&a);
       sum = hh*60+mm+a;
       hh1 = sum/60;
       mm1 = sum%60;
       if(hh1>24)hh1 = hh1%24;
       if(hh1==24){
           printf("00:");
           if(mm1<10)printf("0%d\n",mm1);
           else printf("%d\n",mm1);
       }
       if(hh1<10){
           printf("0%d:",hh1);
           if(mm1<10)printf("0%d\n",mm1);
           else printf("%d\n",mm1);
       }
       else if(hh1!=24){
           printf("%d:",hh1);
           if(mm1<10)printf("0%d\n",mm1);
           else printf("%d\n",mm1);
       }
       return 0;
}
