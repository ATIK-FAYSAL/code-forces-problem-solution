#include<bits/stdc++.h>
using namespace std;
int main()
{
	int result,a,b,number,i=0,j=0;
	bool flag = false;
	scanf("%d",&number);
	for(a=0;a<=number;a+=1234567){
		for(b= 0;b<=number-a;b+=123456){
			if((number-a-b)%1234==0){
				flag = true;
				break;
			}
		}
	}
	if(flag==false)printf("NO\n");
	else printf("YES\n");
}
