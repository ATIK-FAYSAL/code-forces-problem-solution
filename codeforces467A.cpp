#include<iostream>
using namespace std;
int main()
{
	int n,p,q,i;
	int count=0;
	cin>>n;
	for(i=1;i<=n;i++){
		cin>>p>>q;
		if((q-p)>=2)count++;
	}
	cout<<count<<endl;
	return 0;
}
