import java.util.*;
public class mergeSortedLinklist {
    public static class node {
            int data;
            node next;
            node(int val){
                this.data=val;
                this.next=null;
            }
    }

    public void display(node head){
        node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }


    public node mergeTwoLists(node list1, node list2) {

        if(list1!=null && list2!=null){
            if(list1.data<list2.data){
                list1.next=mergeTwoLists(list1.next,list2);
                return list1;
                }
                else{
                    list2.next=mergeTwoLists(list1,list2.next);
                    return list2;
            }
        }
        if(list1==null)
            return list2;
        return list1;
        
    }

    public static void  main(String args[]) {
        mergeSortedLinklist ll = new mergeSortedLinklist();

        node head = new node(1);
        head.next = new node(2);
        head.next.next = new node(4);
        

        node head2 = new node(3);
        head2.next = new node(5);
        head2.next.next = new node(6);

        node head3 = ll.mergeTwoLists(head,head2);

        ll.display(head3);

    }

}
