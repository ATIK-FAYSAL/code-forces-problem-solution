#include<stdio.h>
int main()
{
	int num,i=1,number,sum=0;
	double result;
	scanf("%d",&num);
	while(i<=num){
		scanf("%d",&number);
		sum+=number;
		i++;
	}
	result = (double)sum/num;
	printf("%.12lf",result);
	return 0;
}
