package PRG.exercise;

import java.util.*;

public class 문자열_내_마음대로_정하기 {
    public String[] solution(String[] strings, int n) {
        String[] ans = new String[strings.length];
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0; i<strings.length; i++) {
            arr.add(strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);
        for(int i=0; i<ans.length; i++) {
            ans[i] = arr.get(i).substring(1);
        }
        return ans;
    }
}
