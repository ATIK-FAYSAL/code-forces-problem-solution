#include<iostream>
#include<string>
using namespace std;
int main()
{
	int number[10],i,len;
	for(i=0;i<10;i++){
		number[i]=0;
	}
	string input;
	getline(cin,input);
	len = input.length();
	for(i=0;i<len;i++){
		if(input[i]>='0'&&input[i]<='9'){
			number[input[i]-48]++;
		}
	}
	for(i=0;i<10;i++){
		if(number[i]!=0)cout<<number[i]<<endl;
	}
}
