import java.util.*;

public class cycleLink{
    public static class node{
        int data;
        node next;
        public node(int val){
            this.data=val;
            this.next=null;
        }
    }

    public static node head;
    public static node tail;
    public static int size;

    public void insertAtHead(int val){
        node temp = new node(val);
        if(head==null){
            head=tail=temp;
            return;
        }
        temp.next=head;
        head=temp;
    }

    public void insertAtEnd(int val){
        node temp = new node(val);
        if(head==null){
            head=tail=temp;
            return;
        }
        tail.next= temp;
        tail =temp;
    }

    public void removeHead(){
        if(head==null){
            return;
        }
        head=head.next;
    }

    public void removeTail(){
        if(head==null){
            return ;
        }
        node temp = head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp.next;
    }

    public void display(){
        if(head==null){
            return ;
        }
        node temp = head;
        while(temp!=null){
            System.out.println(temp.data +" ");
            temp = temp.next;
        }
    }

    public void removeNthNode(int idx){
        node temp = head;
        if(head==null){
            return ;
        }
        if(idx==0){
            removeHead();
        }
        int i=1;
        while(i<idx){
            temp=temp.next;
            i++;
        }
        temp.next = temp.next.next;

    }

    public Boolean searchNode(int val){
        if(head==null){
            return false;
        }
        node temp = head;
        while(temp!=null){
            if(temp.data==val){
                return true;
            }
            temp =temp.next;
        }
        return false;
    }

    public void reversLinklist(){
        node prev=null;
        node curr=tail=head;
        node next;
        while(curr!=null){
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public node findMid(node haed){
        node fast =haed;
        node slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    public boolean CheckPalindrom(){
        if(head==null || head.next==null){
            return true;
        }

        node mid = findMid(head);

        node prev=null;
        node curr=mid;
        node next;

        while(curr!=null){
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        node left = head;
        node right = prev;

        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }

        return true;
    }

    public boolean checkCycle(){
        if(head==null || head.next == null){
            return false;
        }
        node fast=head;
        node slow=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false; 
    }

    public void removeCycle(){
        if(head==null || head.next == null){
            return;
        }
        node fast=head;
        node slow=head;

        do{
            slow=slow.next;
            fast=fast.next.next;
        }while(slow!=fast);
        fast=head;

        while(slow.next!=fast.next){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=null;
    }

    public void makeCycle(int pos){
        if(head==null || head.next==null){
            return;
        }
        int count=1;
        node temp =head;
        node startNode=null;
        while(temp.next!=null){
            if(count==pos){
                startNode=temp;
            }
            temp=temp.next;
            count++;
        }
        temp.next=startNode;
    }

        public static void  main(String args[]) {
        cycleLink ll = new cycleLink();
        
        ll.insertAtEnd(3);
        ll.insertAtEnd(2);
        ll.insertAtEnd(1);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);

        // ll.makeCycle(3);
        // System.out.println(ll.checkCycle());
        // ll.removeCycle();
        // System.out.println(ll.checkCycle());
        // ll.display();
        // System.out.println(ll.CheckPalindrom());
        
    }


}