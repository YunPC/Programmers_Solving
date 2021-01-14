
package level1;

import java.util.Arrays;

public class NumDesc {
    
    //프로그래머스 문제 풀이 level1 정수 내림차순으로 배치하기
    public static void main(String[] args)
    {
        long n = 118372;
        long answer = 0;
        String s = Long.toString(n);
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        s = new StringBuilder(new String(arr)).reverse().toString();
        answer = Long.parseLong(s);
    }
}
