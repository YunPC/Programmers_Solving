
package level2;

public class TriSnail {
    
    //프로그래머스 문제풀이 level2 삼각 달팽이

    public static void main(String[] args)
    {
        int n = 4;
        int[][] paper = new int[2*n-1][2*n-1];
        int len = n;
        int num = 1;
        int l_d_move = n%3;
        int r_move = l_d_move-1 < 0 ? 2: l_d_move-1;
        int r = 0, c = (2*n-1)/2;
        while(len != 0)
        {
            int move_id = len%3;
            if(move_id == l_d_move)
            {
                for(int i = 0; i < len; i++)
                    paper[r++][c--] = num++;
                r--;
                c++;
            }
            else if(move_id == r_move)
            {
                for(int i = 0; i < len; i++)
                {
                    c+=2;
                    paper[r][c] = num++;
                }
            }
            else
            {
                for(int i = 0; i < len; i++)
                    paper[--r][--c] = num++;
                ++r;
                --c;
            }
            len--;
        }
        int idx = 0;
        int[] answer = new int[num-1];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < 2*n-1; j++)
            {
                if(paper[i][j] != 0)
                    answer[idx++] = paper[i][j];
            }
        }
    }
}
