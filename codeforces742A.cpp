#include<bits/stdc++.h>
using namespace std;
int main()
{
	int n;
	scanf("%d",&n);
	int mod;
	mod = n%4;
	if(n==0)printf("1\n");
	else if(mod==1)printf("8\n");
	else if (mod==2)printf("4\n");
	else if (mod==3)printf("2\n");
	else if (mod==0)printf("6\n");
	return 0;
}
