#include<iostream>
using namespace std;

struct node{

    int data;
    struct node* left;
    struct node* right;

    node(int val){
        data=val;
        left = NULL;
        right = NULL;
    }

};


void preOrder(node * root){
    if(root==NULL){
        return;
    }
    cout<<root->data<<" ";
    preOrder(root->left);
    preOrder(root->right);
}

void postOrder(node * root){
    if(root==NULL){
        return;
    }
    postOrder(root->left);
    postOrder(root->right);
    cout<<root->data<<" ";
}

void inOrder(node * root){
    if(root==NULL){
        return;
    }
    inOrder(root->left);
    cout<<root->data<<" ";
    inOrder(root->right);
}


int main(){

    node * root = new node(5);
    root->left = new node(3);
    root->right = new node(4);
    root->left->left = new node(2);
    root->left->right = new node(6);
    root->right->left = new node(7);
    root->right->right = new node(8);
    preOrder(root);
    cout<<endl;
    postOrder(root);
    cout<<endl;
    inOrder(root);
    return 0;
}