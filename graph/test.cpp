#include<bits/stdc++.h>
using namespace std;

const int N = 1e5+2;
bool vis[N];
vector<int>arr[N];
vector<vector<int>>cc;
vector<int>c_cc;

// void dfs(int vertex){
//     // cout<<vertex<<endl;
//     vis[vertex]=true;
//     c_cc.push_back(vertex);
//     for(int child : arr[vertex]){
//         if(vis[child]) continue;
//         dfs(child);
//     }
// }


// int main(){

//     int n,m,x,y;

//     cin>>n>>m;
//     for(int i=0;i<n;i++){
//         cin>>x>>y;
//         arr[y].push_back(x);
//         arr[x].push_back(y);
//     }


//     for(int i=1;i<=n;i++){
//         if(vis[i]==true) continue;
//         c_cc.clear();
//         dfs(i);
//         cc.push_back(c_cc);
//     }

//     cout<<cc.size()<<endl;

//     for(auto c_cc:cc){
//         for(int vertex:c_cc)
//         {
//             cout<<vertex<<" ";
//         }
//         cout<<endl;
//     }
    
//     return 0;
// }



// void dfs(int vertex){
    
//     cout<<vertex<<" ";
//     vis[vertex]=true;
//     c_cc.push_back(vertex);
//     for(int child:arr[vertex]){
//         if(vis[child]) continue;
//         dfs(child);
//     }
// }

// int main(){

//     int n,m,x,y;
//     cin>>n>>m;

//     for(int i=0;i<m;i++){
//         cin>>x>>y;
//         arr[x].push_back(y);
//         arr[y].push_back(x);
//     }

//     dfs(1);

//     for(int i=1;i<=n;i++){
//         if(vis[i]==true)continue;
//         c_cc.clear();
//         dfs(i);
//         cc.push_back(c_cc);
//     }
//     cout<<cc.size()<<endl;

//     for(auto c_cc:cc){
//         for(int vertex:c_cc){
//             cout<<vertex<<" ";
//         }
//         cout<<endl;
//     }

// }


bool dfs(int vertex,int par){

    vis[vertex]=true;
    bool isLoopExist = false;
    for(int child:arr[vertex]){
        if(vis[child]&& child==par) continue;
        if(vis[child]) return true;
        isLoopExist |= dfs(child,vertex);
    }
    return isLoopExist;
}

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