#include<stdio.h>
#include<math.h>
int main()
{
	int number[100000];
	int i,n,min;
	double  sum=0;
	scanf("%d",&n);
	for(i=0;i<n;i++){
		scanf("%d",&number[i]);
		sum+=number[i];
	}
	if(fmod(sum,2)!=0){
		 min = number[0];
		for(i=0;i<n;i++){
			if(min>number[i]&&number[i]%2!=0)min=number[i];
		}
		printf("%.0lf\n",sum-min);
	}
	else printf("%.0lf\n",sum);
	return 0;
}
