#include<iostream>
#include<string>
using namespace std;
int main()
{
	string a;
	int i=1,test_case,sum=0;
	cin>>test_case;
	while(i<=test_case){
		cin>>a;
		if(a[0]=='X'&&a[1]=='+')sum+=1;
		else if(a[0]=='+'&&a[1]=='+'&&a[2]=='X')sum+=1;
		else if(a[0]=='X'&&a[1]=='-')sum=sum-1;
		else if(a[0]=='-'&&a[1]=='-'&&a[2]=='X')sum=sum-1;
		i++;
	}
	cout<<sum<<endl;
	return 0;
}
