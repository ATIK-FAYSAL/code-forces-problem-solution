#include<bits/stdc++.h>
using namespace std;
int main()
{
	int total,hour1,minit1,c_hour,c_minit,i;
	int c_minit1,c_hour1,hour,minit ;
	char ch;
	scanf("%d%c%d",&hour,&ch,&minit);
	scanf("%d%c%d",&hour1,&ch,&minit1);
	c_minit = hour*60+minit;
	if(hour==00)c_minit=24*60+minit;
	c_minit1 = hour1*60+minit1;
	if(hour1==00)c_minit1=24*60+minit1;
	int sub;
	sub = c_minit-c_minit1;
	if(c_minit1>c_minit)sub = (c_minit+1440)-c_minit1;
	if(sub<60){
		if(sub>9)printf("00:%d\n",sub);
		else printf("00:0%d\n",sub);
	}
	else {
		c_hour = sub/60;
		c_minit = sub%60;
		if(c_hour>9){
			if(c_minit>9)printf("%d:%d\n",c_hour,c_minit);
			else printf("%d:0%d\n",c_hour,c_minit);
		}
		else {
			if(c_minit>9)printf("0%d:%d\n",c_hour,c_minit);
			else printf("0%d:0%d\n",c_hour,c_minit);
		}
	}
	return 0;
}
