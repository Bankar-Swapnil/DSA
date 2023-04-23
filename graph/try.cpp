#include<bits/stdc++.h>
using namespace std;

const int N = 1e5+2;
bool vis[N];
vector<int>adj[N];
vector<vector<int>> cc;
vector<int>current_cc;
int level[N];


// // void dfs(int vertex){
// //     // cout<<vertex<<endl;
// //     vis[vertex] = true;
// //     current_cc.push_back(vertex);
// //     for(int childs: adj[vertex]){
// //         // cout<<"par "<<vertex<<" child "<<childs<<endl;
// //         if (vis[childs]) continue;
// //         dfs(childs);
// //     }
// // }



// // int main(){

// //     int n,m;
// //     cin>>n>>m;

// //     int x,y;

// //     for(int i=0;i<m;i++){

// //         cin>>x>>y;
// //         adj[x].push_back(y);
// //         adj[y].push_back(x);

// //     }

// //     for(int i=1;i<=n;i++){
// //         if(vis[i]) continue;
// //         current_cc.clear();
// //         dfs(i);
// //         cc.push_back(current_cc);
// //     }

// //     cout<<cc.size()<<endl;

// //     for(auto c_cc: cc){
// //         for(int vertex: c_cc)
// //         {
// //             cout<<vertex<<" ";
// //         }
// //         cout<<endl;
// //     }

// // }


// // #include<bits/stdc++.h>
// // using namespace std;

// // const int N = 1e5+2;
// // bool vis[N];
// // vector<int>adj[N];


// // bool dfs(int vertex,int par){
// //     vis[vertex] = true;
// //     bool isLoopExist =  false;
// //     for(int childs: adj[vertex]){
// //         if(vis[childs] && childs==par) continue;
// //         if (vis[childs]) return true;
// //         isLoopExist |= dfs(childs,vertex);
// //     }
// // }



// // int main(){

// //     int n,m;
// //     cin>>n>>m;

// //     int x,y;

// //     for(int i=0;i<m;i++){

// //         cin>>x>>y;
// //         adj[x].push_back(y);
// //         adj[y].push_back(x);

// //     }
// //     bool isLoopExist=false;

// //     for(int i=1;i<=n;i++){
// //         if(vis[i]) continue;
// //         if(dfs(i,0)){
// //             isLoopExist = true;
// //             break;
// //         }

// //     }

// //     cout<<isLoopExist<<endl;

// // }





// #include<bits/stdc++.h>
// using namespace std;

// const int N = 1e5+2;
// bool vis[N];
// vector<int>adj[N];
// int level[N];

// void bfs(int vertex){
//     queue<int>q;
//     q.push(vertex);
//     vis[vertex] = 1;
//     while (!q.empty())
//     {
//         int curr_v = q.front();
//         q.pop();
//         cout<<curr_v<<" ";
//         for(int child: adj[curr_v]){
//             if(!vis[child]){
//                 q.push(child);
//                 vis[child]=1;
//                 level[child]=level[curr_v];
//             }
//         }
//     }
    
// }



// int main(){

//     int n;
//     cin>>n;

//     int x,y;

//     for(int i=0;i<n-1;i++){

//         cin>>x>>y;
//         adj[x].push_back(y);
//         adj[y].push_back(x);

//     }
//     bfs(1);

// }



void bfs(int vertex){
    queue<int>q;
    q.push(vertex);
    vis[vertex]=true;

    while(!q.empty()){
        int cur = q.front();
        q.pop();
        cout<<cur<<" ";
        for(int child : adj[cur]){
            if(!vis[child]) {
                q.push(child);
                vis[child]=true;
                level[child] = level[cur]+1;
            }
        }
    }
}




int main(){

    int x,y,n,m;
    cin>>n>>m;
    for(int i=0;i<m;i++){
        cin>>n>>m;
        adj[x].push_back(y);
        adj[y].push_back(x);
    }

    return 0;
}