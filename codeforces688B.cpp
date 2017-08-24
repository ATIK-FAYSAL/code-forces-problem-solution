#include <bits/stdc++.h>
using namespace std;
int main()
{
	string str,str1;
	cin>>str;
	str1 = str;
	reverse(str.begin(),str.end());
	cout<<str1<<str<<endl;
	return 0;
}
