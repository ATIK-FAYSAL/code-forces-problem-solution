#include<stdio.h>
#include<string.h>
int main()
{
	char input[1000];
	int number[1000],len,i,j,count=0,count1=0;
	int a=0;
	for(i=0;i<26;i++){
		number[i]=0;
	}
	scanf(" %[^\n]",input);
	for(i=0;i<strlen(input);i++){
		if(input[i]>='a'&&input[i]<='z'){
			number[input[i]-97]++;
		}
	}
	//int count=0;
	for(i=0;i<26;i++){
		if(number[i]==1)count++;
	}
	printf("%d\n",count);
}
