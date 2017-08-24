#include<iostream>
using namespace std;
int main()
{
	int number1,number2;
	int i,j;
	cin>>number1>>number2;
	for(i=1;i<=number1;i++){
           if(i%2!=0){
               for(j=1;j<=number2;j++){
                   cout<<"#";
               }
           }
           else if(i%4==0){
               for(j=1;j<=number2;j++){
                   if(j==1)cout<<"#";
                   else cout<<".";
               }
           }
           else {
               for(j=1;j<=number2;j++){
                   if(j==number2)cout<<"#";
                   else cout<<".";
               }
           }
           cout<<endl;
        }
        return 0;
}
