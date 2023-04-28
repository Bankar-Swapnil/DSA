#include<iostream>
#include<bits/stdc++.h>
using namespace std;


#define n 20

// class queue{
//     int * arr;
//     int front;
//     int back;

//     public:

//     queue(){
//         arr = new int[n];
//         front =-1;
//         back =-1;
//     }

//     void enQueue(int val){
//         if(back==n-1){
//             cout<<"queue is full"<<endl;
//             return;
//         }
//         back++;
//         arr[back]=val;

//         if(front==-1){
//            front++;
//         }
//     }

//     void deQueue(){
//         if(front ==-1 || front>back){
//             cout<<"queue is empty"<<endl;
//             return;
//         }
//         front++;
//     }

//     int peak(){
//          if(front ==-1 || front>back){
//             cout<<"queue is empty"<<endl;
//             return -1;
//         }
//         return arr[front];
//     }

//     bool empty(){
//         if(front ==-1 || front>back){
//             return true;
//         }
//         return false;
//     }

// };

// int main(){

//     queue q;
//     q.enQueue(1);
//     q.enQueue(2);
//     q.enQueue(3);
//     q.enQueue(4);

//     cout<<q.peak()<<endl;
//     q.deQueue();
//     cout<<q.peak()<<endl;
//     cout<<q.empty()<<endl;


//     return 0;
// }



// struct node{
//     public:
//     int data;
//     node * next;

//     node(int val){
//         data = val;
//         next =NULL;
//     }

// };

// class queue{
//     node * front;
//     node * back;


//     public:
//     queue(){
//         front=NULL;
//         back=NULL;
//     }

//     void push(int val){
//         node * a=new node(val);
//         if(front==NULL){
//             back=a;
//             front=a;
//             return;
//         }
//         back->next=a;
//         back=a;
//     }

//     void pop(){

//         if(front==NULL){
//             cout<<"queue is empty";
//             return;
//         }
//         node * toDelete=front;
//         front=front->next;
//         delete toDelete;

//     }

//     int peak(){

//         if(front==NULL){
//             return -1;
//         }

//         return front->data;
//     }

//     bool isEmpty(){

//         if(front==NULL){
//             return true;
//         }
//         return false;
//     }
// };

// int main(){

//     queue q;

//     q.push(1);
//     q.push(3);
//     q.push(2);

//     cout<<q.peak()<<endl;
//     q.pop();
//     cout<<q.peak()<<endl;
//     q.pop();
//     cout<<q.peak()<<endl;q.pop();
//     cout<<q.peak()<<endl;



//     return 0;
// }


// class que{

    

//     stack<int>s1;
//     stack<int>s2;
//     public:

//     void push(int val){
//         s1.push(val);
//     }

//     int pop(){

//         if(s1.empty() && s2.empty()){
//             cout<<"queue is empty";
//             return -1;
//         }
//         if(s2.empty()){ 
//             while(!s1.empty()){
//                 s2.push(s1.top());
//                 s1.pop();
//             }
//         }
//         int ele = s2.top();
//         s2.pop();
//         return ele;
//     }

//     bool empty(){
//         if(s1.empty() && s2.empty()){
//             return true;
//         }
//         return false;
//     }

// };


// int main(){

//     que q;
//     q.push(2);
//     q.push(3);
//     q.push(5);

//     cout<<q.pop()<<endl;
//     cout<<q.pop()<<endl;
//     cout<<q.pop()<<endl;

//     return 0;
// }


class stack1{

    int a;
    queue<int>q1;
    queue<int>q2;

    public:

    stack1(){
        a=0;
    }

    void push(int val){
        q2.push(val);
        a++;
        while(!q1.empty()){
            q2.push(q1.front());
            q1.pop();
        }

        queue<int>temp=q1;
        q1=q2;
        q2=temp;
    }

    void pop(){
        if(q1.empty() && q2.empty()){
            cout<<"stack is empty"<<endl;
            return;
        }
        q1.pop();
        a--;
    }

    int top(){
        if(q1.empty() && q2.empty()){  
            return -1;
        }
        return q1.front();
    }

    int size(){
        return a;
    }

};

int main(){

    stack1 s;
    // s.push(2);
    // s.push(3);
    // s.push(5);
    s.push(6);

    cout<<s.top()<<endl;

    s.pop();
    cout<<s.top()<<endl;
    s.pop();
    cout<<s.top()<<endl;
    s.pop();
    cout<<s.top()<<endl;
    s.pop();
    cout<<s.top()<<endl;
    cout<<s.size()<<endl;


    return 0;
}