import java.util.*;
public class PushAtBottom {
    public static void pATb(Stack<Integer> st,int data){//push at bottom
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int top = st.pop();
        
        pATb(st, data);
        st.push(top);
    }

    public static void reverseStack(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        reverseStack(st);
        pATb(st, top);
    }

    public static void main(String args[]){
        Stack<Integer> a = new Stack<>();
        a.push(1);
        a.push(2);
        a.push(3);
        // pATb(a, 5);
        reverseStack(a);

        while(!a.isEmpty()){
            System.out.println(a.peek());
            a.pop();
        }
        
        
    }
}
