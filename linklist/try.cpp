// #include<iostream>
// using namespace std;

// class node{
//     public:
//     int data;
//     node* next;
//     node(int val){
//         data=val;
//         next=NULL;
//     }
// };

// void insertAtTail(node* &head,int val){
//     node * ptr = new node(val);
//     if(head == NULL){
//         head=ptr;
//         return;
//     }

//     node * temp = head;

//     while (temp->next != NULL)
//     {
//         temp= temp->next;
//     }

//     temp->next=ptr;
// }

// void display(node * head){
//     node * temp = head;
//     while (temp != NULL)
//     {
//         cout<<temp->data<<" ";
//         temp=temp->next;
//     }
//     cout<<endl;
// }

// void insertAtHead(node * &head,int val ){
//     node * ptr = new node(val);
//     ptr->next = head;
//     head = ptr;
// }

// void deleteAtHead(node * &head){
//     node * temp = head;
//     head = head->next;
//     delete temp;
// }

// void search(node * head,int val){
//     node * ptr =head;
//     int flag=0;

//     while (ptr!=NULL)
//     {
//         if(ptr->data == val){
//             cout<<"Value is Present"<<endl;
//             flag=0;
//             return;
//         }else{
//             ptr=ptr->next;
//         }
//     }

//     if(flag==0){
//         cout<<"Value not is Present"<<endl;
//     }

// }


// int main(){
//     node * head = NULL;

//     insertAtTail(head,2);
//     insertAtTail(head,1);
//     insertAtTail(head,3);
//     insertAtTail(head,4);
//     deleteAtHead(head);
//     display(head);
//     search(head,2);

//     return 0;
// }




// #include<iostream>
// using namespace std;

// class node{
//     public:
//     node * next;
//     int data;
//     node(int val){
//         data = val;
//         next = NULL;
//     }
// };

// void display(node *head){
//     node * temp = head;
//     while (temp != NULL)
//     {
//         cout<<temp->data <<" ";
//         temp= temp->next;
//     }
//     cout<<endl;
// }


// void insertAtTail(node * &head,int val){
//     node * ptr = new node(val);
//     if (head == NULL)
//     {
//         head= ptr;
//         return;
//     }
//     node * temp = head;
//     while (temp->next !=NULL)
//     {
//         temp=temp->next;
//     }
//     temp->next = ptr;
    
// }


// void makeCycle(node * &head,int key){
//     node * temp = head;
//     node * startNode;

//     int count =1;

//     while (temp->next != NULL)
//     {
//         if(count == key){
//             startNode=temp;
//         }
//         temp=temp->next;
//         count++;
//     }
//      temp->next = startNode;
// }

// bool detectCycle(node * head){
//     node * fast = head;
//     node * slow = head;

//     while (fast!= NULL && fast ->next != NULL)
//     {
//         slow= slow->next;
//         fast = fast->next->next;
//         if (slow == fast)
//         {
//             cout<<"cycle is present "<<endl;;
//             return true;
//         }
        
//     }
//     cout<<"cycle is not present "<<endl;
//     return false;
// }

// void RemoveCycle(node * &head){
//     node * fast = head;
//     node * slow = head;

//     do
//     {
//         slow= slow->next;
//         fast = fast->next->next;
//     }while(slow != fast);

//     fast = head;

//     while (fast->next != slow -> next)
//     {
//         slow= slow->next;
//         fast = fast->next;
//     }

//     slow ->next = NULL;
     
// }

// int main(){

//     node * head = NULL;
//     insertAtTail(head,1);
//     insertAtTail(head,2);
//     insertAtTail(head,3);
//     insertAtTail(head,4);
//     insertAtTail(head,5);
//     insertAtTail(head,6);
//     detectCycle(head);
//     makeCycle(head,3);
//     detectCycle(head);
//     RemoveCycle(head);
//     detectCycle(head);

//     return 0;
// }




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

    node * temp = new node(val);
    node * ptr = head;

    if(head==NULL){
        insertAtHead(head,val);
        return;
    }
    
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