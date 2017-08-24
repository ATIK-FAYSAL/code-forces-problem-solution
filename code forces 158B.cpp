#include<iostream>
using namespace std;
int main()
{
	long long int number[1000],student,i,sum=0;
	cin>>student;
	for(i=0;i<student;i++){
		cin>>number[i];
		sum+=number[i];
	}
	int ans;
	if(sum%4==0)cout<<sum/4<<endl;
	else cout<<(sum/4)+1<<endl;
	return 0;
}
