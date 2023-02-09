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

void makeCycle(node * &head,int pos){
    node * temp = head;
    node * startNode;

    int count =1;
    while (temp->next != NULL)
    {
        if(count==pos){
            startNode=temp;
        }
        temp=temp->next;
        count++;
    }
    temp->next=startNode;
}

bool detectcycle(node * &head){
    node * slow = head;
    node * fast = head;

    while (fast!=NULL && fast->next!= NULL)
    {
        slow = slow->next;
        fast = fast->next->next;
        if(slow==fast){
            cout<<"cycle is present ";
            return true;
        }
    }
    cout<<"cycle is not present ";
    return false;
    
}

void removCycle(node * &head){
    node * slow = head ;
    node * fast = head;
    do
    {
        slow = slow-> next ;
        fast = fast->next->next;
    } while (slow!=fast);
    
    fast = head;
    while (slow->next != fast->next)
    {
        slow = slow->next;
        fast = fast->next;

    }
    
    slow->next = NULL;
}

int main(){
    node * head =NULL;
    insertAtTail(head,1);
    insertAtTail(head,2);
    insertAtTail(head,3);
    insertAtTail(head,4);
    display(head);
    makeCycle(head,3);
    cout<<detectcycle(head)<<endl;
    removCycle(head);
    cout<<detectcycle(head)<<endl;
    display(head);
    return 0;
} 