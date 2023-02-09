#include<iostream>
#include<cmath>
using namespace std;


main(){
    int n;
    cin>>n;
    int reverse;

    while (n>0)
    {
        int lastDigit = n%10;
        reverse = reverse*10+lastDigit;
        n=n/10;
    }
    cout<<(reverse);
    return 0;
}