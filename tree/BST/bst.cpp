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


node * insertBST(node * root ,int val){
    if(root == NULL){
        return new node(val);
    }
    if(val > root->data){
        root->right = insertBST(root->right,val);
    }
    else{
        root->left = insertBST(root->left,val);
    }
    return root;
}

void inorder(node * root){
    if(root == NULL){
        return ;
    }
    inorder(root->left);
    cout<<root->data<<" ";
    inorder(root->right);
}


int main(){

    node * root = new node(5);
    insertBST(root,2);
    insertBST(root,3);
    insertBST(root,1);
    insertBST(root,8);
    insertBST(root,7);
    insertBST(root,9);
    insertBST(root,6);
    inorder(root);


    return 0;
}