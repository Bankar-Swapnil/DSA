#include <iostream>
using namespace std;

int main()
{

    int row, col;
    cin >> row >> col;

    // for(int i=0;i<row;i++){
    //     for(int j=0;j<col;j++){
    //         cout<<"*"<<" ";
    //     }
    //     cout<<endl;
    // }

    // for(int i=1;i<=row;i++){
    //     for(int j=1;j<=col;j++){
    //         if(i==1 || i==row || j==1 || j==col){
    //             cout<<"*";
    //         }
    //         else{
    //             cout<<" ";
    //         }
    //     }
    //     cout<<endl;
    // }

    // for(int i=row;i>=1;i--){
    //     for(int j=1;j<=i;j++){
    //         cout<<"*";
    //     }
    //     cout<<endl;
    // }

    // for(int i=1;i<=row;i++){
    //     for(int j=1;j<=row;j++){
    //         if(j<=row-i){
    //             cout<<" ";
    //         }else{
    //             cout<<"*";
    //         }
    //     }
    //     cout<<endl;
    // }

    // for(int i=1;i<=row;i++){
    //     for(int j=1;j<=i;j++){
    //         cout<<i<<" ";
    //     }
    //     cout<<endl;
    // }
    // int d=1;
    // for(int i=1;i<=row;i++){
    //     for(int j=1;j<=i;j++){
    //         cout<<d<<" ";
    //         d++;
    //     }
    //     cout<<endl;
    // }

    // new approach for butterfly pattern;

    // for(int i=1;i<=row;i++){
    //     for(int j=1;j<=row;j++){
    //         if(j<=i){
    //             cout<<"*";
    //         }
    //         else{
    //             cout<<" ";
    //         }
    //     }
    //     for(int j=row;j>=1;j--){
    //         if(j<=i){
    //             cout<<"*";
    //         }
    //         else{
    //             cout<<" ";
    //         }
    //     }
    //     cout<<endl;
    // }
    // for(int i=row;i>=1;i--){
    //     for(int j=1;j<=row;j++){
    //         if(j<=i){
    //             cout<<"*";
    //         }
    //         else{
    //             cout<<" ";
    //         }
    //     }
    //     for(int j=row;j>=1;j--){
    //         if(j<=i){
    //             cout<<"*";
    //         }
    //         else{
    //             cout<<" ";
    //         }
    //     }
    //     cout<<endl;
    // }

    // for(int i=row;i>=1;i--){
    //     for(int j=1;j<=i;j++){
    //         cout<<j<<" ";
    //     }
    //     cout<<endl;
    // }

    // for(int i=1;i<=row;i++){
    //     for(int j=1;j<=i;j++){
    //         if((i+j)%2==0 ){
    //             cout<<"1"<<" ";
    //         }else{
    //             cout<<"0"<<" ";
    //         }
    //     }
    //     cout<<endl;
    // }

    // for(int i=row;i>=1;i--){
    //     for(int j=1;j<=row*2-1;j++){
    //         if(j<i){
    //             cout<<" ";
    //         }
    //         if(j>=row){
    //             cout<<"*";
    //         }
    //     }
    //     cout<<endl;
    // }

    // for (int i = row; i >= 1; i--)
    // {
    //     for (int j = 1; j <= row ; j++)
    //     {
    //         if(j<i){
    //             cout<<" ";
    //         }else{
    //             cout<<j-i+1<<" ";
    //         }
    //     }
    //     cout << endl;
    // }

    

    // for(int i =1;i<=row;i++){
    //     int j;
    //     for(j=1;j<=row-i;j++){
    //         cout<<" ";
    //     }
    //     int k = i; 
    //     for(;j<=row;j++){
    //         cout<<k--<<" ";
    //     }
    //     k=2;
    //     for(;j<=row+i-1;j++){
    //         cout<<k++<<" ";
    //     }
    //     cout<<endl;
    // }

    for(int i =1;i<=row;i++){
        int j;
        for(j=1;j<=row-i;j++){
            cout<<" ";
        }
        int k = i; 
        for(;j<=row;j++){
            cout<<"*";
        }
        k=2;
        for(;j<=row+i-1;j++){
            cout<<"*";
        }
        cout<<endl;
    }
    for(int i =row;i>=1;i--){
        int j;
        for(j=1;j<=row-i;j++){
            cout<<" ";
        }
        int k = i; 
        for(;j<=row;j++){
            cout<<"*";
        }
        k=2;
        for(;j<=row+i-1;j++){
            cout<<"*";
        }
        cout<<endl;
    }



    return 0;
}