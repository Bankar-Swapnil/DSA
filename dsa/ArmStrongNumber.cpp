#include<iostream>
#include<math.h>
using namespace std;

//ArmStrong number is a number in which sum of cube of each digit is equal to that number

main(){
    int n;
    cin>>n;
    int sum=0;
    int originaln=n;
    while (n>0)
    {
        int lastDigit = n%10;
        sum += pow(lastDigit,3);
        n=n/10;
    }
    if (sum==originaln)
    {
        cout<<("given number is a armstrong number")<<endl;
    }
    else{
        cout<<("given number is not a armstrong number")<<endl;
    }
    
}