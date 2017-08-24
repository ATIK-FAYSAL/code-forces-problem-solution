#include<iostream>
using namespace std;
int main()
{
	int a,b,c,sum,n,j=1,count=0;
	cin>>n;
	while(j<=n){
		cin>>a>>b>>c;
		sum=a+b+c;
		if(sum==2||sum==3)count++;
		j++;
	}
	cout<<count<<endl;
	
	return 0;
}
