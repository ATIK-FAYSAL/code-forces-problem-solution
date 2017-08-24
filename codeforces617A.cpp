#include<iostream>
using namespace std;
int main()
{
	int n,result;
	cin>>n;
	result = n/5;
	if(result*5<n)cout<<result+1<<endl;
	else cout<<result<<endl;
}
