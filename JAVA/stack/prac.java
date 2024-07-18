import java.util.*;

public class prac {
    

    public static void pushAtBottom(Stack<Integer>st, int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, data);
        st.push(top);
    }

    public static void reverseStack(Stack<Integer>st){
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        reverseStack(st);
        pushAtBottom(st, top);
    }

    public static boolean paranthesisMatching(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='(' || str.charAt(i)=='[' || str.charAt(i)=='{'){
                st.push(str.charAt(i));
            }else{
                if (st.isEmpty()) {
                    return false;
                }

                if((str.charAt(i)==')' && st.peek()=='(') ||
                    (str.charAt(i)==']' && st.peek()=='[') ||
                    (str.charAt(i)=='}' && st.peek()=='{')
                ){
                    st.pop();
                }else{
                    return false;
                }
            }
        }

        if (st.isEmpty()) {
            return true;
        }else{
            return false;
        }
    }


    public static int prefixEval(String st){
        Stack<Integer> s = new Stack<>();

        for(int i=st.length()-1;i>=0;i--){
            if(st.charAt(i)>='0' && st.charAt(i)<='9'){
                s.push(st.charAt(i)-'0');
            }else{
                int op1 = s.pop();
                int op2 = s.pop();

                switch (st.charAt(i)) {
                    case '+':
                        s.push(op1+op2);
                        break;
                    case '-':
                        s.push(op1-op2);
                        break;
                    case '*':
                        s.push(op1*op2);
                        break;
                    case '/':
                        s.push(op1/op2);
                        break;
                    case '^':
                        s.push(op1^op2);
                        break;
                }
            }
        }
        return s.peek();
    }

    public static int postFixEval(String st){
        Stack<Integer> a = new Stack<>();
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)>='0' && st.charAt(i)<='9'){
                a.push(st.charAt(i)-'0');
            }else{
                int op2 = a.pop();
                int op1 = a.pop();

                switch(st.charAt(i)){
                    case '+':
                        a.push(op1+op2);
                        break;
                    case '-':
                        a.push(op1-op2);
                        break;
                    case '*':
                        a.push(op1*op2);
                        break;
                    case '/':
                        a.push(op1/op2);
                        break;
                    case '^':
                        a.push(op1^op2);
                }
            }
        }
        return a.peek();
    }


    public class stack1{
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public void push(int data){
            q1.add(data);
        }

        public boolean Empty(Queue<Integer> q){
            if(q.isEmpty()){
                return true;
            }
            return false;
        }

        public int pop(){
            if(q1.isEmpty()){
                return -1;
            }
            while (q1.size()!=1) {
                q2.add(q1.poll());
            }
            int top = q1.poll();

            Queue<Integer> temp = new LinkedList<>();
            temp =q1;
            q1=q2;
            q2=temp;

            return top;
        }

        public int peak(){
            if(Empty(q1)){
                return -1;
            }
            while (q1.size()!=1) {
                q2.add(q1.poll());
            }
            int top = q1.peek();
            q2.add(q1.poll());

            Queue<Integer> temp = new LinkedList<>();
            temp = q1;
            q1=q2;
            q2=temp;

            return top;
        }

    }

    public class queue{
            Stack<Integer> s1 = new Stack<>();
            Stack<Integer> s2 = new Stack<>();

            public void push(int data){
                s1.push(data);
            }

            public boolean Empty(){
                if(s1.isEmpty() && s2.isEmpty()){
                    return true;
                }
                return false;
            }

            public int poll(){
                if(s1.isEmpty() && s2.isEmpty()){
                    return -1;
                }
                if(!s2.isEmpty()){
                    int  top = s2.pop();
                    return top;
                }else{
                    while (s1.size()!=1) {
                        s2.push(s1.pop());
                    }
                    int top = s1.pop();

                    return top;
                }
            }
    }

    // public static void main(String[] args) {
        // Stack<Integer> st = new Stack<>();
        // st.push(1);
        // st.push(2);
        // st.push(3);
        // pushAtBottom(st, 8);
        // // reverseStack(st);
        // System.out.println(st);

        // while (!st.isEmpty()) {
        //     System.out.println(st.pop());
        // }

        // String s = "({[]})";

        // System.out.println(paranthesisMatching(s));

        // System.out.println(prefixEval("-+7*45+20"));
        // System.out.println(postFixEval("46+2/5*7+"));




    // }
}
