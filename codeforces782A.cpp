#include<bits/stdc++.h>
using namespace std;
int main()
{
	int n,i;
	scanf("%d",&n);
	vector<int>number;
	for(i=1;i<=n*2;i++){
		int num;
		scanf("%d",&num);
		number.push_back(num);
	}
	int count=0,count1=1;
	for(i=0;i<n*2;i++){
		if(number[i]==number[i+1])count++;
		else count1++;
	}
	if (n==1)printf("1\n");
	else if (count1==n)printf("%d\n",n);
	else printf("%d\n",n-count);
}
