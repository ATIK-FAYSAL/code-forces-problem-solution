#include<bits/stdc++.h>
using namespace std;
int main()
{	
	char word[10000];
	int len,i;
	int str[1000];
	for(i=0;i<26;i++)str[i] = 0;
	scanf("%s",&word);
	len = strlen(word);
	for(i=0;i<len;i++){
		if(word[i]=='A'||word[i]=='E'||word[i]=='I'||word[i]=='O'||word[i]=='U'||word[i]=='Y'){
			str[word[i]-65]++;
		}
	}
	int count=0;
	for(i=0;i<26;i++){
		if(str[i]!=0)count++;
	}
	if(count-1==0)printf("%d\n",count);
	else printf("%d\n",count-1);
}
