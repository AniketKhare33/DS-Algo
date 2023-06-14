package StackandQueues;

import java.util.Stack;

public class PrefixToInfix {

    public static boolean isOperator(char x) {
        switch (x) {
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
            case '%':
                return true;
        }
        return false;
    }

    public static String convert(String exp) {
        Stack<String> s = new Stack<>();
        int l = exp.length();
        for (int i = l - 1; i >= 0; i--) {
            char c = exp.charAt(i);
            if (isOperator(c)) {
                String s1 = s.pop();
                String s2 = s.pop();
                String temp = "(" + s1 + c + s2 +")";
                s.push(temp);

            } else {
                s.push(c + "");
            }
        }
        return s.pop();

    }

    public static void main(String[] args) {
        String exp = "*-A/BC-/AKL";
        System.out.println("Infix : " + convert(exp));
    }
}
