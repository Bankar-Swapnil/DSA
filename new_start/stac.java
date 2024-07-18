import java.util.*;
import java.util.Stack;

public class stac {


    public static void pushAtBottom(Stack<Integer> st,int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int top = st.pop();
        pushAtBottom(st,data);
        st.push(top);
    }

    public static void reverseStack(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        reverseStack(st);
        pushAtBottom(st, top);
    }


    public static boolean isValidPar(String str){
        if(str.length()==0){
            return true;
        }
        Stack<Character> st = new Stack<>();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='(' || str.charAt(i)=='[' || str.charAt(i)=='{'){
                st.push(str.charAt(i));
            }else{
                if(st.isEmpty()){
                    return false;
                }
                if(
                str.charAt(i)==')'&& st.peek()=='(' 
                || str.charAt(i)==']'&& st.peek()=='[' 
                || str.charAt(i)=='}'&& st.peek()=='{'
                
                ){
                    st.pop();
                }else{
                    return true;
                }
            }
        }

        if(st.isEmpty()){
            return true;
        }
        return false;
    }


    public static boolean isDublicate(String str){
        Stack<Character> st = new Stack<>();

        for(int i =0;i<str.length();i++){
            char c = str.charAt(i);
            if (c==')') {
                int count =0;
                while (st.pop() !='(') {
                    count++;
                }
                if(count<1){
                    return true;
                }
                count=0;
            }else{

                st.push(c);
            }
        }

        return false;
    }



    public static void main(String[] args) {

        // Stack<Integer> st = new Stack<>();
        //  st.add(1);
        //  st.add(2);
        //  st.add(3);

        //  System.out.println(st);

        //  pushAtBottom(st, 4);

        //  System.out.println(st);

        //  reverseStack(st);

        //  System.out.println(st);

        // String s = "({[]})";


        // System.out.println(isValidPar(s));


        String s ="(a+(b+c))";

        System.out.println(isDublicate(s));

    }
}
