package level2;

public class RepeatBinary {

    //프로그래머스 문제풀이 level2 이진 변환 반복하기
    public static void main(String[] args) {
        String s = "110010101001";
        int[] answer = new int[2];
        int cnt = 0, l, zero = 0;
        while(!s.equals("1"))
        {
            cnt++;
            l = s.length();
            s = s.replace("0", "");
            zero += l - s.length();
            s = Integer.toBinaryString(s.length());
        }
        answer[0] = cnt;
        answer[1] = zero;
    }
    
}
