import java.util.*;

public class stackAndQueue {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    int n=0;

    public void push(int val){
        q1.add(val);
        n++;
    }

    public int pop(){
        if(q1.isEmpty()){
            return -1;
        }
        while(q1.size()!=1){
            q2.add(q1.peek());
            q1.poll();
        }
        int z=q1.poll();

        Queue<Integer> temp = new LinkedList<>();
        temp = q2;
        q2=q1;
        q1=temp;

        return z;

    }

    public int top(){
        if(q1.isEmpty()){
            return -1;
        }
        while(q1.size()!=1){
            q2.add(q1.peek());
            q1.poll();
        }

        int z=q1.poll();
        q2.add(z);

        Queue<Integer> temp = new LinkedList<>();
        temp = q2;
        q2=q1;
        q1=temp;

        return z;

    }


    public static void main(String[] args) {
        stackAndQueue a = new stackAndQueue();

        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        a.push(5);
        a.push(6);

        // System.out.println(a.top());
        // System.out.println(a.pop());
        // System.out.println(a.pop());
        // System.out.println(a.pop());
        // System.out.println(a.pop());
        // System.out.println(a.pop());
        // System.out.println(a.pop()); 

        System.out.println(a.top());

    }
}
