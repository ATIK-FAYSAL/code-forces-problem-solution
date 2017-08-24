#include<stdio.h>
#include<string.h>
int main()
{
	char input[1000];
	int len,i,j,count=0;
	gets(input);
	len=strlen(input);
	for(i=0;i<len;i++){
		for(j=i+1;j<len;j++){
			if(input[i]==input[j]){
				count++;
				break;
			}
		}
	}
	if((len-count)%2==0)printf("CHAT WITH HER!\n");
	else printf("IGNORE HIM!\n");
return 0;
}
