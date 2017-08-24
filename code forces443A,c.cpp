#include<iostream>
#include<string>
using namespace std;
int main()
{
	string input;
	int len,i,j,count=0,count1=0;
	cin>>input;
	len=input.length();
	int a=0;
	for(i=0;i<len;i++){
		for(j=i+1;j<len;j++){
			if(input[i]>='a'&&input[i]<='z'){
				if(input[i]==input[j]){
					count++;
					break;
				}
			}
		}
		if(input[i]>='a'&&input[i]<='z')count1++;
	}
	cout<<count1<<endl;
	return 0;
}
