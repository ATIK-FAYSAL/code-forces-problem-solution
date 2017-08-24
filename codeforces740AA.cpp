#include<iostream>
using namespace std;
int main()
{
	  	double  n,a,b,c;
        cin>>n>>a>>b>>c;
        double taka,max,taka1;
        if((n+1)%4==0)printf("%.0f\n",a);
        else if ((n+2)%4==0){
            taka = a*2;
            if(taka<b)printf("%.0f\n",taka);
            else printf("%.0f\n",b);
        }
        else if((n+3)%4==0){
            taka = a*3;
            taka1 = a+b;
            if(taka<c&&taka<taka1)printf("%.0f\n",taka);
            else if(taka1<taka&&taka1<c)printf("%.0f\n",taka1);
            else if(c<taka&&c<taka1)printf("%.0f\n",c);
        }
        else if((n+0)%4==0)println("0");
}
