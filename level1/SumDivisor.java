
package level1;

public class SumDivisor {
    
    //프로그래머스 문제풀이 level1 약수의 합
    public static void main(String[] args)
    {
        int n = 12;
        int answer = 0;
        for(int i = 1; i <= n; i++)
        {
            if(n%i == 0)
                answer += i;
        }
    }
}
