#include<bits/stdc++.h>
using namespace std;
int main()
{
    int c,v,v1,a,l;
    int count=1,sum,sum1;
    scanf("%d%d%d%d%d",&c,&v,&v1,&a,&l);
    sum=v;
    sum1 = v;
    while(sum1<c)
    {
        sum = min(v1,sum+a);
        sum1+= sum-l;
        count++;
    }
    printf("%d\n",count);
}
