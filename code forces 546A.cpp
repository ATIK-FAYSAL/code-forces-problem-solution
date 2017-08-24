#include<iostream>
using namespace std;
int main()
{
	int k,n,w,sum;
	int i;
	while(cin>>k>>n>>w){
		sum=0;
		for(i=0;i<=w;i++){
			sum+=i*k;
		}
		if((sum-n)<0)sum=0;
		else sum=sum-n;
		cout<<sum<<endl;
	}
	return 0;
}
