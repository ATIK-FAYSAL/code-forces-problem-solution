#include<bits/stdc++.h>
using namespace std;
long long int odd(long long int number){
	long long int sum;
	if(number%2==0)number=number-1;
	long long int a;
	a = (1+number)/2;
	sum = a*a;
	return sum;
}
long long int even(long long int number){
	long long int sum1;
	if(number%2==1)number=number-1;
	long long int b;
	b = (2+number)/2;
	sum1 = b*(b-1);
	return sum1;
}
int main()
{
	long long int number;
	long long int ans,ans1;
	cin>>number;
	ans = odd(number);
	ans1 = even(number);
	printf("%lld\n",ans1-ans);
	return 0;
}
