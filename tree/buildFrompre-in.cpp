//build tree from preorder and inorder

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

int search(int inOrder[],int start,int end,int curr){
    for (int i = start; i <=end; i++)
    {
        if(inOrder[i]==curr){
            return i;
        }
    }
    return -1;
}

node* buildTree(int preOrder[],int inOrder[],int start,int end){
    static int idx =0;
    if (start>end)
    {
        return NULL;
    }

    int curr = preOrder[idx];
    idx++;
    node * Node = new node(curr);
    if(start == end){
        return Node;
    }

    int pos = search(inOrder,start,end,curr);
    Node->left = buildTree(preOrder,inOrder,start,pos-1);
    Node->right = buildTree(preOrder,inOrder,pos+1,end);

     return Node;
}

void inOrderPrint(node * root){
    if(root==NULL){
        return;
    }
    inOrderPrint(root->left);
    cout<<root->data<<" ";
    inOrderPrint(root->right);
}

int main(){

    int preOrder[]={1,2,4,3,5};
    int inOrder[]={4,2,1,5,3};

    node* root= buildTree(preOrder,inOrder,0,4);
    inOrderPrint(root);

    return 0;
}