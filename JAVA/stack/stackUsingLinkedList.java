public class stackUsingLinkedList {
    static class node{
        int data;
        node next;
        node(int val){
            this.data=val;
            this.next=null;
        }
    }

    static class stack{
        static node head = null;

        public void push(int val){
            if(head==null){
                head=new node(val);
                return;
            }
            node temp = new node(val);
            temp .next = head;
            head = temp;
        }

        public int pop(){
            if(head==null){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public boolean isEmpty(){
            if(head==null){
                return true;
            }
            return false;
        }

        public int peak(){
            if(head==null){
                return -1;
            }
            int top = head.data;
            return top;
        }
    }

    public static void main(String[] args) {
        stack a = new stack();
        a.push(0);
        a.push(1);
        a.push(2);
        a.push(3);

        while (!a.isEmpty()) {
            System.out.println(a.peak());
            a.pop();
        }

    }
}
