#include<bits/stdc++.h>
using namespace std;
int main()
{
	int n,m,z,count=0,i,j;
	vector<int>arr1;
	vector<int>arr2;
	scanf("%d%d%d",&n,&m,&z);
	int x=1,y=1;
	while(true){
		int num;
		num = n*x;
		if(num>z)break;
		arr1.push_back(num);
		x++;
	}
	while(true){
		int num ;
		num = m*y;
		if(num>z)break;
		arr2.push_back(num);
		y++;
	}
	for(i=0;i<arr1.size();i++){
		for(j=0;j<arr2.size();j++){
			if(arr2[j]==arr1[i])count++;
		}
	}
	printf("%d\n",count);
}
