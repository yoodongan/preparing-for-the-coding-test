package PRG.exercise;

/**
 * 2020 카카오 인턴십
 */
public class 키패드_누르기 {
    public String solution(int[] numbers, String hand) {
        int[][] keypads = {{3, 1}, {0, 0}, {0, 1}, {0, 2}, {1, 0}, {1, 1}, {1, 2}, {2, 0}, {2, 1}, {2, 2}};
        int[] left = {3,0};
        int[] right = {3,2};
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {
            switch (numbers[i]) {
                case 1, 4, 7 :
                    left = keypads[numbers[i]];
                    sb.append("L");
                    break;
                case 3, 6, 9 :
                    right = keypads[numbers[i]];
                    sb.append("R");
                    break;
                default:
                    int left_dist = Math.abs(keypads[numbers[i]][0] - left[0]) + Math.abs(keypads[numbers[i]][1] - left[1]);
                    int right_dist = Math.abs(keypads[numbers[i]][0] - right[0]) + Math.abs(keypads[numbers[i]][1] - right[1]);

                    if(left_dist > right_dist){
                        right = keypads[numbers[i]];
                        sb.append("R");
                    } else if(left_dist < right_dist){
                        left = keypads[numbers[i]];
                        sb.append("L");
                    }else{
                        // 같을 경우 주 손잡이로 선택
                        if(hand.equals("left")){
                            left = keypads[numbers[i]];
                            sb.append("L");
                        }else{
                            right = keypads[numbers[i]];
                            sb.append("R");
                        }
                    }
                    break;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
