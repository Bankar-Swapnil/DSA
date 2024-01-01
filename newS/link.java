package newS;

public class link {
    
    public static class node{
        int data;
        node next;
        node(int val){
            this.data=val;
            this.next=null;
        }
    }


    public static int size;
    public static node head;
    public static node tail;


    public static void insertAtHead(int val){
        if(head==null){
            head=tail = new node(val);
            return;
        }
        node temp = new node(val);
        temp.next = head;
        head=temp;
    }


    public static void insertAtTail(int val){
        if(head==null){
            head=tail=new node(val);
            return;
        }
        node temp = new node(val);
        tail.next =temp;
        tail=temp;
    }


    public static void insertAtTail2(int val){
        if(head==null){
            head=new node(val);
            return;
        }
        node temp = head;
        node ne = new node(val);
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next =ne;
        tail=ne;
    }


    public static void deleteAtHead(){
        if(head==null){
            return;
        }
        head = head.next;
    }


    public static void deleteAtTail(){
        if(head==null){
            return;
        }
        node temp = head;
        while (temp.next.next!=null) {
            temp=temp.next;
        }
        temp.next=null;
    }


    public static void deleteAtIndex(int idx){
        if(head==null){
            return;
        }
        if(idx==0){
            deleteAtHead();
            return;
        }
        int i=1;
        node temp = head;

        while(i<idx){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }


    public static boolean searchNode(int val){
        if(head==null){
            return false;
        }
        node temp=head;
        while (temp!=null) {
            if(temp.data==val){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }


    public static void displayLink(){
        node temp =head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println();
    }


    public static void reverseLink(){
        node prev=null;
        node curr=head;
        node next;
        while (curr!=null) {
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head =prev;
    }


    public static node mideOfLinkedList(){
        node fast = head;
        node slow = head;
        while (fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow=slow.next;
        }
        return slow;
    }


    public static boolean isPalindrom(){

        if(head==null || head.next == null){
            return true;
        }

        node mid = mideOfLinkedList();

        node prev=null;
        node curr = mid;
        node next;

        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev=curr;
            curr=next;
        }

        node rhead=prev;
        node lhead=head;

        while (rhead!=null) {
            if(rhead.data!=lhead.data){
                return false;
            }
            rhead=rhead.next;
            lhead=lhead.next;
        }

        return true;
    }

    

    public static node RecursiveReverse(node head){
        if(head==null|| head.next==null){
            return head;
        }
        node newHead = RecursiveReverse(head.next);
        head.next.next = head;
        head.next=null;
        return newHead;
    }


    public static node mergeSortedLinklist(node head1,node head2){
        if(head1!=null && head2!=null){
            if(head1.data<head2.data){
                head1.next=mergeSortedLinklist(head1.next, head2);
                return head1;
            }else{
                head2.next=mergeSortedLinklist(head1, head2.next);
                return head2;
            }
        }
        if(head1==null){
            return head2;

        }
        return head1;
    }


    public static node FindIntersection(node head1,node head2){
       int a=0;
       int b=0;
       node ab=head1;
       node bc = head2;
       
       while (ab!=null) {
            a++;
            ab=ab.next;
       }
       while (bc!=null) {
            b++;
            bc=bc.next;
       }

       ab=head1;
       bc=head2;

       while (a>b) {
            a--;
            ab=ab.next;
       }
       while (b>a) {
            b--;
            bc=bc.next;
       }

       while (ab!=null && bc!=null) {
            if(ab.data==bc.data){
                return ab;
            }
            ab=ab.next;
            bc=bc.next;
       }
       return null;
    }


    public static int thirdLargestNode(){
        if(head==null || head.next==null || head.next.next==null){
            throw new IllegalArgumentException("ssjsj");
        }

        node firstLargest=null;
        node secondLargest=null;
        node thirdLargest=null;

        node curr = head;

        while (curr!=null) {
            if(firstLargest==null || curr.data > firstLargest.data){
                thirdLargest=secondLargest;
                secondLargest=firstLargest;
                firstLargest = curr;
            }else if(secondLargest==null || curr.data>secondLargest.data){
                thirdLargest=secondLargest;
                secondLargest=curr;
            }else if(thirdLargest==null || curr.data>thirdLargest.data){
                thirdLargest=curr;
            }
            curr=curr.next;
        }

        return thirdLargest.data;
    }


    public static void main(String[] args) {
        
    }

}