#include<bits/stdc++.h>
using namespace std;
int main()
{
	int n,number[1000];
	int i,ind1=0,ind2,a,b;
	scanf("%d",&n);
	int mx=0,mini;
	if(n%2==0)a = n/2;
	else a = (n/2)+1;
	for(i=0;i<n;i++){
		scanf("%d",&number[i]);
		if(number[i]>mx){
			mx = number[i];
			ind1 = i+1;
		}
	}
	mini = number[0];
	for(i=0;i<n;i++){
		if(mini>=number[i]){
			mini = number[i];
			ind2 = i+1;
		}
	}
	if(ind1<=a&&ind2>a){
		printf("***%d\n",n-ind1);
	}
	else if (ind1>a&&ind2<=a){
		printf("%d\n",n-ind2);
	}
	else if (ind1<=a&&ind2<=a){
		printf("%d\n",n-min(ind1,ind2));
	}
	else if(ind1>a&&ind2>a){
		printf("%d\n",max(ind1,ind2));
	}
}
