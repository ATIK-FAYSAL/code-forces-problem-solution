#include<iostream>
using namespace std;
int main()
{
	long number[100000];
	long  num1,num2,i,count=0,y=0;
	cin>>num1>>num2;
	for(i=1;i<=num1;i++){
		if(i%2!=0){
			number[y]=i;
			y++;
			count++;
		}
	}
	for(i=1;i<=num1;i++){
		if(i%2==0){
			number[y]=i;
			y++;
			count++;
		}
	}
	for(y=0;y<count;y++){
		if(y==num2-1)cout<<number[y]<<endl;
	}
	return 0;
}
