package PRG.lv2;

import java.util.Arrays;

public class 구명보트 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int start = 0;
        for(int end=people.length-1; start <= end; end--) {
            if(people[start] + people[end] <= limit) {
                start++;
            }
            answer++;
        }
        return answer;
    }
    public static void main(String[] args) {

    }
}
