//two trees are identical or not for both bst and bt;

#include<iostream>
using namespace std;


struct node{
    int data ;
    node * left;
    node * right;

    node(int val){
        data = val;
        left = NULL;
        right = NULL;
    }
};


bool isIdentical(node * root1,node * root2){
    if(root1 ==NULL && root2 == NULL){
        return true;
    }

    else if(root1 ==NULL || root2 == NULL){
        return false;
    }

    else{
        bool cond1 = root1->data == root2->data;
        bool cond2 = isIdentical(root1->left,root2->left);
        bool cond3 = isIdentical(root1->right,root2->right);
        if(cond1 && cond2 && cond3){
            return true;
        }
        return false;
    }
}

int main(){

    // node * root1 = new node(12);
    // root1->left = new node(9);
    // root1->right = new node(15);
    // root1->left->left = new node(5);
    // root1->left->right = new node(10);
    
    node * root1 = new node(10);
    root1->left = new node(11);
    root1->right = new node(15);
    root1->left->left = new node(13);
    root1->left->right = new node(1);

    node * root2 = new node(10);
    root2->left = new node(11);
    root2->right = new node(15);
    root2->left->left = new node(13);
    root2->left->right = new node(1);

    if(isIdentical(root1,root2)){
        cout<<"tree is identical"<<endl;
    }else{
        cout<<"tree is not identical"<<endl;
    }

    return 0;
}