public class queueUsingLinkedlist {
    
    static class node {
        int data;
        node next;
        node(int val){
            this.data=val;
            this.next = null;
        }
    }

    static class queue{
        static node head = null;

        public void push (int val){
            if(head==null){
                head = new node(val);
                return;
            }
            node temp = head;
            while (temp.next!=null) {
                temp = temp.next;
            }
            temp.next=new node(val);
        }

        public int pop(){
            if (head==null) {
                return -1;
            }
            int top= head.data;
            head=head.next;
            return top;
        }

        public int peak(){
            if (head==null) {
                return -1;
            }
            int top= head.data;
            return top;
        }

        public boolean isEmpty(){
            if (head==null) {
                return true;
            }
            return false;
        }

    }

    public static void main(String[] args) {
        queue a = new queue();

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
