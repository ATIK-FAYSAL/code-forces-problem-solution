#include<stdio.h>
#include<string.h>
int main()
{
	char input[1000];
	int len,i,count=0,n;
	scanf("%d",&n);
	scanf("%s",input);
	len = strlen(input);
	for(i=0;i<len;i++){
		if(input[i]==input[i+1])count++;
	}
	printf("%d\n",count);
	return 0;
}
