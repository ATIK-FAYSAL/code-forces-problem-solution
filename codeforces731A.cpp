#include<bits/stdc++.h>
using namespace std;
int main()
{
	char str[10000];
	int len,i,count;
	int asci,count1,mini;
	scanf("%s",&str);
	len = strlen(str);
	char ch;
	ch = str[0];
	count = ('z'+ch)-'z';
	count1 = ch-'a';
	mini = min(count1,123-count);
	int sum=mini;
	printf("%d\n",count1);
	printf("%d\n",123-count);
	printf("mini = %d\n",mini);
	 for(i=1;i<len;i++){
	 	count = str[i]-ch;
	 	if (count<0)count=count*-1;
	 	printf("%d ",str[i]);
	 	count1 = (123-'z'+123-str[i])-(ch-96);
	 	mini = min(count,123-count1);
	 	printf("count = %d count1 = %d\n",count,count1);
	 }
}
