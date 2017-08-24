#include<stdio.h>
#include<cstring>
using namespace std;
int number[1103];
bool flag[1103];
int main()
{
	int i,j,sum=0,avg,k;
	int size;
	scanf("%d",&size);
	for(i=1;i<=size;i++){
		scanf("%d",&number[i]);
		sum+=number[i];
	}
	avg = sum/size;
	for(int j=1; j<=size; j++) {
			for(int k=1; k<=size; k++) {
				if(j==k)	continue; 
				if(flag[j]||flag[k])	continue;
				if(number[j]+number[k]==avg*2) {
					printf("%d %d\n",j,k);
					flag[j]=flag[k]=true;
				}
			}
		}
}
