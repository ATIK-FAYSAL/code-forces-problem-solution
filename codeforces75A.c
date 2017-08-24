#include<stdio.h>
#include<string.h>
int main()
{
	int number1,number2,sum1,sum2,num1,num2,sum3,sum4,len;
	char input1[1000],input2[1000],str[1000];
	scanf("%d%d",&number1,&number2);
	sum1 = number1+number2;
	int i=0,j=0;
	itoa(sum1,input1,10);
	for(i=0;i<strlen(input1);i++){
		if(input1[i]!='0'){
			input2[j] = input1[i];
			j++;
		}
	}
	char str1[1000],str2[1000],str3[1000];
	itoa(number1,str,10);
	itoa(number2,str1,10);
	j=0;
	for(i=0;i<strlen(str);i++){
		if(str[i]!='0'){
			str2[j] = str[i];
			j++;
		}
	}
	j=0;
	for(i=0;i<strlen(str1);i++){
		if(str1[i]!='0'){
			str3[j] = str1[i];
			j++;
		}
	}
	num1 = atoi(str2);
	num2 = atoi(str3);
	sum2 = atoi(input2);
	if((num1+num2)==sum2)printf("YES\n");
	else printf("NO\n");
	return 0;
}
