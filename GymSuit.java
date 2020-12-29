import java.util.*;

public class GymSuit {

    //프로그래머스 문제풀이 level1 체육복
    public static void main (String[] args)
    {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        int answer = 0;
        int[] cnt = new int[n];
        Arrays.fill(cnt, 1);
        for(int idx : lost)
            cnt[idx-1]--;
        for(int idx : reserve)
            cnt[idx-1]++;
        for(int i = 0; i < n; i++)
        {
            if(cnt[i] > 0)
                answer++;
            else
            {
                if(i == 0)
                {
                    if(cnt[1] > 1)
                    {
                        answer++;
                        cnt[1]--;
                    }
                }
                else if(i == n-1)
                {
                    if(cnt[n-2] > 1)
                        answer++;
                }
                else
                {
                    if(cnt[i-1] > 1)
                    {
                        answer++;
                        continue;
                    }
                    else if(cnt[i+1] > 1)
                    {
                        answer++;
                        cnt[i+1]--;
                    }
                }
            }
        }

       System.out.print(answer);
    }
    
}
