package PRG.lv2;

import java.util.Stack;

public class 짝지어_제거하기 {
    public int solution(String s)
    {
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if(st.size() != 0 && st.peek() == s.charAt(i)) {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }
        return st.size() > 0 ? 0 : 1;
    }
}
