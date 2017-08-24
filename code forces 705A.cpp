#include<iostream>
#include<string>
using namespace std;
int main()
{
	string input1="I hate that",input2="I love that";
	int i,num;
	cin>>num;
	if(num==1)cout<<"I hate it"<<endl;
	else if(num==2)cout<< "I hate that I love it"<<endl;
	else if(num==3)cout<<"I hate that I love that I hate it"<<endl;
	else {
		for(i=1;i<num;i++){
			if(i%2!=0)cout<<input1<<" ";
			else if(i%2==0)cout<<input2<<" ";
		}
		if(num%2==0)cout<<"I love it"<<endl;
		else if(num%2!=0)cout<<"I hate it"<<endl;
	}
	return 0;
}
