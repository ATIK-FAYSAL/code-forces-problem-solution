#include<stdio.h>
#include<string.h>
int main()
{
	char a[1000],b[1000],input1[1000],input2[1000];
	int len1,len2,i,j,sum1=0,sum2=0;
	scanf(" %[^\n]",input1);
	scanf(" %[^\n]",input2);
	len1=strlen(input1);
	for(i=0;i<len1;i++){
		if(input1[i]>='A'&&input1[i]<='Z')a[i]=input1[i]+32;
		else a[i]=input1[i];		 
		if(input2[i]>='A'&&input2[i]<='Z')b[i]=input2[i]+32;
		else b[i]=input2[i];
	}
	a[i]='\0';b[i]='\0';
	int x=0;
	for(i=0;i<len1;i++){
		if(a[i]>b[i]){
			printf("1\n");
			break;
		}
		else if(a[i]<b[i]){
			printf("-1\n");
			break;
		}
		else x++;
	}
	if(x==len1)printf("0\n");
	return 0;
}
