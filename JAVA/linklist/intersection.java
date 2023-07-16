package linklist;

public class intersection {
    public static class node {
        int data;
        node next;
        node(int val){
            this.data=val;
            this.next=null;
        }
    }
    public node getIntersectionNode(node headA, node headB) {
        int ac = 0;
        int bc = 0;
        node a = headA;
        node b = headB;
        while(a != null){
            ac++;
            a = a.next;
        }
        while(b != null){
            bc++;
            b = b.next;
        }
        while(ac > bc){
            ac--;
            headA = headA.next;
        }
        while(bc > ac){
            bc--;
            headB = headB.next;
        }
        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;

    }
}
