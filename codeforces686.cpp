#include<bits/stdc++.h>
using namespace std;
int main()
{	
	long long int number;
	char ch[1];
	int i,count=0,total=0;
	long long int num,a;
	scanf("%lld%lld",&num,&a);
	for(i=0;i<num;i++){
		scanf("%s",&ch);
		scanf("%lld",&number);
		if(ch[0]=='+')a+=number;
		else if (ch[0]=='-'){
			if(a-number<0){
				a+=0;
				count++;
			}
			else a-=number;
		}
	}
	printf("%lld %d\n",a,count);
	return 0;
}
