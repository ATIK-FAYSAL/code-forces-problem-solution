#include<bits/stdc++.h>
using namespace std;
int main()
{
    int len,i=0,count=0;
    char String[100];
    scanf("%d",&len);
    scanf("%s",&String);
    bool flag = true;
    while(i<strlen(String))
    {
        if(String[i]=='1')count++;
        else
        {
            flag = false;
            printf("%d0",count);
            count=0;
        }
        i++;
    }
    if(flag==false)printf("%d\n",strlen(String));
    else printf("\n");
}
