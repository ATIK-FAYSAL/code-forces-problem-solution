#include<iostream>
using namespace std;
int main()
{
	int number[1000];
	int score,i,count=0,n,k;
	cin>>n>>k;
	for(i=0;i<n;i++){
		cin>>number[i];
		if(number[i]>k)count++;
	}
	cout<<count<<endl;
	return 0;
}
