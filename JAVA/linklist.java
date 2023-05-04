import java.util.*;

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

    public static void  main(String args[]) {
        linklist ll = new linklist();
        
        ll.insertAtHead(3);
        ll.insertAtHead(2);
        ll.insertAtHead(1);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.insertAtEnd(7);

        ll.display();
        ll.removeHead();
        ll.removeTail();
        ll.display();
        ll.removeHead();
        ll.removeTail();
        ll.display();
        // System.out.println(ll.searchNode(5));
        // System.out.println(ll.searchNode(11));
        // System.out.println(size);

        // ll.removeNthNode(2);
        ll.reversLinklist();
        ll.display();

        
    }
    
};
