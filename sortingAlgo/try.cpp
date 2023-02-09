#include<iostream>
using namespace std;


//to find the size of array
int main(){

    int arr[]={1,2,3,4,56,7,8,4,5};

    for (int i = 0; i < sizeof(arr)/sizeof(arr[0]); i++)
    {
        cout<<arr[i]<<" "<<i<<endl;
    }
    
}