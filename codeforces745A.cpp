#include<bits/stdc++.h>
using namespace std;
int main()
{
	char input[1000],copy[1000];
	char word[10000];
	int j=1,len,i,count=0;
	scanf("%s",&input);
	strcpy(word,input);
	len = strlen(input);
	if(len==1)printf("1\n");
	else {
		while(true){
			int x=2;
			copy[0] = input[len-1];
			copy[1] = input[0];
			for(i=1;i<len-1;i++){
				copy[x] = input[i];
				x++;
			}
			copy[x] = '\0';
			count++;
			if(strcmp(copy,word)==0)break;
			strcpy(input,copy);
		}
			printf("%d\n",count);
	}
	return 0;
}
