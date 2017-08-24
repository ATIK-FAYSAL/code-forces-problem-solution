#include<bits/stdc++.h>
using namespace std;
int main()
{
	int x,a,b,c;
	int i=0,mx,p=1;
	scanf("%d%d%d",&a,&b,&c);
	vector<int>number;
	number.push_back(a);
	while(true){
		int x = a+(b*p);
		int y = a+(b*p+1);
		if(x>c)break;
		number.push_back(x);
		number.push_back(y);
		p++;
	}
	printf("%d\n",number[number.size()-1]);
	return 0;
}laf
