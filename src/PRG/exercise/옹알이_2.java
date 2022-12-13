package PRG.exercise;

public class 옹알이_2 {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] speak = {"aya", "ye", "woo", "ma"};
        for(String bab : babbling){
            for(String sp : speak){
                if(!bab.contains("ayaaya") && !bab.contains("yeye") &&!bab.contains("woowoo")&&!bab.contains("mama"))
                    bab = bab.replace(sp," ");
            }
            bab = bab.replace(" ", "");
            if(bab == "")   answer ++;
        }
        return answer;
    }
}
