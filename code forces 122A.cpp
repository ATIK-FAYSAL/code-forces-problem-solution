#include<iostream>
using namespace std;
int main()
{
	int number,num,i,last_number,count=0,count1=0;
	cin>>number;
	num=number;
	while(number!=0){
		last_number=number%10;
		if(last_number==4||last_number==7)count++;
		count1++;
		number/=10;
	}
	if(count==count1&&(num%4!=0&&num%7!=0))cout<<"YES"<<endl;
	else cout<<"NO"<<endl;
	return 0;
}
