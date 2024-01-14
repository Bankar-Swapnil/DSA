#include<iostream>
using namespace std;


class node{
    public:
        int data;
        node * next;
        node(int val){
            data=val;
            next=NULL;
        }
};

void insertAtHead(node * &head,int val){
    node * temp = new node(val);
    if (head==NULL)
    {
        temp->next=temp;
        head=temp;
        return;
    }
    
    node * ptr = head;
    while (ptr->next != NULL)
    {
        ptr=ptr->next;
    }

    ptr->next=temp;
    temp->next=head;
    head=temp;
    
}

void insetrAtTail(node * &head,int val){

    if(head==NULL){
        insertAtHead(head,val);
        return;
    }

    node * temp = new node(val);
    node * ptr = head;

    while (ptr->next != NULL)
    {
        ptr=ptr->next;
    }

    ptr->next=temp;
    temp->next = head;
}

void display(node * head){
    node * temp = head;
    do{
        cout<<temp->data<<" ";
        temp=temp->next;
    }while(temp!=head);

    cout<<endl;
    
}



int main(){

    node * head=NULL;

    insetrAtTail(head,1);
    insetrAtTail(head,2);
    insetrAtTail(head,3);
    insetrAtTail(head,4);
    insetrAtTail(head,5);

    display(head);
    
    return 0;
}