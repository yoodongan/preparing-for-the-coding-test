package PRG.lv2;

import java.util.ArrayList;
import java.util.List;

public class n2_배열_자르기 {
    public List<Long> solution(int n, long left, long right) {
        List<Long> ans = new ArrayList<>();
        for(long i=left; i<=right; i++) {
            ans.add(Math.max(i/n, i%n) + 1);
        }
        return ans;
    }
}
