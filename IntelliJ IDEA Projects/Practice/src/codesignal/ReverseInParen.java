package codesignal;

import java.util.*;

public class ReverseInParen {

    public static void main(String[] args) {

        String input = "foo(bar(baz))blim";
        System.out.println(reverseInParentheses(input));

    }

    public static String reverseInParentheses(String inputString) {

        Stack<Character> st = new Stack<>();
        for(char c: inputString.toCharArray()){
            if( c == ')'){
                Queue<Character> p = new LinkedList<>();
                while(!st.isEmpty() && st.peek() != '(') p.add(st.pop());
                if(!st.isEmpty()) st.pop();
                while(!p.isEmpty()) st.push(p.remove());
            } else {
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()) sb.append(st.pop());

        return sb.reverse().toString();

    }

}

