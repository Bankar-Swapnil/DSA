import java.util.*;
    
    public class seconLargestElement {

        public static class ListNode {
            int val;
            ListNode next;
        
            public ListNode(int val) {
                this.val = val;
            }
        }

        public static int findThirdLargest(ListNode head) {
            if (head == null || head.next == null || head.next.next == null) {
                throw new IllegalArgumentException("Linked list must contain at least three nodes.");
            }
    
            ListNode firstLargest = null;
            ListNode secondLargest = null;
            ListNode thirdLargest = null;
    
            ListNode current = head; 
            while (current != null) {
                if (firstLargest == null || current.val > firstLargest.val) {
                    thirdLargest = secondLargest;
                    secondLargest = firstLargest;
                    firstLargest = current;
                } else if (secondLargest == null || current.val > secondLargest.val) {
                    thirdLargest = secondLargest;
                    secondLargest = current;
                } else if (thirdLargest == null || current.val > thirdLargest.val) {
                    thirdLargest = current;
                }
                current = current.next;
            }
            return thirdLargest.val;
        }
    
        public static void main(String[] args) {
            // Create a sample linked list
            ListNode head = new ListNode(10);
            ListNode second = new ListNode(20);
            ListNode third = new ListNode(30);
            ListNode fourth = new ListNode(40);
            ListNode fifth = new ListNode(50);
    
            head.next = second;
            second.next = third;
            third.next = fourth;
            fourth.next = fifth;
    
            int thirdLargest = findThirdLargest(head);
            System.out.println("Third largest node value: " + thirdLargest);
        }
    }