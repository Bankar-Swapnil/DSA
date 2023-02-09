#include<iostream>
using namespace std;

 
 int main()
{
    bool found;
    int n,m;
    cin>>n>>m;
    int mat[n][m];
    int key ;
    cin>>key;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            cin>>mat[i][j];
        }
    }
    
    int r=0 ; int c =m-1;
    while (r<n && c>=0)
    {
        if (mat[r][c] == key)
        {
            found = true;
        }
        if (mat[r][c]>key)
        {
            c--;
        }
        else{
            r++;
        }
        
    }
    
    if (found==true)
    {
        cout<<("Element is found");
    }
    else{
        cout<<("Element is not found");
    }
    
    return 0;
}