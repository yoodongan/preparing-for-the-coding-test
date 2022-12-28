package PRG.exercise;

import java.util.ArrayList;
import java.util.Comparator;

public class 두개_뽑아서_더하기 {
    public ArrayList<Integer> solution(int[] numbers) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int plusNum = numbers[i] + numbers[j];
                if(!ans.contains(plusNum)) ans.add(plusNum);
            }
        }
        ans.sort(Comparator.naturalOrder());
        return ans;
    }
    public static void main(String[] args) {

    }
}
