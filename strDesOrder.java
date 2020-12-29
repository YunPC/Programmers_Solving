import java.util.*;

public class strDesOrder {

    //프로그래머스 문제풀이 level1 문자열 내림차순으로 배치하기

    public static void main(String[] args)
    {
        String s = "Zbcdefg";
        char[] arr = new char[s.length()];
        for(int i = 0; i < s.length(); i++)
        {
            arr[i] = s.charAt(i);
        }
        Arrays.sort(arr);
        String answer = new StringBuilder(new String(arr)).reverse().toString();
    }
    
}
