#include<bits/stdc++.h>
using namespace std;
int main()
{
	char number[100000];
	char str[100000]={'1','2','3','4','5','6','7','8','9'};
	char str1[10000];
	int x=0,index,i;
	int arra[10000];
	scanf("%d",&index);
	if(index<10){
		printf("%c\n",str[index-1]);
	}
	else {
		for(i=10;i<=index;i++){
			itoa(i,number,10);
			strcat(str,number);
		}
		int len;
		len = strlen(str1);
		printf("%c\n",str[index-1]);
	}
	return 0;
}
