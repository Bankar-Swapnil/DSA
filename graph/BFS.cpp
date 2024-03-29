#include<bits/stdc++.h>
using namespace std;


// const int N = 1e5+2;
// bool vis[N];
// vector<int> adj[N];


// int main(){

//     for(int i =0;i<N;i++){
//         vis[i]=0;
//     }

//     int n,m;  //number of node and edges;

//     cin>>n>>m;

//     int x,y;  //variable to take edges input

//     for(int i =0;i<m;i++){
//         cin>>x>>y;

//         adj[x].push_back(y);
//         adj[y].push_back(x);
//     }

//     queue<int> q;

//     q.push(1);
//     vis[1] = true;

//     while(!q.empty()){

//         int node = q.front();

//         q.pop();

//         cout<<node<<endl;

//         vector<int> :: iterator it;

//         for(it = adj[node].begin();it != adj[node].end();it++){
//             if(!vis[*it]){
//                 vis[*it] = 1;
//                 q.push(*it);
//             }
//         }
//     }


//     return 0;
// }


const int N = 1e5+2;
int vis[N];
vector<int> adj[N];
int level[N];


void bfs(int source){
    queue<int> q;
    q.push(source);
    vis[source] = 1;

    while(!q.empty()){
        int cur_v = q.front();
        q.pop();
        cout<< cur_v << " ";
        for(int child: adj[cur_v]){
            if(!vis[child]){
                q.push(child);
                vis[child]= 1;
                level[child] = level[cur_v] + 1;
            }

        }
    }

    cout<<endl;
}

int main(){

    int n;
    cin>>n;

    for(int i = 0 ; i<n-1 ; ++i){

        int x,y;
        cin>>x>>y;
        adj[x].push_back(y);
        adj[y].push_back(x);
    }

    bfs(1);

    for(int i=1;i<=n;i++){
        cout<< i <<": "<<level[i]<<endl;
    }

    return 0;
}