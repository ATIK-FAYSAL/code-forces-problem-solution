#include<bits/stdc++.h>
using namespace std;
int main()
{
	int n,i,x,k,count=0,num,p=1;
	scanf("%d%d",&n,&k);
	num = n;
	while(true){
		num = n*p;
		x = num-k;
		if(num%10==0||x%10==0)break;
		count++;
		p++;
	}
	printf("%d\n",p);
}
