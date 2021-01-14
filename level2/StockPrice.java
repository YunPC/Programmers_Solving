package level2;

import java.util.*;

public class StockPrice {

    //프로그래머스 문제풀이 level2 주식가격

    public static void main(String[] args)
    {
        int[] prices = {1, 2, 3, 2, 3};

        int[] answer = new int[prices.length];
        int n = prices.length;
        for(int i = 0; i < n-1; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                if(prices[i] > prices[j])
                {
                    answer[i] = j-i;
                    break;
                }
            }
            if(answer[i] == 0)
                answer[i] = prices.length-(i+1);
        }
    }
    
}
