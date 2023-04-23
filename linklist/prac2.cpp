#include<iostream>
using namespace std;

class node{
    public:

    int data ;
    node * next;
    node * pre;

    node (int val){
        data = val;
        next = NULL;
        pre = NULL;
    }
};



void insertAtHead(node * &head,int val){
    node * n = new node(val);
    n->next = head;
    if(head!=NULL){
        head->pre = n;
    }
    head=n;

}

void insertAtTail(node * &head,int val){

    node * n = new node(val);
    node * temp = head;

    if(head==NULL){
        insertAtHead(head,val);
        return;
    }
    while (temp->next!=NULL)
    {
        temp=temp->next;
    }

    temp->next=n;
    n->pre=temp;
    
}



void display(node * head){
    node * temp = head;

    while(temp != NULL){
        cout<<temp->data<<" -> ";
        temp= temp->next;
    }
    cout<<"NULL"<<endl;
}

void deleteAtHead(node * &head){
    node * todelete = head;
    head = head -> next;
    head->pre=NULL;
    delete todelete;
}


void deleteNode(node* &head,int key){
    node * temp = head;

    if(head==NULL){
        cout<<"linklist is empty"<<endl;
        return;
    }

    if(head->data == key){
        deleteAtHead(head);
        return;
    }
    
    while (temp!=NULL)
    {
        if(temp->data == key){
            node * toDelete = temp;
            temp->pre->next=temp->next;
            temp->next->pre=temp->pre;
            delete temp;
            return;
        }
        temp = temp -> next;
    }

}


int main(){

    node * head = NULL;

    insertAtHead(head,1);
    insertAtTail(head,2);
    insertAtTail(head,7);
    insertAtTail(head,3);
    insertAtTail(head,4);
    insertAtTail(head,5);
    insertAtTail(head,6);

    display(head);

    deleteNode(head,1);
    display(head);

    return 0;
}