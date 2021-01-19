package level2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Tuple {

    //프로그래머스 문제풀이 level2 튜플

    public static void main(String[] args) {
        String s = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
        String[] arr = s.split("}");
        Arrays.sort(arr, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2)
            {
                if(o1.length() < o2.length())
                    return -1;
                else
                    return 1;
            }
        });
        Set<String> set = new LinkedHashSet<String>();
        for(String str : arr)
        {
            str = str.replace("{", "");
            String[] temp = str.split(",");
            for(String num : temp)
            {
                try{
                    Integer.parseInt(num);
                } catch (NumberFormatException e){
                    continue;
                }
                set.add(num);
            }
        }
        
    }
}
