#include<iostream>
#include<queue>
#include<algorithm>
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

void inOrder(node * root){
    if(root==NULL){
        return;
    }
    preOrder(root->left);
    cout<<root->data<<" ";
    preOrder(root->right);
}

void postOrder(node * root){
    if(root==NULL){
        return;
    }
    preOrder(root->left);
    preOrder(root->right);
    cout<<root->data<<" ";
}



void levelOrder(node * root){

    if(root==NULL){
        return;
    }

    queue<node*> q;
    q.push(root);
    q.push(NULL);

    while(!q.empty()){
        node* n = q.front();
        q.pop();
        if(n!=NULL){
            cout<<n->data<<" ";
            if(n->left){
                q.push(n->left);
            }
            if(n->right){
                q.push(n->right);
            }
        }
        else if(!q.empty()){
                q.push(NULL);
        }
    }

}

int sumAtK(node * root,int k){
    if(root == NULL){
        return -1;
    }

    queue<node*>q;
    q.push(root);
    q.push(NULL);
    int level =0;
    int sum =0;

    while (!q.empty())
    {
        node * n = q.front();
        q.pop();
        
        if(n!=NULL){
            if(level ==k){
                sum+=n->data;
            }
            if(n->left){
                q.push(n->left);
            }
            if(n->right){
                q.push(n->right);
            }
        }
        else if(!q.empty()){
                q.push(NULL);
                level++;
        }
    }
    return sum;
}


int countNode(node * root){
    if(root==NULL){
        return 0;
    }

    return countNode(root->left)+countNode(root->right)+1;
}

int sumAllNodes(node * root){
    if(root== NULL){
        return 0;
    }
    
    return sumAllNodes(root->left)+sumAllNodes(root->right)+root->data;
}

int heightOfTree(node * root){

    if(root== NULL){
        return 0;
    }

    int lHeight = heightOfTree(root->left);
    int rHeight = heightOfTree(root->right);
    return max(lHeight,rHeight)+1;
}


int calcuDiameter(node * root){

    //time complexcity = O(n^2)
    if(root==NULL){
        return 0;
    }

    int lHeight = heightOfTree(root->left);
    int rHeight = heightOfTree(root->right);
    int currDiameter = lHeight+rHeight+1;

    int lDiameter = calcuDiameter(root->left);
    int rDiameter = calcuDiameter(root->right);

    return max(currDiameter,max(lDiameter,rDiameter));

}

int calcuDiameter2(node * root,int * height){

    //time complexcity = O(n)
    if(root==NULL){
        *height = 0;
        return 0;
    }
    int  lh=0; int rh=0;

    int lDiameter = calcuDiameter2(root->left, &lh);
    int rDiameter = calcuDiameter2(root->right, &rh);

    int currDiameter = lh+rh+1;
    *height = max(lh,rh)+1;

    return max(currDiameter,max(lDiameter,rDiameter));

}



void sumReplace(node * root){
    if(root ==NULL){
        return;
    }
    
    sumReplace(root->left);
    sumReplace(root->right);

    if(root->left != NULL){
        root->data += root->left->data;
    }
    if(root->right != NULL){
        root->data += root->right->data;
    }
}


bool isBalanced(node * root){
    //time complexcity = O(n^2)
    if (root==NULL)
    {
        return true;
    }
    if(isBalanced(root->left)== false){
        return false;
    }
    if(isBalanced(root->right)== false){
        return false;
    }

    int lHeight = heightOfTree(root->left);
    int rHeight = heightOfTree(root->right);

    if(abs(lHeight-rHeight)<=1){
        return true;
    }else{
        return false; 
    }

}


bool isBalanced2(node * root,int * height){
    //time complexcity = O(n^2)
    int lh=0,rh =0;
    if (root==NULL)
    {
        return true;
    }
    if(isBalanced2(root->left,&lh)== false){
        return false;
    }
    if(isBalanced2(root->right,&rh)== false){
        return false;
    }

    *height = max(lh,rh)+1;
    
    if(abs(lh-rh)<=1){
        return true;
    }else{
        return false; 
    }

}


void reightView(node * root){
    if(root==NULL){
        return;
    }

    queue<node*>q;
    q.push(root);

    while (!q.empty())
    {
        int n = q.size();

        for(int i =0;i<n;i++){
            node * curr = q.front();
            q.pop();

            if(i==n-1){
                cout<<curr->data<<" ";
            }
            if(curr->left){
                q.push(curr->left);
            }
            if(curr->right){
                q.push(curr->right);
            }
        }
    }
    
}

void leftView(node * root){
    if(root==NULL){
        return;
    }

    queue<node*>q;
    q.push(root);

    while (!q.empty())
    {
        int n = q.size();

        for(int i =0;i<n;i++){
            node * curr = q.front();
            q.pop();

            if(i==0){
                cout<<curr->data<<" ";
            }
            if(curr->left){
                q.push(curr->left);
            }
            if(curr->right){
                q.push(curr->right);
            }
        }
    }
    
}


node * lca(node* root ,int n1, int n2){
    //lowest common ancestor

    if(root == NULL){
        return NULL;
    }
    if(root->data == n1 || root -> data == n2){
        return root;
    }

    node * left = lca(root->left,n1,n2);
    node * right = lca(root->right,n1,n2);

    if( left != NULL && right != NULL){
        return root;
    }
    if(left == NULL && right == NULL){
        return NULL;
    }
    if(left != NULL){
        return lca(root->left,n1,n2);
    }
    return lca(root->right,n1,n2);
}

int findDis(node * root ,int k,int dist){
    if(root==NULL){
        return -1;
    }
    if(root->data == k){
        return dist;
    }
    int left = findDis(root->left,k,dist+1);

    if(left != -1){
        return left;
    }

    return findDis(root->right,k,dist+1);
}


int distBtwnNode(node * root,int n1,int n2){

    node * LCA= lca(root,n1,n2);
    int d1 = findDis(LCA,n1,0);
    int d2 = findDis(LCA,n2,0);

    return d1+d2;
}



int main(){

    node* root = new node(1);

    root->left = new node(5);
    root->right = new node(3);

    root->left->left = new node(6);
    root->right->left = new node(2);

    root->left->right = new node(7);
    root->right->right = new node(4);

    preOrder(root);
    cout<<endl;

    inOrder(root);
    cout<<endl;
    postOrder(root);
    cout<<endl<<endl;
    levelOrder(root);
    cout<<endl<<endl;
    cout<<sumAtK(root,2)<<endl;
    cout<<countNode(root)<<endl;
    cout<<sumAllNodes(root)<<endl;
    cout<<heightOfTree(root)<<endl;
    cout<<calcuDiameter(root)<<endl;

    int height =0;
    cout<<calcuDiameter2(root, &height)<<endl;

    preOrder(root);
    cout<<endl;
    sumReplace(root);
    cout<<endl;
    preOrder(root);
    cout<<endl;

    if(isBalanced(root)){
        cout<<"tree is balanced "<<endl;
    }else{
        cout<<"tree is not balanced "<<endl;
    }

    int height2 =0;
    if(isBalanced2(root,&height2)){
        cout<<"tree is balanced "<<endl;
    }else{
        cout<<"tree is not balanced "<<endl;
    }
    cout<<endl;
    reightView(root);
    cout<<endl;
    leftView(root);
    cout<<endl;
    cout<<distBtwnNode(root,18,2)<<endl;

    return 0;
}