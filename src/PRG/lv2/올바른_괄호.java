package PRG.lv2;

import java.util.Stack;

public class 올바른_괄호 {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            if(st.size() ==0) {
                if(s.charAt(i) == '(') st.push(s.charAt(i));
                else answer = false;
            } else {
                if(s.charAt(i) == '(') st.push(s.charAt(i));
                else {
                    if(st.peek() == '(') st.pop();
                    else answer = false;
                }
            }
        }
        if(st.size() != 0) answer = false;

        return answer;
    }
}
