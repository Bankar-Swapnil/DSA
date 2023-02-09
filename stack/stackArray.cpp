#include<iostream>
using namespace std;

#define n 100

class stack{
    int * arr;
    int top;

    public:
    stack(){
        arr = new int[n];
        top=-1;
    }

    void push(int x){
        if(top==n-1){
            cout<<"stack overflow"<<endl;
            return;
        }
        top++;
        arr[top]=x;
    }

    void pop(){
        if(top==-1){
            cout<<"stack is Empty"<<endl;
            return;
        }
        top--;
    }

    int stackTop(){
        if(top==-1){
            cout<<"stack is Empty"<<endl;
            return -1;
        }
        return arr[top];
    }

    bool empty(){
        return top==-1;
    }

};


int main(){
    stack s;
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    cout<<s.stackTop()<<endl;
    s.pop();
    s.pop();
    cout<<s.stackTop()<<endl;
}