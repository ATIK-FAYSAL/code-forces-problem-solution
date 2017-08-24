#include<stdio.h>
#include<string.h>
int main()
{
	char input[1000],copy[1000],number[1000];
	int len,i,j,index;
	int power,p=0,index2=0;
	scanf("%s",input);
	len = strlen(input);
	for(i=0;i<len;i++){
		if(input[i]=='e'){
			index=i;
			break;
		}
		else  if (input[i]=='.')index2=i;
		number[p] = input[i];
		p++;
	}
	int x=0;
	for(j=index+1;j<len;j++){
		copy[x]=input[j];
		x++;
	}
	int count1=0;
	for(i=0;i<len;i++){
		if(input[i]=='.')break;
		count1++;
	}
	int len1;
	int point ;
	len1 = strlen(number);
	power = atoi(copy);
	point = index2+power;
	int count=0;
	for(i=index2+1;i<len;i++){
		if(input[i]=='e')break;
		count++;
	}
	for(i=0;i<10000;i++){
		if(number[i]!='.')printf("%c",number[i]);
		if(i==point&&power<count)printf(".");
		if(power>count){
			if(i>point)printf("0");
		}
		if(i==len1+6)break;
	}
}
