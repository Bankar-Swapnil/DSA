#include<iostream>
using namespace std;

int main(){
    int row,col;
    // cin>>row>>col;
    cin>>row;
    //rectangle
    // for (int i = 0; i < row; i++)
    // {
    //     for (int j = 0; j < col; j++)
    //     {
    //         cout<<(" * ");
    //     }
    //     cout<<endl;
        
    // }

    // * * * * 
    // *     *
    // *     *
    // * * * *   

    // for (int i = 1; i <= row; i++)
    // {
    //     for (int j = 1; j <=col; j++)
    //     {
    //         if (i==1 || i==row || j==1 || j==col)
    //         {
    //             cout<<(" * ");
    //         }
    //         else{
    //             cout<<("   ");
    //         }
            
    //     }
    //     cout<<endl;
        
    // }


    //INVERTED HALF PYRAMID
    
    // for (int i = row; i >= 1; i--)
    // {
    //     for (int j = 1; j <= i; j++)
    //     {
    //         cout<<(" * ");
            
    //     }
    //     cout<<endl;
        
    // }

    //HALF PYRAMID AFTER 180 ROTATION

    // for (int i = 1; i <= row; i++)
    // {
    //     for (int j = 1; j <= row; j++)
    //     {
    //         if (j<=row-i)
    //         {
    //            cout<<("   ");
    //         }
    //         else{
    //             cout<<(" * ");
    //         }
            
    //     }
        
    //     cout<<endl;
        
    // }


    // HALF PYRAMID using number

    // for (int i = 1; i <= row; i++)
    // {
    //     for (int j = 1; j <= row; j++)
    //     {
    //         if (j<=i)
    //         {
    //            cout<<(i);
    //         }
    //         else{
    //             cout<<(" ");
    //         }
            
    //     }
        
    //     cout<<endl;
        
    // }

    //floyd's PYRAMID
    // int count =1;
    // for (int i = 1; i <= row; i++)
    // {
    //     for (int j = 1; j <= i; j++)
    //     {
    //         cout<<(count)<<" ";
    //         count = count+1;
    //     }
        
    //     cout<<endl;
        
    // }

    //BUTTERFLY PATTERN CODE
    //formula to calculate space is 2*number of row input - 2* current row index

    // for (int  i = 1; i <= row ; i++)
    // {
    //     for (int j = 1; j <=i ; j++)
    //     {
    //         cout<<(" * ");
    //     }
    //     int space = 2*row - 2*i;
    //     for (int j = 1; j <=space ; j++)
    //     {
    //         cout<<("   ");
    //     }
    //     for (int j = 1; j <=i ; j++)
    //     {
    //         cout<<(" * ");
    //     }
    //     cout<<endl;
        
    // }
    // for (int  i = row; i >=1 ; i--)
    // {
    //     for (int j = 1; j <=i ; j++)
    //     {
    //         cout<<(" * ");
    //     }
    //     int space = 2*row - 2*i;
    //     for (int j = 1; j <=space ; j++)
    //     {
    //         cout<<("   ");
    //     }
    //     for (int j = 1; j <=i ; j++)
    //     {
    //         cout<<(" * ");
    //     }
    //     cout<<endl;
        
    // }

    // inverted number pattern
    
    // for (int i = row; i >= 1; i--)
    // {
    //     for (int j = 1; j <= i; j++)
    //     {
    //         cout<<(j)<<" ";
    //     }
    //     cout<<endl;
    // }
    
    // 0-1 PYRAMID 

    // for (int i = 1; i <= row; i++)
    // {
    //     for(int j = 1; j<= i; j++){
    //         if ((i+j)%2==0)
    //         {
    //             cout<<("1")<<" ";
    //         }
    //         else{
    //             cout<<("0")<<" ";
    //         }
            
    //     }
    //     cout<<endl;
    // }

    // RHOMBUS PATTERN
    
    // for (int i = 1; i <= row; i++)
    // {
    //     for (int j = 1; j <=row-i; j++)
    //     {
    //         cout<<(" ");
    //     }
    //     for (int j = 0; j <= row; j++)
    //     {
    //         cout<<(" * ");
    //     }
    //     cout<<endl;
    // }

    // NUMBER PATTERN

    // for (int i = 1; i <= row; i++)
    // {
        
    //     for (int j = 1; j <=row-i; j++)
    //     {
    //         cout<<(" ");
    //     }
    //     for (int j=1; j <= i; j++)
    //     {
    //         cout<<(j)<<" ";
    //     }
    //     cout<<endl;
    // }

    // palindromic pattern

    // for (int i = 1; i <= row; i++)
    // {
    //     int j;
        
    //     for (j = 1; j <=row-i; j++)
    //     {
    //         cout<<("  ");
    //     }
    //     int k = i;
    //     for (; j <= row; j++)
    //     {
    //         cout<<(k--)<<" ";
    //     }
    //     k = 2;
    //     for (; j <= row+i-1; j++)
    //     {
    //         cout<<(k++)<<" ";
    //     }
    //     cout<<endl;
    // }

    // STAR PATTERN

    // for (int i = 1; i <= row; i++)
    // {
    //     int j;
    //     for(j = 1; j <= row-i; j++){
    //         cout<<("   ");
    //     }

    //     for(; j <= row; j++){
    //         cout<<(" * ");
    //     }
    //     for(; j <= row+i-1; j++){
    //         cout<<(" * ");
    //     }
        
    //     cout<<endl;
    // }
    // for (int i = row; i >=1; i--)
    // {
    //     int j;
    //     for(j = 1; j <= row-i; j++){
    //         cout<<("   ");
    //     }

    //     for(; j <= row; j++){
    //         cout<<(" * ");
    //     }
    //     for(; j <= row+i-1; j++){
    //         cout<<(" * ");
    //     }
        
    //     cout<<endl;
    // }
    
    // ZIG ZAG PATTERN

    // for (int i = 1; i <= 3; i++)
    // {
    //     for(int j = 1; j <= row; j++ ){
    //         if(((i+j)%4==0) || (i==2 && j%4==0)){
    //             cout<<(" * ");
    //         }
    //         else{
    //             cout<<("   ");
    //         }
    //     }
    //     cout<<endl;
    // }
    

    return 0;
    
}