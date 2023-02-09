#include<iostream>
using namespace std;


class node{
    public:
    node* next;
    node * prev;
    int data;
    node(int val){
        data = val;
        next = NULL;
        prev =NULL;
    }
};

void insetAtHead(node * &head,int val){
    node * temp = new node(val);
    temp->next = head;
    if(head!=NULL){
        head->prev = temp;
    }
    head = temp;
}

void insertAtTail(node * &head,int val){

    if(head == NULL){
        insetAtHead(head,val);
        return;
    }

    node * ptr = new node(val);
    node *temp = head;

    while (temp->next != NULL)
    {
        temp = temp->next;
    }

    temp->next = ptr;
    ptr->prev = temp;
    
}


void deleteAtHead(node * &head){
    node * toDelete=head;
    head = head->next;
    head->prev =NULL;
    delete toDelete;
}

void deleteNode(node * &head,int pos){

    if(pos == 1){
        deleteAtHead(head);
        return;
    }

    node * temp = head;
    int count =1;

    while (temp!=NULL && count!=pos)
    {
        temp=temp->next;
        count++;
    }

    temp->prev->next=temp->next;
    if(temp->next != NULL){
        temp->next->prev= temp->prev;
    }

    
}

void display(node * head){
    node * temp = head;

    while(temp != NULL){
        cout<<temp->data<<" ";
        temp = temp->next;
    }
    cout<<endl;
}

int main(){


    node * head= NULL;

    insertAtTail(head,1);
    insertAtTail(head,2);
    insertAtTail(head,3);
    insertAtTail(head,4);
    insertAtTail(head,5);

    display(head);

    deleteNode(head,3);
    display(head);

}