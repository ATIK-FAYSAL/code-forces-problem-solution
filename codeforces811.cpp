#include<bits/stdc++.h>
using namespace std;
int main()
{
    int number1,number2,sum=1;
    scanf("%d%d",&number1,&number2);
    int i=1;
    while(true)
    {
        if(number1<sum&&i%2!=0)
        {
            printf("Vladik\n");
            break;
        }
        else if(number2<sum&&i%2==0)
        {
            printf("Valera\n");
            break;
        }
        if(i%2!=0)
        {
            number1-=sum;
        }
        else
        {
            number2-=sum;
        }
        i++;
        sum++;
    }
}
