#include<bits/stdc++.h>
using namespace std;


const int N = 1e5+2;
bool vis[N];
vector<int> adj[N];


void dfs(int node){

    //preorder
    vis[node] = 1;
    cout<<node<<" ";

    //inorder

    vector<int> :: iterator it;

        for(it = adj[node].begin();it != adj[node].end();it++){
            if(vis[*it]);
            else{
                dfs(*it);
            }
        }
    
    //postorder

        // cout<<node<<" ";
}

int main(){

    int n,m;  //number of node and edges;

    cin>>n>>m;

    for(int i =0;i<n;i++){
        vis[i]= false;
    }


    int x,y;  //variable to take edges input

    for(int i =0;i<m;i++){
        cin>>x>>y;

        adj[x].push_back(y);
        adj[y].push_back(x);
    }
 
    // dfs(1);


    //code for connected graph count

    // int count =0;

    // for(int i=1;i<=n;i++){
    //     if(vis[i]) continue;
    //     dfs(i);
    //     count++;
    // }

    // cout<<count<<endl;



    return 0;
}



// #include<bits/stdc++.h>
// using namespace std;

// const int N = 1e5+2;
// bool vis[N];
// vector<int> adj[N];

// void dfa(int vertex){

//     cout<<vertex<<endl;

//     vis[vertex]= true;

//     for(int child: adj[vertex]){
//         if(vis[child]) continue;

//         dfa(child);
//     }
// }



// int main(){

//     int n,m;

//     cin>>n>>m;

//     for(int i=0;i<m;i++){
//         int x,y;
//         cin>>x>>y;

//         adj[x].push_back(y);
//         adj[y].push_back(x);
//     }

//     dfa(1);


    //code for connected graph count
    
    // int count =0;

    // for(int i=1;i<=n;i++){
    //     if(vis[i]) continue;
    //     dfs(i);
    //     count++;
    // }

    // cout<<count<<endl;

    
// }