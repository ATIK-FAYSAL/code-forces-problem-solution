#include<stdio.h>
#include<string.h>
int main()
{
	char input[1000];
	int len,i,count=0;
	scanf("%s",input);
	len=strlen(input);
	for(i=0;i<len;i++){
		if(input[i]>='A'&&input[i]<='Z'){
			count++;
		}
	}
	if(count==len-1&&input[0]>='a'&&input[0]<='z'){
		printf("%c",input[0]-32);
		for(i=1;i<len;i++){
			printf("%c",input[i]+32);
		}
		printf("\n");
	}
	else if(count==len){
		for(i=0;i<len;i++){
			printf("%c",input[i]+32);
		}
		printf("\n");
	}
	else printf("%s\n",input);
	return 0;
}
