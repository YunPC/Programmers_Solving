package level2;

public class Fibonacci {

    //프로그래머스 문제풀이 level2 피보나치 수
    public static void main(String[] args) {
        int n = 5;
        int a = 0, b = 1, c = 0;
        for(int i = 2; i <= n; i++)
        {
            a %= 1234567;
            b %= 1234567;
            c = a+b;
            a = b;
            b = c;
            c %= 1234567;
            
        }
        System.out.println(c);
    }
    
}
