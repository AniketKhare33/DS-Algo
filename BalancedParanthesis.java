package StackandQueues;
import java.util.Stack;
public class BalancedParanthesis {
    public static boolean isValid(String s){
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if( c=='(' || c=='[' || c=='{'){
                st.push(c);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char top = st.pop();
                if( c==')' && top=='(' || c==']' && top=='['|| c=='}' && top=='{'){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s="()[{}()]";
		if(isValid(s)==true)
		System.out.println("True");
		else
		System.out.println("False");
    }
}
