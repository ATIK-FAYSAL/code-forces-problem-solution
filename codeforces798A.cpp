#include<bits/stdc++.h>
using namespace std;
int main()
{
    char str[10000];
    int x=0,i=0,len,count=0;
    scanf("%s",&str);
    len = strlen(str);
    char str2[100];
    for(i=len-1;i>=0;i--){
        str2[x]=str[i];
        x++;
    }
    if(strcmp(str,str2)==0)
    {
        printf("YES\n");
    }
    else {
        int mid = len/2;
        int j;
        if(len%2==0){
            j = len-1;
            i=0;
            while(i<mid&&j>=mid)
            {
                if(str[i]!=str[j])count++;
                i++;
                j--;
            }
            if(count==1)printf("YES\n");
            else printf("NO\n");
        }
        else {
            j = len-1;
            i=0;
            while(i<mid&&j>=mid)
            {
                if(str[i]!=str[j])count++;
                i++;
                j--;
            }
            if(count==1)printf("YES\n");
            else printf("NO\n");
        }
    }
}

