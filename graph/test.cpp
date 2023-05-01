#include<bits/stdc++.h>
using namespace std;

const int N = 1e5+2;
bool vis[N];
vector<int>arr[N];
vector<vector<int>>cc;
vector<int>c_cc;


// bool dfs(int vertex,int par){

//     vis[vertex]=true;
//     bool isLoopExist = false;
//     for(int child:arr[vertex]){
//         if(vis[child]&& child==par) continue;
//         if(vis[child]) return true;
//         isLoopExist |= dfs(child,vertex);
//     }
//     return isLoopExist;
// }

int main(){

    int n,m,x,y;
    cin>>n>>m;

    for(int i=0;i<m;i++){
        cin>>x>>y;
        arr[x].push_back(y);
        arr[y].push_back(x);
    }

    bool isLoopExist = false;
    for(int i=1;i<=n;i++){
        if(vis[i]==true)continue;
        if(dfs(i,0)){
            isLoopExist = true;
            break;
        }

    }
    cout<<isLoopExist<<endl;

}