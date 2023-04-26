#include<iostream>
using namespace std;


#define n 20

class queue{
    int * arr;
    int front;
    int back;

    public:

    queue(){
        arr = new int[n];
        front =-1;
        back =-1;
    }

    void enQueue(int val){
        if(back==n-1){
            cout<<"queue is full"<<endl;
            return;
        }
        back++;
        arr[back]=val;

        if(front==-1){
           front++;
        }
    }

    void deQueue(){
        if(front ==-1 || front>back){
            cout<<"queue is empty"<<endl;
            return;
        }
        front++;
    }

    int peak(){
         if(front ==-1 || front>back){
            cout<<"queue is empty"<<endl;
            return -1;
        }
        return arr[front];
    }

    bool empty(){
        if(front ==-1 || front>back){
            return true;
        }
        return false;
    }

};

int main(){

    queue q;
    q.enQueue(1);
    q.enQueue(2);
    q.enQueue(3);
    q.enQueue(4);

cout<<q.peak()<<endl;
    q.deQueue();
    cout<<q.peak()<<endl;
    cout<<q.empty()<<endl;


    return 0;
}