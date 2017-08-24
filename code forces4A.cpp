#include<iostream>
using namespace std;
int main()
{
	int b=0,number,a=0;
	cin>>number;
	while(number>=2){
		if(number%2==0)a=1;
		else {
			b=1;
			break;
		}
		number/=2;
	}
	if(a==1&&b==0)cout<<"YES"<<endl;
	else cout<<"NO"<<endl;
	return 0;
}
