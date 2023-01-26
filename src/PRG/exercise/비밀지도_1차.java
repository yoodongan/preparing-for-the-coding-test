package PRG.exercise;

public class 비밀지도_1차 {
    public static String getBinary(int n, int number) {
        String binary = Integer.toBinaryString(number);
        int len = binary.length();
        for (int i = 0; i < n - len; i++) {
            binary = "0" + binary;
        }
        return binary;
    }

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            String binary1 = getBinary(n, arr1[i]);
            String binary2 = getBinary(n, arr2[i]);
            for (int j = 0; j < binary1.length(); j++) {
                if(binary1.charAt(j) == '1' || binary2.charAt(j) == '1') sb.append("#");
                else sb.append(" ");
            }
            answer[i] = sb.toString();
        }
        return answer;
    }


}
