#include<iostream>
#include<string>
using namespace std;
int main()
{
	string number1,number2;
	int i,j=0;
	cin>>number1>>number2;
	for(i=0;i<number1.length();i++){
		if(number1[i]==number2[j])cout<<"0";
		else cout<<"1";
		if(i==number1.length()-1)cout<<endl;
		j++;
	}
return 0;	
}
