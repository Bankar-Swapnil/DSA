import java.util.*;


public class linkedlist {

    public static class node{
        int data;
        node next;
        public node(int val){
            this.data=val;
            this.next=null;
        }
    }

    public static node head ;
    public static node tail ;

    public void addNodeHead(int val){
        node temp = new node(val);
        if(head==null){
            head = temp;
            return;
        }
        temp.next = head;
        head=temp;
    }

    public void addNodelast(int val){
        node temp = new node(val);
        if(head==null){
            head=temp;
            return;
        }
        node temp2 = head;
        while (temp2.next !=null) {
            temp2=temp2.next;
        }
        temp2.next=temp;

    }

    public void displayLinkedlist(){
        node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.print("null");
    }

    public int removeHeadNode(){
        if(head==null){
            return -1;
        }
        int data = head.data;
        head= head.next;
        return data;
    }

    public int removeLastNode(){
        if(head==null){
            return -1;
        }
        node temp = head;

        while (temp.next.next!=null) {
            temp = temp.next;
        }
        int data = temp.next.data;
        temp.next = null;
        return data;
    }

    public int removeNthIndexNode(int n){
        if (head==null) {
            return -1;
        }
        int i=0,data=-1;
        if(n==0){
            data = head.data;
            head=head.next;
            return data;
        }
        node temp = head;
        while (temp!=null) {
            if(i==n-1){
                data = temp.next.data;
                temp.next = temp.next.next;
            }
            temp = temp.next;
            i++;
        }
        return data;
    }

    public static boolean searchInLinkedlist(int val){
        if(head==null){
            return false;
        }

        node temp = head;
        while ( temp!=null) {
            if(temp.data==val){
                return true;
            }
            temp =temp.next;
        }
        return false;
    }

    public void reversLinkedList(){
        if(head==null){
            return;
        }
        node prev = null;
        node curr = head;
        node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev =curr;
            curr =next;
        }
         
        head = prev;
    }

    public int linkedlistSize(){
        int i =0;
        node temp =head;
        while (temp!=null) {
            i++;
            temp=temp.next;
        }
        return i;
    }

    public int RemoveNthNodeFromEnd(int n){

        if(head==null){
            return -1;
        }
        int i=1,data =-1;
        node temp = head;
        int size = linkedlistSize();
        
        int f = size-n+1;

        while (temp!=null) {
            if(i==f-1){
                data = temp.next.data;
                temp.next = temp.next.next;
            }
            temp=temp.next;
            i++;
        }
        return data;
    }


    public node midNode(){
        node slow = head;
        node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public boolean isPalan(){
        if(head==null){
            return true;
        }
         node mid = midNode();
         node prev = null;
         node curr = mid;
         node next;

         while (curr!=null) {
            next=curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
         }

         node right = prev;
         node left = head;

         while (right!=null) {
            if(right.data!=left.data){
                return false;
            }
            right = right.next;
            left = left.next;
         }

         return true;
    }

    public static void main(String[] args) {
        
        linkedlist ll = new linkedlist();

        ll.addNodeHead(5);
        ll.addNodeHead(6);
        ll.addNodeHead(7);
        ll.addNodeHead(8);
        ll.addNodelast(4);
        ll.addNodelast(3);
        ll.addNodelast(2);
        ll.addNodelast(1);
        
        ll.displayLinkedlist();


        // ll.removeHeadNode();
        // ll.removeHeadNode();
        // System.out.println();
        // ll.displayLinkedlist();

        // ll.removeLastNode();
        // ll.removeLastNode();
        // System.out.println();
        // ll.displayLinkedlist();

        // System.out.println();

        // System.out.println(ll.removeNthIndexNode(0));

        // ll.displayLinkedlist();
        // System.out.println();

        // System.out.println(ll.removeNthIndexNode(3));

        // ll.displayLinkedlist();

        // System.out.println();
        // System.out.println(ll.searchInLinkedlist(4));

        // System.out.println( );
        // ll.reversLinkedList();
        // ll.displayLinkedlist();

        // System.out.println();

        // System.out.println(ll.RemoveNthNodeFromEnd(3));

        // System.out.println();

        // System.out.println(ll.isPalan());

        


    }
    
}
