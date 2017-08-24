#include<bits/stdc++.h>
using namespace std;
int main()
{
	long long int a,b,c,d,e;
	cin>>a>>b>>c>>d>>e;
	long long int maxi,mini;
	maxi = max(a,c);
	mini = min(b,d);
	if(mini<maxi)printf("0\n");
	else {
		if(e>=maxi&&e<=mini)printf("%lld\n",mini-maxi);
		else printf("%lld\n",(mini-maxi)+1);
	}
	return 0;
}
