#include<iostream>
using namespace std;
#include<stack>
#include <string>
#define n 100

// class stack{
//     int *arr;
//     int top;

//     public:

//     stack(){
//         top=-1;
//         arr = new int[n];
//     }


//     void push(int val){
//         if(top==n-1){
//             cout<<"stack if overflow"<<endl;
//             return;
//         }
//         top++;
//         arr[top]=val;

//     }

//     void pop(){
//         if(top==-1){
//             cout<<"stack is empty"<<endl;
//             return;
//         }
//         top--;
//     }

//     int Top(){
//         if(top==-1){
//             cout<<"stack is empty"<<endl;
//             return -1;
//         }
//         return arr[top];
//     }
    
//     bool isEmpty(){
//         if(top==-1){
//             cout<<"stack is empty"<<endl;
//             return true;
//         }
//         return false;
//     }
// };



// int main(){
//     stack st;
//     st.push(1);
//     st.push(2);
//     st.push(3);
//     st.push(4);
//     st.push(5);
//     st.push(6);
//     cout<<st.Top()<<endl;
//     st.pop();
//     st.pop();
//     st.pop();
//     st.pop();
//     st.pop();
//     st.pop();
//     cout<<st.Top()<<endl;

//     cout<<st.isEmpty()<<endl;

//     return 0;
// }


// void reSt(string s){

//     stack<string>st;

//     for(int i=0;i<s.length();i++){
//         string word="";

//         while (s[i]!=' ' && i<s.length())
//         {
//             word += s[i];
//             i++;
//         }

//         st.push(word);
        
//     }
//     while (!st.empty())
//     {
//         cout<<st.top()<<" ";
//         st.pop();
//     }cout<<endl;
    
// }

// int main(){
//     string st;
//     getline(cin,st);

//     reSt(st);
// }

void insertAtBottom(stack<int> &st,int ele){
    if(st.empty()){
        st.push(ele); 
        return ;
    }
    int element=st.top();
    st.pop();
    insertAtBottom(st,ele);
    st.push(element);
}

void reverse(stack<int> &st){
    if(st.empty()){
        return ;
    }
    int ele=st.top();
    st.pop();
    reverse(st);
    insertAtBottom(st,ele);
}

int main(){

    stack<int> st;
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);

    // while(!st.empty()){
    //     cout<<st.top()<<" ";
    //     st.pop();
    // }cout<<endl;

    reverse(st);
    while(!st.empty()){
        cout<<st.top()<<" ";
        st.pop();
    }cout<<endl;

    return 0;
}