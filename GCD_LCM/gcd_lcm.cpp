#include<iostream>
using namespace std;

int gcd(int a,int b){
    if(b == 0){
        return a;
    }
    return gcd(b,a%b);
}

int lcd(int a,int b){
    return (a*b)/gcd(a,b);
}


int main(){

    cout<<gcd(12,18)<<"\n";
    cout<<lcd(12,18);
    return 0;

}