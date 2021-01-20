package level2;

import java.util.HashMap;

public class Ponketmon {

    //프로그래머스 문제풀이 level2 폰켓몬
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3};
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums)
        {
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        if(map.size() < nums.length/2)
            answer = map.size();
        else
            answer = nums.length/2;

        System.out.println(answer);
    }
    
}
