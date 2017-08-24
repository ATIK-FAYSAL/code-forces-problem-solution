#include<iostream>
#include<cmath>
#include<algorithm>
#include<limits.h>
using namespace std;
int main()
{
	int i,number[100000],n,mini=0;
	long long sum=0;
	cin>>n;
	for(i=0;i<n;i++){
		cin>>number[i];
		sum+=number[i];
	}
	mini = number[0];
	for(i=0;i<n;i++){
		if(number[i]%2)mini = min(mini,number[i]);
	}
	if(sum%2)cout<<(sum-mini)<<endl;
	else cout<<sum<<endl;
}
