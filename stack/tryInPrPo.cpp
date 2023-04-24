#include<iostream>
using namespace std;
#include<stack>
#include<math.h>

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

int postEval(string s){

    stack<int>st;

    for(int i=0;i<s.length();i++){

        if(s[i]>='0' && s[i]<='9'){
            st.push(s[i]-'0');
        }else{
            int b=st.top();
            st.pop();
            int a = st.top();
            st.pop();
            switch(s[i]){
                case '+':
                    st.push(a+b);
                    break;
                case '-':
                    st.push(a-b);
                    break;
                case '*':
                    st.push(a*b);
                    break;
                case '/':
                    st.push(a/b);
                    break;
                case '^':
                    st.push(pow(a,b));
                    break;

            }
        }
        
    }
    return st.top();

}

int main(){

    // string s;

    // s="-+7*45+20";

    // preEval(s);
    
    cout<<postEval("46+2/5*7+");

    return 0;

}