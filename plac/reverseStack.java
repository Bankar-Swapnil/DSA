import java.util.*;

public class reverseStack {

    public static void pushAtbottom(Stack<Integer> st, int val){
        if(st.isEmpty()){
            st.push(val);
            return;
        }
        int top = st.pop();
        pushAtbottom(st,val);
        st.push(top);
    }


    public static void reverseStacks(Stack<Integer> st ){
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        reverseStacks(st);
        pushAtbottom(st,top);
    }
    
    public static void main(String[] args) {
        Stack<Integer> st = new Stack();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        // pushAtbottom(st,6);
        reverseStacks(st);


        while(!st.isEmpty()){
            System.out.println(st.pop());
        }

    }
}
