import java.util.*;
public class Stack {
    
    static class node{
        int data;
        node next;
        node(int d){
            data =d;
            next= null;
        }
    }

    static class st{

        static node head =null;

        public static Boolean isEmpty(){

            return head==null;
        }

        public static void push(int data){

            node newNode = new node(data);

            if(head==null){
                head=newNode;
                return;
            }

            newNode.next = head;
            head=newNode;
        }

        public static int pop(){
            if(head==null){
                return -1;
            }
            int x = head.data;
            head = head.next;
            return x;
        }

        public static int peak(){
            if(head==null){
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String args[]){
        st at = new st();
        at.push(3);
        at.push(2);
        at.push(1);

        System.out.println(at.peak());
        at.pop();

        System.out.println(at.peak());

    }
}
