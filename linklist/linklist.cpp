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

void insertAtHead(node * &head,int val){
    node * ptr = new node(val);
    ptr->next=head;
    head = ptr;
}

void searchAtLinklist(node * head,int key){
    node * temp = head;
    int flag=0;
    while (temp!=NULL)
    {
        if(temp->data==key){
            cout<<"key found"<<endl;
            flag=1;
            return;
        }
        else{
        temp = temp->next;
        }
    }
    if(flag==0){
        cout<<"key not found"<<endl;
    }
}

void deleteAtHead(node * &head){
    node * temp = head;
    head=head->next;
    delete temp;
}
void DeletInLinkList(node * &head,int key){
    node * temp =head;
    if (head==NULL)
    {
        cout<<"linklist is null"<<endl;
        return;
    }
    
    if(head->next == NULL){
        deleteAtHead(temp);
        return;
    }
    if(head->data==key){
        cout<<"success"<<endl;
        deleteAtHead(temp);
        return;
    }
    while (temp->next->data!=key)
    {
        temp=temp->next;
    }
    node * toDelete = temp->next;
    temp->next = temp->next->next;
    delete toDelete;
}

int main(){

    node* head = NULL;
    insertAtTail(head,1);
    insertAtTail(head,2);
    insertAtTail(head,4);
    insertAtTail(head,3);
    display(head);
    insertAtHead(head,5);
    insertAtHead(head,6);
    display(head);
    searchAtLinklist(head,0);
    DeletInLinkList(head,6);
    display(head);
    return 0;
}