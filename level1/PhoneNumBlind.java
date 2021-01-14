
package level1;

public class PhoneNumBlind {

    //프로그래머스 문제 풀이 level1 휴대폰 번호 가리기
    public static void main(String[] args)
    {
        String phone_number = "01033334444";
        StringBuilder buff = new StringBuilder();
        for(int i = 0; i < phone_number.length()-4; i++)
            buff.append("*");
        buff.append(phone_number.substring(phone_number.length()-4, phone_number.length()));
        String answer = buff.toString();

        System.out.print(answer);
    }
    
}
