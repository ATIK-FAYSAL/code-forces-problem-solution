#include<stdio.h>
#include<string.h>
int main()
{
	char input[1000];
	int len,i;
	while(scanf("%s",input)!=EOF){
		len=strlen(input);
		if(input[0]>='a'&&input[0]<='z'){
			for(i=0;i<len;i++){
				if(i==0){
					printf("%c",input[i]-32);
				}
				else {
					printf("%c",input[i]);
				}
			}
		}
		else if(input[0]>='A'&&input[0]<='Z'){
			for(i=0;i<len;i++){
				printf("%c",input[i]);
			}
		}
		printf("\n");
	}
	return 0;
}
