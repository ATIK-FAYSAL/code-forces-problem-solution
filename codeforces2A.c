#include<stdio.h>
#include<string.h>
int main()
{
	int n,score,i,max;
	char name[1000],copy[1000];
	scanf("%d",&n);
	max=0;
	for(i=1;i<=n;i++){
		scanf("%s%d",&name,&score);
		if(max<score){
			strcpy(copy,name);
			max = score;
		}
	}
	printf("%s\n",copy);
}
