#include<bits/stdc++.h>
#include<iostream>
using namespace std;

int main(){
    int arr[]={1,2,3,4,5,6};
    for (int i = 0; i < 6; i++)
    {
        cout<<arr[i]<<" ";
    }
    reverse(0,5);
    cout<<endl;
    for (int i = 0; i < 6; i++)
    {
        cout<<arr[i]<<" ";
    }

    
    return 0;
};