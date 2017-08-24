#include<bits/stdc++.h>
using namespace std;
int day(int n,int k)
{
    int i,number,scount=0,total_count=0,count1=0,count2=0;
    for(i=0;i<n;i++){
        scanf("%d",&number);
        if(number<=k)scount++;
        else if (number<=2*k)count1++;
        else if(number>=2*k){
            count2+=number/(2*k);
            if(number%(2*k)!=0)count2++;
        }
    }
    if(scount%2==0)total_count+=scount/2;
    else total_count+=(scount/2)+1;
    total_count+=count1;
    total_count+=count2;
    return total_count;
}
int main()
{
    int n,k;
    scanf("%d%d",&n,&k);
    printf("%d\n",day(n,k));

    return 0;
}
