#include<bits/stdc++.h>
using namespace std;
int main()
{
	int k2,k3,k5,k6;
	int n1,n2;
	scanf("%d%d%d%d",&k2,&k3,&k5,&k6);
	n1 = min(k2,min(k5,k6));
	n2 = min(k3,k2-n1);
	printf("%d\n",n2*32+n1*256);
	return 0;
}
