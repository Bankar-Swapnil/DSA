import java.util.*;

public class queueAndStack {
    
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();


    public boolean isEmpty(){
        return s1.isEmpty();
    }

    public void push(int val){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }

        s1.push(val);

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public int remove(){
        if(s1.isEmpty()){
            return -1;
        }

        return s1.pop();
    }


    public static void main(String[] args) {
        queueAndStack q = new queueAndStack();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        q.push(6);
        q.push(7);

        System.out.println(q.remove());        
        System.out.println(q.remove());        
        System.out.println(q.remove());        
        System.out.println(q.remove());        
        // System.out.println(q.remove());        
        // System.out.println(q.remove());        
        // System.out.println(q.remove());        




    }
}
