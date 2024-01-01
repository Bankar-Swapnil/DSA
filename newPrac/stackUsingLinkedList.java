import java.util.*;

public class stackUsingLinkedList {
    static class node{
        int data;
        node next;
        node(int val){
            this.data=val;
            this.next = null;
        }
    }

    static class st{
        static node head=null;

        public static void push(int val){
            node newNode=new node(val);
            if(head==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

        public static int pop(){
            if(head==null){
                return -1;
            }
            int val = head.data;
            head=head.next;
            return val;
        }

        public static int peek(){
            if(head==null){
                return -1;
            }
            int val = head.data;
            return val;
        }

        public static boolean isEmpty(){
            return head==null;
        }

    }

    public static void main(String args[]){
        st a = new st();
        a.push(4);
        a.push(5);
        a.push(7);
        a.push(9);

        while(!a.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }

}
