import java.util.*;

public class queueUsingStack {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void push(int val) {
        s1.push(val);
    }

    public int pop() {
        if(s1.isEmpty() && s2.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        if(s2.isEmpty()){
            while (!s1.isEmpty()) {
                s2.push(s1.peek());
                s1.pop();
            }
        }
        int val = s2.peek();
        s2.pop();

        return val;
    }

    public boolean empty() {
        if (s1.isEmpty() && s2.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        queueUsingStack a = new queueUsingStack();
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        a.push(5);
        a.push(6);

        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
    }

}
