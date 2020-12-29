public class StrtoInt {

    //프로그래머스 문제풀이 level1 문자열을 정수로 바꾸기
    public static void main(String[] args)
    {
        String s = "1234";
        int answer = 0;
        if(s.charAt(0) == '+')
            answer = Integer.parseInt(s.substring(1));
        if(s.charAt(0) == '-')
            answer = Integer.parseInt(s.substring(1)) * (-1);
        else
            answer = Integer.parseInt(s);
    }
    
}
