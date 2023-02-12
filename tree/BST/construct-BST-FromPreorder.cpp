#include<iostream>
using namespace std;


struct node{
    int data;
    node * left;
    node * right;
    node(int val){
        data=val;
        left =NULL;
        right = NULL;
    }
};


node * constructBst(int preorder[],int *preOrderIdx,int key,int min,int max,int n){
    if(*preOrderIdx >= n){
        return NULL;
    }
    node * root =NULL;
    if(key>min && key<max){
        root = new node(key);
        *preOrderIdx = *preOrderIdx+1;
    
        if(*preOrderIdx < n){
            root->left = constructBst(preorder,preOrderIdx,preorder[*preOrderIdx],min ,key,n);
        }
        if(*preOrderIdx < n){
            root->right = constructBst(preorder,preOrderIdx,preorder[*preOrderIdx],key ,max,n);
        }
    }
    return root;
}


void preOrder(node * root){
    if(root==NULL){
        return;
    }
    cout<<root->data<<" ";
    preOrder(root->left);
    preOrder(root->right);
}

int main(){

    int preorder[]={10,2,1,13,11};
    int n = 5;
    int preOrderIdx=0;

    node * root=constructBst(preorder,&preOrderIdx,preorder[0],INT_MIN,INT_MAX,n);
    preOrder(root);

    return 0;
}