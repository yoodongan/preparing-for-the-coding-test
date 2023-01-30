package PRG.exercise;

import java.util.*;

/**
 * 2019 KAKAO BLIND RECRUITMENT
 */
public class 실패율 {
    public static int[] solution(int n, int[] stages) {
        HashMap<Integer, Double> map = new HashMap<>();
        int[] present = new int[n+2];  // 분자. 현재 스테이지를 클리어하고 있는 사람의 수, 스테이지가 2라면, 2에 있는 사람의 수.
        int[] clear = new int[n+1];  // 분모. 스테이지에 도달한 사람의 수. 스테이지가 2라면, 2이상의 스테이지에 있는 사람의 횟수.

        for (int stage : stages) {
            present[stage]++;   // 해당 스테이지에 몇 명 있는지 카운트.
        }
        clear[n] = present[n] + present[n+1];
        for (int i = n - 1; i >= 1; i--) {
            clear[i] = present[i] + clear[i+1];
        }

        for(int i = 1; i < clear.length; i++) {
            if(present[i] == 0 || clear[i] == 0) {
                map.put(i, 0.0);
            }else {
                map.put(i, (double)present[i] / clear[i]);
            }
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (o1, o2) -> Double.compare(map.get(o2), map.get(o1)));

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int n = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        System.out.println(Arrays.toString(solution(n, stages)));
    }


}
