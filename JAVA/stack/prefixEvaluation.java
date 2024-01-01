import java.util.*;
public class prefixEvaluation {
    public static int prefixEval(String s){

        Stack<Integer> st = new Stack<>();

        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                st.push(s.charAt(i)-'0');
            }else{
                int one = st.peek();
                st.pop();
                int two = st.peek();
                st.pop();

                switch (s.charAt(i)) {
                    case '+':
                    st.push(one+two);
                    break;
                    case '-':
                    st.push(one-two);
                    break;
                    case '*':
                    st.push(one*two);
                    break;
                    case '/':
                    st.push(one/two);
                    break;
                    case '^':
                    st.push(one^two);
                    break;
                }
            }
        }

        return st.peek();
    }

    public static int postFix(String s){

        Stack<Integer> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                st.push(s.charAt(i)-'0');
            }else{
                int op2=st.peek();
                st.pop();
                int op1 = st.peek(); 
                st.pop();

                switch (s.charAt(i)) {
                    case '+':
                        st.push(op1+op2);
                        break;

                    case '-':
                        st.push(op1-op2);
                        break;
                    case '*':
                        st.push(op1*op2);
                        break;
                    case '/':
                        st.push(op1/op2);
                        break;
                    case '^':
                        st.push(op1^op2);
                        break;
                }
            }
        }
        return st.peek();
    }


    public static int prec(char a){
        if(a=='^'){
            return 3;
        }
        else if(a=='*' || a=='/'){
            return 2;
        }
        else if(a=='+' || a=='-'){
            return 1;
        }else{
            return -1;
        }
    }


    public static String infixToPrefix(String s){

        Stack<Character> st = new Stack<>();
        StringBuilder ab = new StringBuilder();

        for(int i=0;i<s.length();i++){
            
            if((s.charAt(i)>='a'&& s.charAt(i)<='z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z')){
                ab.append(s.charAt(i));
            }
            else if(s.charAt(i)=='('){ 
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    ab.append(st.peek());
                    st.pop();
                }
                if(!st.isEmpty()){
                    st.pop();
                }
            }else{
                while(!st.isEmpty() && prec(st.peek())>prec(s.charAt(i))){
                    ab.append(st.peek());
                    st.pop();
                }
                st.push(s.charAt(i));
            }
        }

        while(!st.isEmpty()){
            ab.append(st.peek());
            st.pop();
        }
        return ab.toString();
    } 


    public static String infixToPostfix(String s){

        StringBuilder ss = new StringBuilder(s);
        ss.reverse();

        Stack<Character> st = new Stack<>();
        StringBuilder ab = new StringBuilder();

        for(int i=0;i<s.length();i++){
            
            if((ss.charAt(i)>='a'&&ss.charAt(i)<='z')||(ss.charAt(i)>='A'&&ss.charAt(i)<='Z')){
                ab.append(ss.charAt(i));
            }
            else if(ss.charAt(i)==')'){
                st.push(ss.charAt(i));
            }
            else if(ss.charAt(i)=='('){
                while(!st.isEmpty() && st.peek()!=')'){
                    ab.append(st.peek());
                    st.pop();
                }
                if(!st.isEmpty()){
                    st.pop();
                }
            }else{
                while(!st.isEmpty() && prec(st.peek())>prec(s.charAt(i))){
                    ab.append(st.peek());
                    st.pop();
                }
                st.push(s.charAt(i));
            }
        }

        while(!st.isEmpty()){
            ab.append(st.peek());
            st.pop();
        }

        ab.reverse();
        return ab.toString();
    } 


    public static void main(String args[]){
        // System.out.println(prefixEval("-+7*45+20"));
        // System.out.println(postFix("46+2/5*7+"));
        // System.out.println(infixToPrefix("(a-b/c)*(a/k-l)"));
        System.out.println(infixToPostfix("(a-b/c)*(a/k-l)"));
    }
}
