#include<bits/stdc++.h>
using namespace std;
int main()
{
	char a[10000],b[10000];
	char name1[1000],name2[1000];
	char str1[1000],str2[1000];
	int i=1,num;
	scanf("%s%s",&name1,&name2);
	scanf("%d",&num);
	printf("%s %s\n",name1,name2);
	while(i<=num){
		scanf("%s%s",&a,&b);
		if(strcmp(a,name1)==0){
			strcpy(str1,b);
			strcpy(str2,name2);
		}
		else if (strcmp(a,name2)==0){
			strcpy(str1,name1);
			strcpy(str2,b);
		} 
		printf("%s %s\n",str1,str2);
		strcpy(name1,str1);
		strcpy(name2,str2);
		i++;
	}
	return 0;
}
