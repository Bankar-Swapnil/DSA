import java.util.*;

// import BST.node;

public class linklist {

    public static class Node{
        int data;
        Node next;

        public Node(int val){
            this.data=val;
            this.next=null;
        }

    }

    public static Node head ;
    public static Node tail;
    public static int size;

    public void insertAtHead(int val){
        Node temp = new Node(val);
        size+=1;
        if(head==null ){
            head=tail=temp;
            return;
        }
        temp.next=head;
        head=temp;
    }

    public void insertAtEnd(int val){
        Node temp = new Node(val);
        size+=1;
        if(head==null){
            head=tail=temp;
            return;
        }

        tail.next = temp;
        tail=temp;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public void removeHead(){
        if(head==null){
            System.out.println("Linklist is empty");
            return;
        }
        size-=1;

        head = head.next;

    }

    public void removeTail(){
        if(head==null){
            System.out.println("Linklist is empty");
            return;
        }
        Node temp = head;
        size-=1;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp.next;

    }

    public Boolean searchNode(int key){
        if(head==null){
            System.out.println("Linklist is empty");
            return false;
        }

        Node temp = head;
        while(temp!=null){
            if(temp.data==key){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    public void removeNthNode(int index){
        Node temp = head;
        if(head==null){
            System.out.println("Linklist is empty");
            return ;
        }
        size-=1;
        if(index==0){
            removeHead();
        }
        int i=1;

        while(i<index){
            temp=temp.next;
            i++;
        }

        temp.next=temp.next.next;
    }


    public void reversLinklist(){

        Node next;
        Node curr=tail=head;
        Node prev=null;

        while(curr!=null){

            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;     
        }
        head =prev;
    }

    // public Node reverseRecursive (Node head) {
    //     if (head == null || head.next == null) {
    //     return head;
    //     }
    //     Node newHead = reverseRecursive (head.next);
    //     head.next.next = head;
    //     head.next = null;
    //     return newHead;
    // }


    public Node findMideNode(){
        Node slow =head;
        Node fast = head;
        while(fast!=null && fast.next != null){
            slow=slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
        return slow;
    }

    public Node findMide(Node head){
        Node slow =head;
        Node fast = head;
        while(fast!=null && fast.next != null){
            slow=slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean CheckPalindrom(){
        if(head==null || head.next == null){
            return true;
        }
        //step1 = find mid

        Node midNode= findMide(head);


        //step2 = reverse second half

        Node prev =null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right = prev;
        Node left = head;

        //step3 = compair left and right half

        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    public static void  main(String args[]) {
        linklist ll = new linklist();
        
        ll.insertAtEnd(3);
        ll.insertAtEnd(2);
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(1);
        // ll.insertAtEnd(7);

        // ll.display();
        // ll.removeHead();
        // ll.removeTail();
        // ll.display();
        // ll.removeHead();
        // ll.removeTail();
        ll.display();
        // System.out.println(ll.searchNode(5));
        // System.out.println(ll.searchNode(11));
        // System.out.println(size);

        // ll.removeNthNode(2);
        // ll.reversLinklist();
        // ll.findMideNode();
        // ll.display();
        System.out.println(ll.CheckPalindrom());
        
    }
    
};
