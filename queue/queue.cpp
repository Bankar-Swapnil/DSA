#include<iostream>
using namespace std;


#define n 20

// class queue{
//     int * arr;
//     int front;
//     int back;

//     public:

//     queue(){
//         arr = new int[n];
//         front =-1;
//         back =-1;
//     }

//     void enQueue(int val){
//         if(back==n-1){
//             cout<<"queue is full"<<endl;
//             return;
//         }
//         back++;
//         arr[back]=val;

//         if(front==-1){
//            front++;
//         }
//     }

//     void deQueue(){
//         if(front ==-1 || front>back){
//             cout<<"queue is empty"<<endl;
//             return;
//         }
//         front++;
//     }

//     int peak(){
//          if(front ==-1 || front>back){
//             cout<<"queue is empty"<<endl;
//             return -1;
//         }
//         return arr[front];
//     }

//     bool empty(){
//         if(front ==-1 || front>back){
//             return true;
//         }
//         return false;
//     }

// };

// int main(){

//     queue q;
//     q.enQueue(1);
//     q.enQueue(2);
//     q.enQueue(3);
//     q.enQueue(4);

//     cout<<q.peak()<<endl;
//     q.deQueue();
//     cout<<q.peak()<<endl;
//     cout<<q.empty()<<endl;


//     return 0;
// }



struct node{
    public:
    int data;
    node * next;

    node(int val){
        data = val;
        next =NULL;
    }

};

class queue{
    node * front;
    node * back;


    public:
    queue(){
        front=NULL;
        back=NULL;
    }

    void push(int val){
        node * a=new node(val);
        if(front==NULL){
            back=a;
            front=a;
            return;
        }
        back->next=a;
        back=a;
    }

    void pop(){

        if(front==NULL){
            cout<<"queue is empty";
            return;
        }
        node * toDelete=front;
        front=front->next;
        delete toDelete;

    }

    int peak(){

        if(front==NULL){
            return -1;
        }

        return front->data;
    }

    bool isEmpty(){

        if(front==NULL){
            return true;
        }
        return false;
    }
};

int main(){

    queue q;

    q.push(1);
    q.push(3);
    q.push(2);

    cout<<q.peak()<<endl;
    q.pop();
    cout<<q.peak()<<endl;
    q.pop();
    cout<<q.peak()<<endl;q.pop();
    cout<<q.peak()<<endl;



    return 0;
}