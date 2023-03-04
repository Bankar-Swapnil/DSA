#include<bits/stdc++.h>
using namespace std;



int main(){

    //syntax to define max heap i   STL 
    priority_queue<int,vector<int>>pq;

    pq.push(1);
    pq.push(3);
    pq.push(5);
    cout<<pq.top()<<endl;

    //syntax to define min heap in STL

    priority_queue<int,vector<int>,greater<int>>pqm;

    pqm.push(3);
    pqm.push(4);
    pqm.push(6);

    cout<<pqm.top()<<endl;

    return 0;
}