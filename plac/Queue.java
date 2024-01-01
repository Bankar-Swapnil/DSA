import java.util.*;

public class Queue {

    public static int prec(char i){
        if(i=='^'){
            return 3;
        }else if(i=='*' || i=='/'){
            return 2;
        }else if(i=='+'|| i =='-'){
            return 1;
        }else {
            return -1;
        }
    }

    public static String infixToPostfix(String s){

        // Stack<Character> st = new Stack<>();
        Stack<Character> st = new Stack<>();

        StringBuilder t = new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)<='a'||s.charAt(i)>='z' && s.charAt(i)=='A' || s.charAt(i)=='Z'){
                t.append(s.charAt(i));
            }else if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }else if(s.charAt(i)==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    t.append(st.peek());
                    st.pop();
                }
                if(!st.isEmpty()){
                    st.pop();
                }
            }else{
                while(!st.isEmpty() && prec(st.peek()) > prec(s.charAt(i))){
                    t.append(st.peek());
                    st.pop();
                }
                t.append(s.charAt(i));
            }
        }

        while(!st.isEmpty()){
            t.append(st.peek());
            st.pop();
        }

        return st.toString();
    }
    
    public static void main(String[] args) {
        String s= "(a+b)-(a*b)";
        String a=infixToPostfix(s);
        System.out.println(a);
    }
}
