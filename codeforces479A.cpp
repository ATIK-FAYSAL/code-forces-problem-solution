#include<iostream>
using namespace std;
int main()
{
	int a,b,c,max,i,number[1000],j=0;
	cin>>a>>b>>c;
	number[0] = (a+b)*c;
	number[1] = a*b*c;
	number[2] = (b+c)*a;
	number[3] = a+(b*c);
	number[4] = b+(c*a);
	number[5] = c+(a*b);
	number[6] = a+b+c;
	max = 0;
	for(i=0;i<7;i++){
		if(max<number[i])max=number[i];
	}
	cout<<max<<endl;
	return 0;
}
