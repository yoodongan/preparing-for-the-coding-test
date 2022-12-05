package PRG.hash;

import java.util.HashSet;

public class 폰켓몬 {
    public int solution(int[] nums) {
        int takeNumber = nums.length/2;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        if(set.size() > takeNumber) return takeNumber;
        else return set.size();
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3};
        폰켓몬 main = new 폰켓몬();
        System.out.println(main.solution(nums));
    }
}
