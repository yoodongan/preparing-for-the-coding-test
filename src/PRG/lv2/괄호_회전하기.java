package PRG.lv2;

import java.util.Stack;

public class 괄호_회전하기 {
    public static int solution(String s) {
        int answer = 0;
        String str = s;
        for (int i = 0; i < s.length(); i++) {
            if(check(str)) answer++;
            str = str.substring(1, s.length()) + str.charAt(0);
        }
        return answer;
    }
    public static boolean check(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(' :
                    st.push('(');
                    break;
                case '[' :
                    st.push('[');
                    break;
                case '{' :
                    st.push('{');
                    break;

                case ')' :
                    if(st.isEmpty() || st.peek() != '(') return false;
                    else st.pop();
                    break;
                case ']' :
                    if(st.isEmpty() || st.peek() != '[') return false;
                    else st.pop();
                    break;
                case '}' :
                    if(st.isEmpty() || st.peek() != '{') return false;
                    else st.pop();
                    break;
            }
        }
        return st.isEmpty();
    }
}
