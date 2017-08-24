#include<bits/stdc++.h>
using namespace std;
int main()
{
	int n,k,i;
	char string[1000];
	scanf("%d%d",&n,&k);
	if(n==k){
		for(i=0;i<n;i++){
			printf("%c",i+97);
			if(i==n-1)printf("\n");
		}
	}
	else {
		for(i=0;i<k;i++){
			string[i]=i+97;
		}
		int len = strlen(string);
		string[i]='\0';
		printf("%s",string);
		int a=n-k;
		int j=0,x=1,p=0;
		char str[1000];
		while(x<=a){
			if(j==len)j=0;
			str[p]=string[j];
			p++;
			j++;
			x++;
		}
		str[p]='\0';
		printf("%s\n",str);
	}
}
