#include<bits/stdc++.h>
using namespace std;
int main()
{
	int number,j=1,m,n,i;
	scanf("%d",&n);
	while(true){
		number = n*j+1;
		bool flag = true;
		for(i=2;i<=sqrt(number);i++){
			if(number%i==0){
				flag = false;
				break;
			}
		}
		if(flag==false){
			printf("%d\n",j);
			break;
		}
		j++;
	}
	return 0;
}

