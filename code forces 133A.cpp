#include<iostream>
#include<string>
using namespace std;
int main()
{
	string input;
	int len,i,count=0;
	cin>>input;
	len=input.length();
	for(i=0;i<len;i++){
		if(input[i]=='H'||input[i]=='Q'||input[i]=='9'){
			cout<<"YES"<<endl;
			break;
		}
		else {
			count++;
		}
	}
	if(count==len)cout<<"NO"<<endl;
}
