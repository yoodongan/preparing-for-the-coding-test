package PRG.lv2;

import java.util.Arrays;
import java.util.Collections;

public class 최소값_만들기 {
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Integer[] a = Arrays.stream(A).boxed().toArray(Integer[]::new);
        Integer[] b = new Integer[B.length];
        for (int i = 0; i < B.length; i++) {
            b[i] = B[i];
        }
        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());
        for (int i = 0; i < A.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }
}
