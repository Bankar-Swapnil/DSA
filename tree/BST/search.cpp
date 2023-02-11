#include<iostream>
using namespace std;


struct node{
    int data;
    node * left,*right;

    node(int val){
        data = val;
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


node * searchInBST(node * root,int key){
    if(root==NULL){
        return NULL;
    }
    if(root->data == key){
        return root;
    }
    if(key > root->data){
        return searchInBST(root->right,key);
    }

    return searchInBST(root->left,key);
}

void inorder(node * root){
    if(root == NULL){
        return ;
    }
    inorder(root->left);
    cout<<root->data<<" ";
    inorder(root->right);
}

node * inorderSucc(node * root){
    node * curr = root;
    while(curr && curr->left != NULL){
        curr = curr->left;
    }
    return curr;

}

node * deleteInBst(node * root,int key){
    if(root== NULL){
        return NULL;
    }

    if(key<root->data){
        root->left =deleteInBst(root->left,key);
    }else if(key>root->data ){
        root->right = deleteInBst(root->right,key);
        
    }else{
        if(root->left ==NULL){
            node * temp = root->right;
            free(root);
            return temp;
        }
        else if(root->right ==NULL){
            node * temp = root->left;
            free(root);
            return temp;
        }
        else{
            node * temp = inorderSucc(root->right);
            root->data = temp ->data;
            root->right = deleteInBst(root->right,temp->data);
        }
    }
    return root;
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

    if (searchInBST(root,6)==NULL)
    {
        cout<<"Key does not exist"<<endl;
    }else{
        cout<<"key exist"<<endl;
    }
    
    inorder(root);
    cout<<endl;
    deleteInBst(root,6);
    inorder(root);

    return 0;
}