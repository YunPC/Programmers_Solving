public class Tiling2 {

    //프로그래머스 문제풀이 Level3 2xn 타일링

    public static int[] cache;
    public static void main(String[] args) {
        int n = 4;
        cache = new int[n];
        int answer = ReturnAnswer(n, 0);
        
    }

    public static int ReturnAnswer(int n, int w)
    {
        if(w == n)
            return 1;
        else if(w > n)
            return 0;
        else if(cache[w] != 0)
            return cache[w];
        else
        {
            int res = 0;
            res = ReturnAnswer(n,w+1) % 1000_000_007;
            res += ReturnAnswer(n, w+2) % 1000_000_007;
            cache[w] = res%1000_000_007;
            return cache[w];
        }
    }
    
}
