#include<stdio.h>
#include<string.h>
int main()
{
	char input[10000],input1[10000],copy[10000];
	int len,i,j,x,len1;
	while(scanf("%s%s",input,input1)!=EOF){
		len=strlen(input);
		len1=strlen(input1);
		x=0;
		for(i=len1-1;i>=0;i--){
			copy[x]=input1[i];
			x++;
		}
		if(strcmp(copy,input)==0){
			printf("YES\n");
		}
		else {
			printf("NO\n");
		}
	}
	return 0;
}
