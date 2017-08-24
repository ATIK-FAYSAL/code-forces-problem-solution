#include<stdio.h>
#include<string.h>
int main()
{
	char input1[1000],input[1000];
	int i,j=0,number[1000],num;
	scanf("%d",&num);
	scanf(" %[^\n]",input);
	for(i=0;i<26;i++){
		number[i]=0;
	}
	for(i=0;i<num;i++){
		if(input[i]>='A'&&input[i]<='Z'){
			input1[j]=input[i]+32;
			j++;
		}
		else if (input[i]>='a'&&input[i]<='z'){
			input1[j]=input[i];
			j++;
		}
		number[input1[i]-97]++;
	}
	int count=0,a=0;
	for(i=0;i<26;i++){
		if(number[i]!=0){
			count++;
		}
		else if(number[i]==0){
			a=1;
			break;
		}
	}
	if(count==26&&a==0)printf("YES\n");
	else printf("NO\n");
	return 0;
}
