import java.util.*;
public class stacks {
    static class aa{

       static ArrayList<Integer> list = new ArrayList<>();
        
        public boolean isEmpty(){
            return list.size()==0;
        }

        public void push(int data){
            list.add(data);
        }

        public int pop(){
            if(list.size()==0){
                return -1;
            }
            int data = list.get(list.size()-1);
            list.remove(list.size()-1);
            return data;
        }

        public int peak(){
            if(list.size()==0){
                return -1;
            }
            int data = list.get(list.size()-1);
            return data;
        }


    }


    static class node{
        int data;
        node next;
        node(int val){
            this.data=val;
            this.next = null;
        }
    }

    static class bb{
        static node head;

        public boolean isEmpty(){
            return head==null;
        }

        public void push(int data){
            node temp = new node(data);
            if(head==null){
                head=temp;
                return;
            }
            temp.next = head;
            head=temp;
        }

        public int pop(){
            if(head==null){
                return -1;
            }
            int data = head.data;
            head=head.next;
            return data;
        }

        public int peak(){
            if(head==null){
                return -1;
            }
            int data = head.data;
            return data;
        }
    }


    public static void main(String[] args) {
        // aa s = new aa();

        // s.push(1);
        // s.push(2);
        // s.push(3);

        // while (!s.isEmpty()) {
        //     System.out.println(s.peak());
        //     s.pop();
        // }

        // bb e = new bb();

        // e.push(1);
        // e.push(2);
        // e.push(3);

        // while (!e.isEmpty()) {
        //     System.out.println(e.peak());
        //     e.pop();
        // }


    }
}
