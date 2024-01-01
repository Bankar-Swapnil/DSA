import java.util.*;

public class linkedlist {
    public static class node{
        public
        int data;
        node next;
        public node(int val){
            this.data=val;
            this.next=null;
        }
    }

    public static node head =null;
    public static node tail = null;
    public static int size =0;

    public void insertAtHead(int val){
        if(head==null){
            head=new node(val);
            return;
        }
        node temp = new node(val);
        temp.next=head;
        head=temp;
    }

    public void insertAttail(int val){
        if(head==null){
            head=tail=new node(val);
        }
        node temp = new node(val);
        tail.next=temp;
        tail=temp;
    }

    public void display(){
        node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public int removeHead(){
        if(head==null){
            return -1;
        }
        node temp = head;
        head=head.next;
        return temp.data;
    }

    public void removeTail(){
        node temp = head;
        while (temp.next.next!=null) {
            temp=temp.next;
        }
        temp.next=null;
        tail =temp;
    }

    public void removeNthNode(int n){
        node temp = head;
        if(n==0){
            removeHead();
            return;
        }
        int i=1;
        while (i<n) {
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
    }

    public boolean searchNode(int val){
        node temp = head;
        while (temp!=null) {
            if(temp.data==val){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }


    public void reverse(){
        node curr=tail=head;
        node next;
        node prev=null;

        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }


    public static void main(String[] args) {
        
    }
}
