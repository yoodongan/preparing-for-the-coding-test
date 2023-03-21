package PRG.exercise;

public class 핸드폰_번호_가리기 {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        String front = phone_number.substring(0, phone_number.length()-4);
        for(int i=0; i<front.length(); i++) {
            sb.append("*");
        }
        phone_number = phone_number.substring(phone_number.length()-4);
        sb.append(phone_number);
        return sb.toString();
    }
}
