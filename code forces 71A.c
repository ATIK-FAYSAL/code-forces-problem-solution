#include<stdio.h>
#include<string.h>
int main()
{
	char input[100000];
	int len,test_case,j=1;
	scanf("%d",&test_case);
	while(j<=test_case){
		scanf("%s",input);
		len=strlen(input);
		if(len<=10)printf("%s\n",input);
		else printf("%c%d%c\n",input[0],len-2,input[len-1]);
		j++;
	}
	return 0;
}
