#include<bits/stdc++.h>
using namespace std;
int main()
{
	char str1[10000],str2[10000],str3[10000];
	int n,i=1,j,len;
	scanf("%d",&n);
	scanf("%s",&str1);
	while(i<=n){
		int x=0;
		scanf("%s",&str2);
		len = strlen(str2);
		for(j=0;j<len;j++){
			if(j>=len-3){
				str3[x] = str2[j];
				x++;
			}
		}
		str3[x] = '\0';
		i++;
	}
	if(strcmp(str1,str3)==0)printf("home\n");
	else printf("contest\n");
}
