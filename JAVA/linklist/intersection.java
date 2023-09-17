import java.util.*;

public class intersection {
    public static class node {
        int data;
        node next;
        node(int val){
            this.data=val;
            this.next=null;
        }
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

    public static void main(String[] args) {

        node head1 = new node(5);
        head1.next = new node (2);
        head1.next.next = new node(3);
        head1.next.next.next = new node(1);
        head1.next.next.next.next = new node(7);
        head1.next.next.next.next.next = new node(6);
        head1.next.next.next.next.next.next = new node(9);

        node head2 = new node(4);
        head2.next = new node (3);
        head2.next.next = new node(7);
        head2.next.next.next = new node(6);
        head2.next.next.next.next = new node(9);


        System.out.println(FindIntersection(head1,head2).data);
    }
}
