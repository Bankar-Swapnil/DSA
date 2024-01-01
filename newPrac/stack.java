import java.util.*;

public class stack {

    int n = 0;
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int val) {
        q1.add(val);
        n++;
    }

    public int top() {
        if (q1.isEmpty()) {
            return -1;
        }

        while (q1.size() != 1) {
            q2.add(q1.peek());
            q1.poll();
        }
        int val = q1.peek();
        q2.add(q1.peek());
        q1.poll();

        Queue<Integer> q3 = new LinkedList<>();
        q3 = q2;
        q2 = q1;
        q1 = q3;

        return val;
    }

    public int pop() {
        if (q1.isEmpty()) {
            return -1;
        }

        while (q1.size() != 1) {
            q2.add(q1.peek());
            q1.poll();
        }
        int val = q1.peek();

        q1.poll();

        Queue<Integer> q3 = new LinkedList<>();
        q3 = q2;
        q2 = q1;
        q1 = q3;

        return val;
    }

    public static void main(String[] args) {
        stack a = new stack();

        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        a.push(5);
        a.push(6);

        System.out.println(a.top());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
    }
}
