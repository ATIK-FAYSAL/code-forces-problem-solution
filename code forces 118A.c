#include<stdio.h>
#include<string.h>
int main()
{
	char input[10000];
	int len,i,a;
	scanf("%s",input);
	len=strlen(input);
	for(i=0;i<len;i++){
		if(input[i]=='a'||input[i]=='e'||input[i]=='i'||input[i]=='o'||input[i]=='u'||input[i]=='y'||input[i]=='A'||input[i]=='E'||input[i]=='I'||input[i]=='O'||input[i]=='U'||input[i]=='Y'){
			a=1;
		}
		else {
			printf(".");
			if(input[i]>='A'&&input[i]<='Z')
			printf("%c",input[i]+32);
			else printf("%c",input[i]);
		}
	}
	return 0;
}
