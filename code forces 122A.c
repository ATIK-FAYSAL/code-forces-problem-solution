#include<iostream>
#include<string>
int main()
{
	string input;
	int i,len,count;
	cin>>input;
	len=input.length();
	for(i=0;i<len;i++){
		if(input[i]=='4'||input[i]=='7')count++;
	}
	if(count==len)cout<<"YES"<<endl;
	else cout<<"NO"<<endl;
}
