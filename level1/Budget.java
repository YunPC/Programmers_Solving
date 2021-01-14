
package level1;

import java.util.Arrays;

public class Budget {
    
    //프로그래머스 문제풀이 level1 예산
    public static void main(String[] args)
    {
        int[] d = {1,3,2,5,4};
        int budget = 9;
        int answer = 0;
        Arrays.sort(d);
        for(int money : d)
        {
            budget -= money;
            if(budget < 0)
                break;
            answer++;
        }
        System.out.print(answer);
    }
}
