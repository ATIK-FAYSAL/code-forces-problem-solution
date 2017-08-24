#include<stdio.h>
#include<string.h>
int main()
{
	int day;
	char input[1000];
	scanf("%d",&day);
	gets(input);
	if(input[4]=='w'){
		if(day==1)printf("52\n");
		else if(day==2)printf("52\n");
		else if(day==3)printf("52\n");
		else if(day==4)printf("52\n");
		else if(day==5)printf("53\n");
		else if(day==6)printf("53\n");
		else if(day==7)printf("52\n");
	}
	else if(input[4]=='m'){
		if(day==31)printf("7\n");
		else if(day==30)printf("11\n");
		else printf("12\n");
	}
	return 0;
}
