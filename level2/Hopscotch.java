package level2;

public class Hopscotch {

    //프로그래머스 문제풀이 level2 땅따먹기
    public static void main(String[] args) {
        int[][] land = {
            {1, 2, 3, 5},
            {5, 6, 7, 8},
            {4, 3, 2, 1}
        };
        int[][] cache = new int[land.length][4];
        int answer = 0;
        for(int i = 0; i < 4; i++)
        {
            answer = Math.max(answer, ReturnScore(0, i, land, 0, cache));
        }

        System.out.println(answer);
    }
    public static int ReturnScore(int r, int c, int[][] land, int score, int[][] cache)
    {
        if(r == land.length-1)
            return land[r][c];
        if(cache[r][c] != 0)
            return cache[r][c];
        else
        {
            int res = 0;
            for(int i = 0; i < 4; i++)
            {
                if(i == c)
                    continue;
                res = Math.max(res, ReturnScore(r+1, i, land, score+land[r][c], cache));
            }
            cache[r][c] = res + land[r][c];
            return res + land[r][c];
        }
    }
}
