
package level1;

public class NNumXSpace {

    //프로그래머스 문제 풀이 level1 x만큼 간격이 있는 n개의 숫자
    public static void main(String[] args)
    {
        int x = 2, n = 5;
        long[] answer = new long[n];
        answer[0] = x;
        for(int i = 1; i < n; i++)
            answer[i] = answer[i-1]+x;
    }
    
}
