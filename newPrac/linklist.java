// import java.util.*;

public class linklist {
    public static class node{
        int data;
        node next;
        public node(int val){
            this.data=val;
            this.next = null;
        }
    }

    public static node head ;
    public static node tail;
    public static int size;


    public void insertAtHead(int val){
        node temp = new node(val);
        size+=1;
        if(head==null){
            head = tail=temp;
            return;
        }
        temp.next = head;
        head = temp;
    }

    public void insertAtEnd(int val){
        node temp = new node(val);
        size+=1;
        if(head==null){
            head=tail=temp;
            return;

        }
        tail.next=temp;
        tail = temp;
    }

    public void insertAtIndex(int val,int index){
        size+=1;
        if(index==0){
            
            insertAtHead(val);
            return;
        }
        int i=0;
        node temp = head;
        while(i<index-1){
            temp = temp.next;
            i++;
        }
        node temp2=temp.next;
        temp.next = new node(val);
        temp.next.next=temp2;

    }

    public void display(){
        node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void removeHead(){
        if(head==null){
            return;
        }
        head=head.next;
        size-=1;;
    }

    public void removeTail(){
        if(head==null){
            return;
        }
        node temp = head;
        size-=1;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next=null;
        tail = temp;

    }

    public boolean searchnode(int val){
        if(head==null){
            return false;
        }
        node temp = head;
        while(temp!=null){
            if(temp.data==val){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    public void removeNthnode(int idx){
        if(head==null){
            return;
        }
        node temp = head;
        size-=1;
        int i=1;

        if(idx==0){
            removeHead();
            return;
        }

        while(i<idx ){
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
    }


    public void reversLinklist(){
        node prev = null;
        node curr = head;
        node next;
        while(curr!=null){
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    } 

    public node midnode(){
        node slow = head;
        node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean CheckPalindrom(){
        if(head==null || head.next==null){
            return true;
        }

        // find mid
        node mid = midnode();
        // reverse mid link
        node prev=null;
        node curr = mid;
        node next;
        while(curr!=null){
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        node rh=prev;
        node lh = head;
        // check conditions
        while(rh!=null){
            if(rh.data!=lh.data){
                return false;
            }
            rh=rh.next;
            lh=lh.next;
        }

        return true;
    }


    public boolean isCyclePresent(){
        if(head==null|| head.next==null){
            return false;
        }
        node slow=head;
        node fast= head;
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
        if(head==null|| head.next==null){
            return;
        }
        node slow=head;
        node fast= head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        fast = head;

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
        node startnode=null;
        while(temp.next!=null){
            if(count==pos){
                startnode=temp;
            }
            temp=temp.next;
            count++;
        }
        temp.next=startnode;
    }




    public static node FindIntersection(node ahead, node bhead) {
        int ac = 0;
        int bc = 0;
        node a = ahead;
        node b = bhead;
    
        // Calculate the lengths of both linked lists
        while (a != null) {
            ac++;
            a = a.next;
        }
    
        while (b != null) {
            bc++;
            b = b.next;
        }
    
        // Reset pointers to the beginning
        a = ahead;
        b = bhead;
    
        // Adjust starting points if necessary
        while (ac > bc) {
            a = a.next;
            ac--;
        }
    
        while (bc > ac) {
            b = b.next;
            bc--;
        }
    
        // Traverse both lists simultaneously until intersection point is found
        while (a != null && b != null) {
            if (a.data == b.data) {
                return a; // Intersection found
            }
            a = a.next;
            b = b.next;
        }
    
        return null; // No intersection found
    }


    public node thirdLargestElement(){

        if(head==null||head.next==null||head.next.next==null){
            return null;
        }
        node firstLargest=null;
        node secondLargest=null;
        node thirdLargest=null;

        node curr = head;
        

        while(curr!=null){
            if(firstLargest==null || firstLargest.data<curr.data){
                thirdLargest=secondLargest;
                secondLargest=firstLargest;
                firstLargest=curr;
            }
            else if(secondLargest==null || secondLargest.data<curr.data){
                thirdLargest=secondLargest;
                secondLargest=curr;
            }
            else if(thirdLargest==null || thirdLargest.data<curr.data){
                thirdLargest=curr;
            }
            curr=curr.next;
        }
        return thirdLargest;
    }
    



    public static void main(String[] args) {
        linklist ll = new linklist();
        ll.insertAtHead(1);
        ll.insertAtHead(2);
        ll.insertAtHead(3);
        ll.insertAtHead(6);
        ll.insertAtHead(5);
        // ll.insertAtIndex(6,2);
        // ll.removeTail();
        // ll.display();
        // ll.removeNthnode(3);
        // ll.reversLinklist();
        // ll.display();
        // System.out.println(ll.isCyclePresent());
        // ll.makeCycle(3);
        // System.out.println(ll.isCyclePresent());
        // ll.removeCycle();
        
        // System.out.println(ll.isCyclePresent());
        // ll.display();
        // ll.display();
        // System.out.println(ll.searchnode(5));
        // System.out.println(ll.midnode().data);
        // System.out.println(ll.CheckPalindrom());

        // node head1 = new node(5);
        // head1.next = new node (2);
        // head1.next.next = new node(3);
        // head1.next.next.next = new node(1);
        // head1.next.next.next.next = new node(7);
        // head1.next.next.next.next.next = new node(6);
        // head1.next.next.next.next.next.next = new node(9);

        // node head2 = new node(4);
        // head2.next = new node (3);
        // head2.next.next = new node(7);
        // head2.next.next.next = new node(6);
        // head2.next.next.next.next = new node(9);

        // System.out.println(FindIntersection(head1,head2).data);

        System.out.println(ll.thirdLargestElement().data);

        

    }
}
