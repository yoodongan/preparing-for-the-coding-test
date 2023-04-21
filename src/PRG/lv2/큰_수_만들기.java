package PRG.lv2;

public class 큰_수_만들기 {
    public String solution(String number, int k) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int len = number.length() - k;
        int start = 0;
        for(int i=0; i<len; i++) {
            char max = '0';
            for(int j=start; j <= k+i; j++) {
                if(max < number.charAt(j)) {
                    max = number.charAt(j);
                    start = j+1;
                }
            }
            sb.append(Character.toString(max));
        }
        answer = sb.toString();
        return answer;
    }
}
