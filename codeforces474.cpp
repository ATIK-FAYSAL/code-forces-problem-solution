#include<iostream>
#include<string>
using namespace std;
int main()
{
	string input;
	char ch;
	int len,i;
	cin>>ch;
	cin>>input;
	len = input.length();
		if(ch =='L'){
            for(i=0;i<len;i++){
                if(input[i]=='w'){
                    cout<<"q";
                }
                else if (input[i]=='e'){
                    cout<<"w";
                }
                else if (input[i]=='r'){
                    cout<<"e";
                }
                else if (input[i]=='t'){
                    cout<<"r";
                }
                else if (input[i]=='y'){
                    cout<<"t";
                }
                else if (input[i]=='u'){
                    cout<<"y";
                }
                else if (input[i]=='i'){
                    cout<<"u";
                }
                else if (input[i]=='o'){
                    cout<<"i";
                }
                else if (input[i]=='p'){
                	cout<<"o";
                }
                else if (input[i]=='s'){
                    cout<<"a";
                }
                else if (input[i]=='d'){
                    cout<<"s";
                }
                else if (input[i]=='f'){
                    cout<<"d";
                }
                else if (input[i]=='g'){
                    cout<<"f";
                }
                else if (input[i]=='h'){
                    cout<<"g";
                }
                else if (input[i]=='j'){
                    cout<<"h";
                }
                else if (input[i]=='k'){
                    cout<<"j";
                }
                else if (input[i]=='l'){
                    cout<<"k";
                }
                else if (input[i]==';'){
                    cout<<"l";
                }
                else if (input[i]=='x'){
                    cout<<"z";
                }
                else if (input[i]=='c'){
                    cout<<"x";
                }
                else if (input[i]=='v'){
                    cout<<"c";
                }
                else if (input[i]=='b'){
                	cout<<"v";
                }
                else if (input[i]=='n'){
                    cout<<"b";
                }
                else if (input[i]=='m'){
                    cout<<"n";
                }
                else if (input[i]==','){
                    cout<<"m";
                }
                else if (input[i]=='.'){
                    cout<<",";
                }
                else if (input[i]=='/'){
                    cout<<(".");
                }
                else {
                    cout<<input[i];
                }
            }
        }
        if(ch =='R'){
            for(i=0;i<len;i++){
                if(input[i]=='q'){
                	cout<<"w";
                }
                else if (input[i]=='w'){
                	cout<<"e";
                }
                else if (input[i]=='e'){
                    cout<<"r";
                }
                else if (input[i]=='r'){
                    cout<<"t";
                }
                else if (input[i]=='t'){
                    cout<<"y";
                }
                else if (input[i]=='y'){
                    cout<<"u";
                }
                else if (input[i]=='u'){
                    cout<<"i";
                }
                else if (input[i]=='i'){
                    cout<<"o";
                }
                else if (input[i]=='o'){
                    cout<<"p";
                }
                else if (input[i]=='a'){
                    cout<<"s";
                }
                else if (input[i]=='s'){
                    cout<<"d";
                }
                else if (input.charAt(i)=='d'){
                    System.out.print("f");
                }
                else if (input.charAt(i)=='f'){
                    System.out.print("g");
                }
                else if (input.charAt(i)=='g'){
                    System.out.print("h");
                }
                else if (input.charAt(i)=='h'){
                    System.out.print("j");
                }
                else if (input.charAt(i)=='j'){
                    System.out.print("k");
                }
                else if (input.charAt(i)=='k'){
                    System.out.print("l");
                }
                else if (input.charAt(i)=='l'){
                    System.out.print(";");
                }
                else if (input.charAt(i)=='z'){
                    System.out.print("x");
                }
                else if (input.charAt(i)=='x'){
                    System.out.print("c");
                }
                else if (input.charAt(i)=='c'){
                    System.out.print("v");
                }
                else if (input.charAt(i)=='v'){
                    System.out.print("b");
                }
                else if (input.charAt(i)=='b'){
                    System.out.print("n");
                }
                else if (input.charAt(i)=='n'){
                    System.out.print("m");
                }
                else if (input.charAt(i)=='m'){
                    System.out.print(",");
                }
                else if (input.charAt(i)==','){
                    System.out.print(".");
                }
                else if (input.charAt(i)=='.'){
                    System.out.print("/");
                }
                else {
                    System.out.print(input.charAt(i));
                }
            }
        }
}
