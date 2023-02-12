package PRG.lv2;

import java.util.*;

public class 귤_고르기 {
    public static int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < tangerine.length; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }
        List<Integer> arr = new ArrayList<>(map.values());
        Collections.sort(arr);
        int findNum = tangerine.length - k;
        int sum = 0;
        int index = 0;
        for (Integer integer : arr) {
            sum += integer;
            if(sum > findNum) {
                answer = arr.size() - index;
                break;
            }
            else if(sum == findNum) {
                answer = arr.size() - (index+1);
                break;
            }
            index++;
        }
        return answer;
    }


    public static void main(String[] args) {
        int k = 4;
        int[] arr = {1, 3, 2, 5, 4, 5, 2, 3};
        System.out.println(solution(k, arr));

    }
}

