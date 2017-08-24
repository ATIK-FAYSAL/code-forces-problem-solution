#include<bits/stdc++.h>
using namespace std;
int main()
{
	char a[100000];
	int len,i;
	scanf("%d",&len);
	scanf("%s",&a);
	for(i=0;i<len;i++){
		if(a[i]=='o'){
           if(a[i+1]=='g'||a[i-1]=='g')printf("*");
           else printf("%c",a[i]);
       }
        else if (a[i]=='g'){
           if(a[i-1]=='o'&&a[i+1]=='o')printf("*");
           else printf("%c",a[i]);
       }
       else printf("%c",a[i]);     
	}
}
