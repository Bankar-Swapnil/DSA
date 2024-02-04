import java.util.*;


public class linklist {
    
    public static class node{
        int data;
        node next;

        public node(int val){
            this.data=val;
            this.next = null;
        }
    }

    public static node head;
    public static node tail;
    public static int size;

    public void insertAtHead(int val){
        node temp =new node(val);
        size++;
        if(head==null){
            head=temp;
            return ;
        }
        temp.next=head;
        head=temp;
    }

    public void insertAtTail(int val){
        node temp = new node(val);
        size++;
        if(head==null){
            head=temp;
            return;
        }
        node temp2 = head;
        while(temp2.next!=null){
            temp2=temp2.next;
        }
        temp2.next=temp;
    }

    public void displayLinkList(){
        node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }


    public void deleteAtHead(){
        if(head==null){
            throw new IllegalArgumentException("linklist is null");
        }
        head = head.next;
        size--;
    }

    public void deleteAtTail(){
        if(head==null){
            throw new IllegalArgumentException("linkedlist is null");
        }
        node temp =head;;
        while(temp.next.next!=null){
            temp =temp.next;
        }
        temp.next=null;
        size--;
    }


    public Boolean searchNode(int val){
        node temp =head;

        while(temp!=null){
            if(temp.data==val){
                return true;
            }
            temp=temp.next;
        }

        return false;
    }
   
    public void removeNthNode(int idx){
        if(head==null){
            return;
        }
        
        if(idx==0){
            deleteAtHead();
            return;
        }

        node temp=head;
        int i=1;

        while(i<idx){
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;

    }

    public void reverseLinkedList(){
        node prev=null;
        node curr=head;
        node next;

        while(curr!=null){
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public node mideOfLinkedList(){
        node slow =head;
        node fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

    public  Boolean isPalandrome(){
        if(head==null||head.next==null||head.next.next==null){
            return true;
        }

        node mid=mideOfLinkedList();

        node prev=null;
        node curr=mid;
        node next;

        while(curr!=null){
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        node rHead=prev;
        node lHead=head;

        while(rHead!=null){
            if(rHead.data!=lHead.data){
                return false;
            }
            rHead = rHead.next;
            lHead = lHead.next;
        }

        return true;
    }


    public Boolean isCyclePresent(node head){
        node slow = head;
        node fast = head;

        while(fast!=null && fast.next != null){
            slow=slow.next;
            fast = fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }

    public  void removeCycle(node head){
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


    public int intersectionInLinkedlist(node head1,node head2){

        int a=0;
        int b=0;

        node ahead=head1;
        node bhead=head2;

        while(ahead!=null){
            ahead=ahead.next;
            a++;
        }

        while(bhead!=null){
            bhead=bhead.next;
            b++;
        }

         ahead=head1;
         bhead=head2;

        while(a>b){
            ahead=ahead.next;
            a--;
        }

        while (b>a) {
            bhead=bhead.next;
            b--;
        }

        while(ahead!=null && bhead!=null){
            if(ahead==bhead){
                return ahead.data;
            }
            ahead=ahead.next;
            bhead=bhead.next;
        }
        return -1;

    }

    public void displayLinkList(node head){
        node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    
    public node ThirdLargestElement(){
        node frist =null;
        node second = null;
         node third = null;

         node curr = head;

         while(curr!=null){
            if(frist==null || curr.data>frist.data){
                third=second;
                second = frist;
                frist=curr;
            }else if(second==null || curr.data>second.data){
                third=second;
                second = curr;
            }else if(third==null || curr.data>third.data){
                third=curr;
            }

             curr=curr.next;
         }

         return third;
         
    }



    public node mergeSortedLinklist(node list1,node list2){

        if(list1!=null && list2!=null){
            if(list1.data<list2.data){
                list1.next = mergeSortedLinklist(list1.next, list2);
                return list1;
            }else{
                list2.next = mergeSortedLinklist(list1, list2.next);
                return list2;
            }
        }

        if (list1==null)
            return list2;
        return list1;
    }




    public static void main(String[] args) {
        linklist ll = new linklist();

        ll.insertAtHead(3);
        ll.insertAtHead(2);
        ll.insertAtHead(1);
        ll.insertAtHead(0);

        // ll.displayLinkList();

        ll.insertAtTail(5);
        ll.insertAtTail(6);        
        ll.insertAtTail(7);        
        ll.insertAtTail(8);

        node head = new node(3);
        head.next = new node(4);
        head.next.next =new node(5);
        head.next.next.next = new node(7);
        head.next.next.next.next = new node(8);

        node head2 = new node(1);
        head2.next = new node(2);
        head2.next.next =new node(6);

        node head3 = ll.mergeSortedLinklist(head, head2);

        ll.displayLinkList(head3);
        // ll.displayLinkList(head);
        // ll.displayLinkList(head2);

        // System.out.println(ll.intersectionInLinkedlist(head, head2));

        // ll.displayLinkList();

        // ll.deleteAtHead();
        // ll.deleteAtHead();

        // ll.displayLinkList();

        // ll.deleteAtTail();
        // ll.deleteAtTail();

        // ll.displayLinkList();

        // System.out.println(ll.size);

        // System.out.println(ll.searchNode(4));

        // ll.removeNthNode(3);
        
        // ll.displayLinkList();

        // ll.reverseLinkedList();

        // ll.displayLinkList();

        // System.out.println(ll.mideOfLinkedList());

        // System.out.println(ll.isPalandrome());

        // System.out.println(ll.isCyclePresent(head));

        // ll.removeCycle(head);

        // System.out.println(ll.isCyclePresent(head));

        // ll.displayLinkList();
        // System.out.println(ll.ThirdLargestElement().data);
        
    }

}
