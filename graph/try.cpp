// #include<bits/stdc++.h>
// using namespace std;

// const int N = 1e5+2;
// bool vis[N];
// vector<int>adj[N];
// vector<vector<int>> cc;
// vector<int>current_cc;

// void dfs(int vertex){
//     // cout<<vertex<<endl;
//     vis[vertex] = true;
//     current_cc.push_back(vertex);
//     for(int childs: adj[vertex]){
//         // cout<<"par "<<vertex<<" child "<<childs<<endl;
//         if (vis[childs]) continue;
//         dfs(childs);
//     }
// }



// int main(){

//     int n,m;
//     cin>>n>>m;

//     int x,y;

//     for(int i=0;i<m;i++){

//         cin>>x>>y;
//         adj[x].push_back(y);
//         adj[y].push_back(x);

//     }

//     for(int i=1;i<=n;i++){
//         if(vis[i]) continue;
//         current_cc.clear();
//         dfs(i);
//         cc.push_back(current_cc);
//     }

//     cout<<cc.size()<<endl;

//     for(auto c_cc: cc){
//         for(int vertex: c_cc)
//         {
//             cout<<vertex<<" ";
//         }
//         cout<<endl;
//     }

// }


#include<bits/stdc++.h>
using namespace std;

const int N = 1e5+2;
bool vis[N];
vector<int>adj[N];


bool dfs(int vertex,int par){
    vis[vertex] = true;
    bool isLoopExist =  false;
    for(int childs: adj[vertex]){
        if(vis[childs] && childs==par) continue;
        if (vis[childs]) return true;
        isLoopExist |= dfs(childs,vertex);
    }
}



int main(){

    int n,m;
    cin>>n>>m;

    int x,y;

    for(int i=0;i<m;i++){

        cin>>x>>y;
        adj[x].push_back(y);
        adj[y].push_back(x);

    }
    bool isLoopExist=false;

    for(int i=1;i<=n;i++){
        if(vis[i]) continue;
        if(dfs(i,0)){
            isLoopExist = true;
            break;
        }

    }

    cout<<isLoopExist<<endl;

}