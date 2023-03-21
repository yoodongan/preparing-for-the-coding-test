package PRG.exercise;

public class 비밀지도_1차 {
    static int n;
    public String getBinary(int number) {
        String num = Integer.toBinaryString(number);
        StringBuilder sb = new StringBuilder();
        if(num.length() < n) {
            for(int i=0; i<n - num.length(); i++) {
                sb.append("0");
            }
        }
        sb.append(num);
        return sb.toString();
    }

    public String[] solution(int n, int[] arr1, int[] arr2) {
        this.n = n;
        String[] answer = new String[n];
        for(int i=0; i<n; i++) {
            StringBuilder sb = new StringBuilder();
            String str1 = getBinary(arr1[i]);
            String str2 = getBinary(arr2[i]);
            for(int j=0; j<str1.length(); j++) {
                if(str1.charAt(j) == '1' || str2.charAt(j) == '1') {
                    sb.append("#");
                } else sb.append(" ");
            }
            answer[i]  = sb.toString();
        }

        return answer;
    }


}
