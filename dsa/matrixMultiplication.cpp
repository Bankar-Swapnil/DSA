#include<iostream>
using namespace std;

 
 int main()
{
    // int A[3][3]={{1,2,3},{4,5,6},{7,8,9,}};
    int n1,n2,n3;
    cin>>n1>>n2>>n3;
    int A[n1][n2];
    int B[n2][n3];

    int ans [n1][n3];
    cout<<("Enter value of matrix A \n");
    for (int i = 0; i < n1; i++)
    {
        for (int j = 0; j < n2; j++)
        {
            cin>>A[i][j];
        }
    }

    cout<<endl;
    cout<<("Enter value of matrix b \n");
    for (int i = 0; i < n2; i++)
    {
        for (int j = 0; j < n3; j++)
        {
            cin>>B[i][j];
        }
    }
    
    cout<<endl;

    for (int i = 0; i < n1; i++)
    {
        for (int j = 0; j < n3; j++)
        {
            ans[i][j]=0;
        }
    }

    for (int i = 0; i < n1; i++)
    {
        for (int j = 0; j < n3; j++)
        {
            for (int k = 0; k < n2 ; k++)
            {
                ans[i][j] += A[i][k]*B[k][j];
            }
            
        }
        
    }
    
    for (int i = 0; i < n1; i++)
    {
        for (int j = 0; j < n3; j++)
        {
            cout<<ans[i][j]<<" ";
        }
        cout<<endl;
    }
    
    return 0;
}