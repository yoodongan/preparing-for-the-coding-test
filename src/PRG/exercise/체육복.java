package PRG.exercise;

/**
 * 탐욕법(Greedy)
 */
public class 체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] people = new int[n];   // people 배열을 새로 만든다.
        int answer = n;  // 모든 학생 수로 answer 값을 초기화한다.

        for (int l : lost)
            people[l-1]--;   // lost에 해당하는 번호 -1인 위치값에 -1한다. -> lost 인 사람만 -1.
        for (int r : reserve) // reserve에 해당하는 번호 -1인 위치값에 +1한다.
            people[r-1]++;
        //이로 인해, lost, reserve 인 사람은 결과적으로 0 이 된다.

        for (int i = 0; i < people.length; i++) {
            if(people[i] == -1) {  // 이제, 배열 값이 -1 이라면 잃어버리기만한 사람이다.
                if(i-1>=0 && people[i-1] == 1) { // i 가 0번째면 index 오류나므로.
                    people[i]++;
                    people[i-1]--;
                }else if(i+1< people.length && people[i+1] == 1) {
                    people[i]++;
                    people[i+1]--;
                }else
                    answer--; // 찾지 못했다면, 체육복을 입지 못한 것이므로 -1.
            }
        }
        return answer;
    }
}
