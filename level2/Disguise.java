package level2;

import java.util.HashMap;
import java.util.Iterator;

public class Disguise {

    //프로그래머스 문제풀이 level2 위장

    public static void main(String[] args) {
        int answer = 0;
        String[][] clothes =
        {
            {"yellow_hat", "headgear"},
            {"blue_sunglasses", "eyewear"},
            {"green_turban", "headgear"}
        };
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < clothes.length; i++)
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0)+1);
        
        int comb_max = map.size();
        int[] clothes_num = new int[comb_max];
        
        Iterator<String> keys = map.keySet().iterator();
        int idx = 0;
        while(keys.hasNext())
        {
            String key = keys.next();
            clothes_num[idx++] = map.get(key);
            
        }
        
        int comb_cnt = 1;
        while(comb_cnt <= comb_max)
        {
            answer += getCombNum(clothes_num, comb_cnt, 1, 0);
            comb_cnt++;
        }
        System.out.println(answer);
    }
    public static int getCombNum(int[] arr, int k, int n, int idx)
    {
        if(k == 0)
            return n;
        else
        {
            int total = 0; 
            for(int i = idx; i <= arr.length-k; i++)
            {
                total += getCombNum(arr, k-1, n*arr[i], i+1);
            }
            return total;
        }
    }
}
