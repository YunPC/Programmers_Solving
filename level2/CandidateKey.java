package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CandidateKey {

    //프로그래머스 문제풀이 level2 후보키
    public static String[][] table;
    public static int answer;
    public static HashMap<String, Integer> map = new HashMap<>();
    public static ArrayList<String> keys = new ArrayList<>();
    public static void main(String[] args) {
        String[][] relation = {
            {"b","2","a","a","b"},
            {"b","2","7","1","b"},
            {"1","0","a","a","8"},
            {"7","5","a","a","9"},
            {"3","0","a","f","9"}
        };
        answer = 0;
        table = new String[relation.length][relation[0].length];
        
        for(int i = 0; i < relation.length; i++)
        {
            for(int j = 0; j < relation[0].length; j++)
                table[i][j] = relation[i][j];
        }
        
        int k = 1;
        String idx = "";
        while(k <= relation[0].length)
            ReturnIndex(0, k++, idx, -1);
        
        System.out.println(answer);
    }
    public static void ReturnIndex(int size, int k, String idx, int start_idx)
    {
        if(size == k)
        {
            for(int i = 0; i < table.length; i++)
            {
                String[] arr = idx.split("");
                StringBuilder buff = new StringBuilder();
                for(String s : arr)
                {
                    buff.append(table[i][Integer.parseInt(s)]);
                    buff.append(" ");
                }
                if(map.getOrDefault(buff.toString(), 0) != 0)
                {
                    map.clear();
                    return;
                }
                map.put(buff.toString(), 1);
            }
            for(String s : keys)
            {
                char[] key = s.toCharArray();
                char[] idx_arr = idx.toCharArray();
                Arrays.sort(key);
                Arrays.sort(idx_arr);
                int k_i = 0;
                for(int i = 0; i < idx_arr.length; i++)
                {
                    if(key[k_i] == idx_arr[i])
                    {
                        k_i++;
                    }
                    if(k_i == key.length)
                        return;
                }
            }
            answer++;
            keys.add(idx);
            map.clear();
        }
        else
        {
            for(int i = start_idx+1; i < table[0].length; i++)
            {
                ReturnIndex(size+1, k, idx+String.valueOf(i), i);
            }
        }
        
    }
    
}
