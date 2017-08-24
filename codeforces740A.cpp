#include<bits/stdc++.h>
using namespace std;
int main()
{
	double n,a,b,c;
  	scanf("%lf%lf%lf%lf",&n,&a,&b,&c);   
    if(fmod(n,4)==0)   
    {  
        printf("0\n");
        return 0;  
    }  
    long long int  k = 4 - fmod(n,4);  
    if(k==1)  
    {  
        double  t1 = b+c;
        t1 = min(t1,3*c);  
        if(a<t1)  
        {  
            printf("%.0lf\n",a);
        }  
        else  
           printf("%.0lf\n",t1);  
    }  
    else if(k==2)  
    {  
        double t1 = 0;  
        if(c>a*3)  
            t1 = a*6;   
        else  
            t1 = c*2;  
        t1 = min(t1,a*2);
        if(t1 < b)  
            printf("%.0lf\n",t1);   
        else  
            printf("%.0lf\n",b);
    }  
    else if(k==3)   
    {  
        double t1 = b+a;  
        t1 = min(t1,a*3);
        if(t1 < c)  
            printf("%.0lf\n",t1);   
        else  
            printf("%.0lf\n",c);
    }  
      
    return 0;  
}
