#include<bits/stdc++.h>
using namespace std;
int main()
{
	int a,b,c,d;
	vector<int>number1;
	vector<int>number2;
	int i,j;
	scanf("%d%d%d%d",&a,&b,&c,&d);
	number1.push_back(b);
	number2.push_back(d);
	int x=1,y=1;
	while(x<=100){
		int num;
		num = b+a*x;
		number1.push_back(num);
		x++;
	}
	while(y<=100){
		int num1;
		num1 = d+c*y;
		number2.push_back(num1);
		y++;
	}
	int size1,size2;
	size1 = number1.size();
	size2 = number2.size();
	bool flag = true,flag1;
	i=0;
	int n;
	if(size1<=size2){
		for(i=0;i<size1;i++){
			flag1 = true;
			for(int j=0;j<size2;j++){
				if(number1[i]==number2[j]){
					n = number1[i];
					flag1 = false;
					break;
				}
			}
			if(flag1==false){
				flag=false;
				break;
			}
		}
		if(flag==false)printf("%d\n",n);
		else printf("-1\n");
	}
	else if(size1>size2){
		for(i=0;i<size2;i++){
			flag1 = true;
			for(int j=0;j<size1;j++){
				if(number2[i]==number1[j]){
					n = number1[i];
					flag1 = false;
					break;
				}
			}
			if(flag1==false){
				flag=false;
				break;
			}
		}
		if(flag==false)printf("%d\n",n);
		else printf("-1\n");
	}
}
