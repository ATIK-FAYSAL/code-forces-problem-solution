#include<bits/stdc++.h>
using namespace std;
int main()
{
    vector<int>number,subtract;
    int i,sub,mini,n;
    scanf("%d",&n);
    for(i=0;i<n;i++){
        int num;
        scanf("%d",&num);
        number.push_back(num);
    }
    sort(number.begin(),number.end());
    mini = number[1]-number[0];
    for(i=0;i<number.size()-1;i++){
        sub = number[i+1]-number[i];
        if(sub<0)sub*=-1;
        subtract.push_back(sub);
        if(mini>sub){
            mini=sub;
        }
    }
    int count=0;
    for(i=0;i<subtract.size();i++){
        if(mini==subtract[i])count++;
    }
    printf("%d %d\n",mini,count);
}
