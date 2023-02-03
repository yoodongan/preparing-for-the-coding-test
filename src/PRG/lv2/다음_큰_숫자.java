package PRG.lv2;

public class 다음_큰_숫자 {
    public int solution(int n) {
        int answer = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        String bin1 = Integer.toBinaryString(n);
        for(int i=0; i<bin1.length(); i++) {
            if(bin1.charAt(i) == '1') cnt1++;
        }
        while(true) {
            cnt2 = 0;
            n++;
            String bin2 = Integer.toBinaryString(n);
            for(int i=0; i<bin2.length(); i++) {
                if(bin2.charAt(i) == '1') cnt2++;
            }
            if(cnt1 == cnt2) break;
        }
        answer = n;
        return answer;
    }
}
