package StackandQueues;

import java.util.Stack;

public class InfixToPostfix {
    public static int prec(Character c) {
        if (c == '+' || c == '-') {
            return 1;
        }
        if (c == '*' || c == '/') {
            return 2;
        }
        if (c == '^') {
            return 3;
        }
        return -1;
    }

    public static String infixToPostfix1(String exp) {
        Stack<Character> s = new Stack<>();
        String ans = "";
        for(int i=0;i<exp.length();i++){
            char c = exp.charAt(i);
            if(Character.isLetterOrDigit(c)){
                ans = ans+c;
            }
            else if(c=='('){
                s.push(c);
            }
            else if(c==')'){
                while(!s.isEmpty() && s.peek()!='('){
                    ans = ans + s.pop();
                }
                s.pop();
            }
            else{
                 while (!s.isEmpty()
                       && prec(c) <= prec(s.peek())) {
  
                    ans += s.peek();
                    s.pop();
                }
                s.push(c);
            }
        }
        
        while (!s.isEmpty()) {
            ans += s.peek();
            s.pop();
        }
        
        return ans;

    }

    public static void main(String[] args) {
        String exp = "(p+q)*(m-n)";
        System.out.println("Infix expression: " + exp);
        System.out.println("Prefix expression: " + infixToPostfix1(exp));
    }
}
