#include<iostream>
using namespace std;

class node{
    public:
    int data;
    node* next;
    node(int val){
        data = val;
        next = NULL;
    }
};

void insertAtTail(node* &head, int val){

    node* ptr = new node(val);
    if (head==NULL)
    {
        head=ptr;
        return;
    }
    
    node * temp = head;
    while (temp->next != NULL)
    {
        temp = temp->next;
    }
    temp->next=ptr;
}

void display(node* head){
    node* temp = head;
    while (temp != NULL)
    {
        cout<<temp->data<<" ";
        temp=temp->next;
    }
    cout<<endl;
}

node * reversek(node * &head,int k){
    node * prev=NULL;
    node * next;
    node * curr=head;

    int count =0;
    while (curr!=NULL && count<k)
    {
        next = curr->next;
        curr->next = prev;
        prev = curr;
        curr = next;
        count++;
    }
    if (next!=NULL)
    {
        head->next= reversek(next,k);
    }
       
       return prev;
}

int main(){

    node* head = NULL;
    insertAtTail(head,1);
    insertAtTail(head,2);
    insertAtTail(head,4);
    insertAtTail(head,3);
    insertAtTail(head,5);
    insertAtTail(head,6);
    display(head);

    int k =2;
    node* newHead=reversek(head,k);

    display(newHead);

    return 0;
}