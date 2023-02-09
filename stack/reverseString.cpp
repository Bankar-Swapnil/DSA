#include<iostream>
using namespace std;
#include<stack>

void reverseString(string s){
    stack<string> st;
    
    for (int i = 0; i < s.length(); i++)
    {
        string word="";
        while (s[i]!=' ' && i<s.length())
        {
            word+=s[i];
            i++;
        }
        st.push(word);
        
    }

    while (!st.empty())
    {
        cout<<st.top()<<" ";
        st.pop();
    }cout<<endl;
    
    
}

int main(){
    string s;
    cout<<"enter a string to reverse"<<endl;
    // cin>>s;
    getline(cin,s);
    reverseString(s);

}