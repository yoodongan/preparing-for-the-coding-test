package PRG.exercise;

public class 삼총사 {
    public static int answer = 0;
    public static int[] pm = new int[100];
    public static int[] arr;
    public static int index = 0;
    public static int[] check;
    public static void dfs(int L, int sum) {
        if(L==3) {
            if (sum == 0) {
                for (int i : pm) {
                    System.out.print(i + " ");
                }
                System.out.println();
                answer++;
                return;
            }
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                if (check[i] != 1) {
                    check[i] = 1;
                    pm[index++] = arr[i];
                    dfs(L+1, sum+arr[i]);
                    check[i] = 0;
                }
            }
        }

    }

    public int solution(int[] number) {
        check = new int[number.length];
        arr = number;
        dfs(0, 0);
        return answer;
    }

    public static void main(String[] args) {
        삼총사 ans = new 삼총사();
        int[] number = {-2, 3, 0, 2, -5};
        System.out.println(ans.solution(number));

    }
}
