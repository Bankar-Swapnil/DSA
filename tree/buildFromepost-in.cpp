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

node* buildTree(int postOrder[],int inOrder[],int start,int end){
    static int idx =4;
    if (start>end)
    {
        return NULL;
    }

    int curr = postOrder[idx];
    idx--;
    node * Node = new node(curr);
    if(start == end){
        return Node;
    }

    int pos = search(inOrder,start,end,curr);
    Node->right = buildTree(postOrder,inOrder,pos+1,end );
    Node->left = buildTree(postOrder,inOrder,start,pos-1);

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

    int postOrder[]={4,2,5,3,1};
    int inOrder[]={4,2,1,5,3};

    node* root= buildTree(postOrder,inOrder,0,4);
    inOrderPrint(root);

    return 0;
}