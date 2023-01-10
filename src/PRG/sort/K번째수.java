package PRG.sort;

import java.util.ArrayList;
import java.util.Collections;

public class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] ans = new int[commands.length];
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < commands.length; i++) {
            for (int j = commands[i][0]; j <= commands[i][1]; j++) {
                arr.add(array[j-1]);
                Collections.sort(arr);
            }
            ans[i] = arr.get(commands[i][2] - 1);
            arr.clear();
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
