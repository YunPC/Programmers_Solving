package level2;

import java.util.*;

public class SkillTree {

    //프로그래머스 문제풀이 level2 스킬트리

    public static void main(String[] args)
    {
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        int answer = 0;
        boolean isAdd = true;
        HashMap<Character, Integer> map = new HashMap<>();
        char[] skill_arr = skill.toCharArray();
        int v = 0;
        for(char c : skill_arr)
        {
            map.put(c, v);
            v++;
        }
        for(String s : skill_trees)
        {
            int pre_v = -1;
            char[] skill_tree_arr = s.toCharArray();
            for(char c : skill_tree_arr)
            {
                int value = map.getOrDefault(c, -1);
                if(value != -1 && value - pre_v != 1)
                {
                    isAdd = false;
                    break;
                }
                else if(value != -1)
                    pre_v = value;
            }
            if(isAdd)
                answer++;
            isAdd = true;
        }
        System.out.print(answer);
    }
    
}
