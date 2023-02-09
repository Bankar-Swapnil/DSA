#include<iostream>
using namespace std;

 
 int main()
{
    // int A[3][3]={{1,2,3},{4,5,6},{7,8,9,}};
    int n;
    cin>>n;
    int A[n][n];

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cin>>A[i][j];
        }
    }

    cout<<endl;
    
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cout<<A[i][j]<<" ";
        }
        cout<<endl;
    }

    cout<<endl;

    for (int i = 0; i < n; i++)
    {
        for (int j = i; j < n; j++)
        {
            int temp = A[i][j];
            A[i][j] = A[j][i];
            A[j][i] = temp;
        }
        
    }
    
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cout<<A[i][j]<<" ";
        }
        cout<<endl;
    }
    
    return 0;
}