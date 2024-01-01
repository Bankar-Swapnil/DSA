import java.util.*;

public class parenthesis {


    public static boolean parenthesisMatch(String s){
        Stack<Character> st = new Stack();

        for(int i=0;i<s.length();i++){     
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                st.push(s.charAt(i));
            }else{
                if(!st.isEmpty()){
                    return false;
                }
                if((s.charAt(i)==')' && st.peek()=='(') || (s.charAt(i)=='}' && st.peek()=='{')||(s.charAt(i)==']' && st.peek()=='[')){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        if(!st.isEmpty()){
            return false;
        }
        return true;
    }


    public static boolean isDublicate(String s){
        Stack<Character> st = new Stack();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                int count=0;
                while(st.peek()!='('){
                    st.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }else{
                    st.pop();
                }
            }
            else{
                st.push(s.charAt(i));
            }
        }

        return false;
    }

    public static void main(String[] args) {
        
        String s="((a+b))";

        System.out.println(isDublicate(s));
    }
    
}
