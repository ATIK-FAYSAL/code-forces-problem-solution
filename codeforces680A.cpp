#include<bits/stdc++.h>
using namespace std;
int main()
{
	int arr[1000],number[100],sum=0,sum1=0;
	int i,count[100],j=0,count1=0;
	for(i=0;i<5;i++){
		scanf("%d",&number[i]);
		sum1+=number[i];
	}
	for(i=0;i<101;i++)arr[i]=0;
	for(i=0;i<5;i++){
		arr[number[i]]++;
	}
	int mini = sum;
	int a=0;
	bool flag = true,flag1 = true,flag2=true;
	for(i=0;i<101;i++){
		if(arr[i]==4){
			flag = false;
			count1+=i;
		}
		else if(arr[i]==2||arr[i]==3){
			count[j] = arr[i]*i;
			flag2 = false;
			j++;
		}
		else if(arr[i]==1){
			a++;
			sum+=i;
		}
		else if(arr[i]==5){
			printf("%d\n",number[0]+number[1]);
			flag1 = false;
			break;
		}
	}
	if(a==5)printf("%d\n",sum);
	else {
		int min = sum1;
		for(i=0;i<j;i++){
			if(min>count[i])min = count[i];
		}
		if(flag2 == false&&a==3)printf("%d\n",sum);
		else if(flag2==false&&a==2)printf("%d\n",sum);
		else if(flag == false)printf("%d\n",sum+count1);
		else if(flag1==true) printf("%d\n",sum+min);
	}
}
