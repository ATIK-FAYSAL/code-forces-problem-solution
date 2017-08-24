#include<bits/stdc++.h>
using namespace std;
int main()
{
	int number,i,j=0;
	int pow;
	int len,index,len1;
	char str[1000000],str2[100000],str3[10000];
	scanf("%d",&number);
	scanf("%s",str3);
	len1  = strlen(str3);
	for(i=0;i<len1;i++){
		if(str3[i]=='e'){
			index = i;
			break;
		}
	}
	for(i=index+1;i<len1;i++){
		str2[j]=str3[i];
		j++;
	}
	str2[j]='\0';
	pow = atoi(str2);
	j=0;
	for(i=1;i<index;i++){
		str[j]=str3[i];
		j++;
	}
	str[j]='\0';
	len = strlen(str);
	int count=0;
	for(i=0;i<len;i++){
		if(str[i]=='0')count++;
	}
	if(number==0&&count==len&&pow==0)printf("0\n");
	else if(number!=0&&count==len&&pow==0)printf("%d\n",number);
	else {
			if(pow<len){
			printf("%d",number);
			for(i=0;i<len;i++){
				if(i==pow)printf(".");
				printf("%c",str[i]);
			}
		}
		else if (pow==len){
			printf("%d",number);
			for(i=0;i<len;i++){
				printf("%c",str[i]);
				if(i==len-1)printf("\n");
			}
		}
		else if (pow>len){
			printf("%d",number);
			for(i=0;i<len;i++){
				printf("%c",str[i]);
			}
			for(i=1;i<=pow-len;i++)printf("0");
			printf("\n");
		}
	}
	return 0;
	scanf(" %[^\t]")
}
