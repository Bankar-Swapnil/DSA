import java.util.*;

public class stackUsingArrayList {

    public static class stack{

        static ArrayList<Integer> list = new ArrayList<>();

        public static void push(int val){
            list.add(val);
        }

        public static int pop(){
            int val = list.get(list.size()-1);
            list.remove(list.size()-1);
            return val;
        }

        public static int top(){
            return list.get(list.size()-1);
        }

        public static boolean isEmpty(){
            return list.size()==0;
        }
    }


    public static class node{
        int data;
        node next;
        node(int val){
            this.data=val;
            this.next=null;
        }
    }

    public static class stackLL{
        static node head =null;

        public static void push(int val){
            node temp = new node(val);
            if(head==null){
                head=temp;
            }
            temp.next=head;
            head=temp;
        }

        public static int pop(){
            if(head==null){
                return -1;
            }
            int val = head.data;
            head=head.next;
            return val;
        }

        public static int top(){
            if(head==null){
                return -1;
            }
            return head.data;
        }

        public static boolean isEmpty(){
            return head==null;
        }
    }
    
    public static void main(String[] args) {
        // stackLL a = new stackLL();
        // a.push(1);
        // a.push(2);
        // a.push(3);
        // a.push(4);
        // a.push(5);
        // a.push(6);

        // a.pop();

        // System.out.println(a.top());
        //         System.out.println(a.pop());
        // System.out.println(a.pop());
        // // System.out.println(a.pop());
        // System.out.println(a.pop());
        // System.out.println(a.pop());


        // stack s = new stack();

        // s.push(1);
        //         s.push(2);
        // s.push(3);
        // s.push(4);
        // s.push(5);
        // s.push(6);
        

        // s.pop();

        // System.out.println(s.top());
        //         System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.pop());



    }
}
