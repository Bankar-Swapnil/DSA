#include<iostream>
using namespace std;

class node{
    public:
    int data;
    node * next;

    node(int val){
         data = val;
        next = NULL;
    }
};

void insertAtHead(node * &head,int val){
    node * n = new node(val);
    n->next=head;
    head =n;
}


void insertAtTail(node* &head,int val){
    node* n = new node(val);
    
    if(head == NULL){
        insertAtHead(head,val);
        return;
    }

    node * temp =head;
    while (temp->next!=NULL)
    {
        temp=temp->next;
    }
    temp->next=n;

}

void display(node * head){
    node * temp = head;
    while (temp!=NULL)
    {
        cout<<temp->data<<" -> ";
        temp=temp->next;
    }
    cout<<"NULL"<<endl;
}

void deleteAtHead(node * &head){
    node * temp =head;
    head = head->next;
    delete temp;
}

void delete1(node * &head,int key){
    node *temp = head;
    if(head==NULL){
        cout<<"linklist is empty"<<endl;
        return;
    }
    if(head->next == NULL){
        deleteAtHead(head);
        return;
    }
    if(head->data == key){
        cout<<"success"<<endl;
        deleteAtHead(head);
        return;
    }

    while (temp->next->data!=key)
    {
        temp=temp->next;
    }
    node * todelete = temp->next;
    temp->next = temp->next->next;
    delete todelete;
    
}

bool search(node * &head,int key){

    if(head==NULL){
        return false;
    }

    node * temp =head;
    while (temp!=NULL)
    {
        if(temp->data==key){
            return true;
        }

        temp=temp->next;
    }

    return false;
    
}


int main(){
    
    node * head = NULL;
    insertAtHead(head,5);
    insertAtTail(head,6);
    insertAtTail(head,4);
    insertAtTail(head,2);
    insertAtTail(head,3);
    insertAtTail(head,1);
    insertAtTail(head,7);
    insertAtHead(head,11);
    // display(head);
    // delete1(head,6);
    // display(head);
    // delete1(head,11);

    display(head);

    if(search(head,31)){
        cout<<"element is present"<<endl;
    }else{
        cout<<"element is not present"<<endl;
    }

    return 0;
}