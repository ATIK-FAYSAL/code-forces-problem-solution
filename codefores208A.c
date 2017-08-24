#include<stdio.h>
#include<string.h>
int main()
{
	char input[10000],word="WUB";
	int len,i,j,count=0,found;
	scanf("%s",&input);
	len = strlen(input);
	for(i=0;i<len-3;i++){
		found=1;
		for(j=0;j<3;j++){
			if(input[i+j]!=word[j]){
				found=0;
				break;
			}
		}
		if(found==1)printf(" ");
		else printf("%c",input[i]);
	}
}
