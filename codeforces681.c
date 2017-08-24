#include<stdio.h>
int main()
{
	char name[1000];
	int score1,score2,i=1,n,count=0;
	scanf("%d",&n);
	while(i<=n){
		scanf("%s%d%d",&name,&score1,&score2);
		if(score1>=2400&&score1<score2)count++;
		i++;
	}
	if(count>=1)printf("YES\n");
	else printf("NO\n");	
}
