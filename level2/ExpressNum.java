package level2;

public class ExpressNum {

    //프로그래머스 문제풀이 level2 숫자의 표현
    public static void main(String[] args) {
        int n = 15;
        int answer = 0;
        int add = 1, sub = 1, sum = 0;
        while(add <= n)
        {
            sum += add++;
            while(sum > n)
            {
                sum -= sub;
                sub++;
            }
            if(sum == n)
                answer++;
            
        }
        System.out.println(answer);
    }
    
}
