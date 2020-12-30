public class HarshardNum {

    //프로그래머스 문제풀이 level1 하샤드 수
    public static void main(String[] args)
    {
        int x = 10;
        boolean answer = true;
        int n = x;
        int q = 0;
        while(n > 0)
        {
            q += n%10;
            n /= 10;
        }
        if(x % q != 0)
            answer = false;

        System.out.print(answer);
    }
    
}
