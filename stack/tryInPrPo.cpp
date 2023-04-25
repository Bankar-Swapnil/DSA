#include<iostream>
using namespace std;
#include<stack>
#include<math.h>
#include<bits/stdc++.h>

// void preEval(string s){

//     stack<int>st;

//     for(int i=s.length()-1;i>=0;i--){

//         if(s[i]>='0' && s[i]<='9'){
//             st.push(s[i]-'0');
//         }else{
//             int a=st.top();
//             st.pop();
//             int b = st.top();
//             st.pop();
//             switch(s[i]){
//                 case '+':
//                     st.push(a+b);
//                     break;
//                 case '-':
//                     st.push(a-b);
//                     break;
//                 case '*':
//                     st.push(a*b);
//                     break;
//                 case '/':
//                     st.push(a/b);
//                     break;
//                 case '^':
//                     st.push(pow(a,b));
//                     break;

//             }
//         }
        

//     }
//     cout<<st.top()<<endl;

// }

// int postEval(string s){

//     stack<int>st;

//     for(int i=0;i<s.length();i++){

//         if(s[i]>='0' && s[i]<='9'){
//             st.push(s[i]-'0');
//         }else{
//             int b=st.top();
//             st.pop();
//             int a = st.top();
//             st.pop();
//             switch(s[i]){
//                 case '+':
//                     st.push(a+b);
//                     break;
//                 case '-':
//                     st.push(a-b);
//                     break;
//                 case '*':
//                     st.push(a*b);
//                     break;
//                 case '/':
//                     st.push(a/b);
//                     break;
//                 case '^':
//                     st.push(pow(a,b));
//                     break;

//             }
//         }
        
//     }
//     return st.top();

// }

// int main(){

//     // string s;

//     // s="-+7*45+20";

//     // preEval(s);
    
//     cout<<postEval("46+2/5*7+");

//     return 0;

// }



int precs(char c){

    if(c=='^'){
        return 3;
    }
    if(c=='*'|| c=='/'){
        return 2;
    }
    if(c=='+' || c=='-'){
        return 1;
    }
    else{
        return -1;
    }
}

string infixToPrefix(string s){

    reverse(s.begin(),s.end());
    stack<char>st;
    string res;

    // for(int i=0;i<s.length();i++){
    //     if(s[i]=='('){
    //         s[i]=')';
    //     }
    //     if(s[i]==')'){
    //         s[i]=='(';
    //     }
    // }

    for(int i=0;i<s.length();i++){

        if(s[i]>='a' && s[i]<='z' || s[i]>='A' && s[i]<='Z' ) {
            res+=s[i];

        }else if(s[i]==')'){
            st.push(s[i]);
        }
        else if(s[i]=='('){
            while (!st.empty() && st.top()!=')')
            {
                res+=st.top();
                st.pop();
            }
            if(!st.empty()){
                st.pop();
            }
            
        }else{
            while(!st.empty() && precs(s[i])<=precs(st.top())){
                res+=st.top();
                st.pop();

            }
            st.push(s[i]);
        }
    }

    while(!st.empty()){
        res+=st.top();
        st.pop();
    }

    // for(int i=0;i<s.length();i++){
    //     if(s[i]=='('){
    //         s[i]=')';
    //     }
    //     if(s[i]==')'){
    //         s[i]=='(';
    //     }
    // }
    
    reverse(res.begin(),res.end());


    return res;
}




int main(){

    cout<<infixToPrefix("(a-b/c)*(a/k-l)")<<endl;
    return 0;
}