
package level1;

import java.util.ArrayList;
import java.util.Collections;

public class Mod0Arr {

    //프로그래머스 문제풀이 level1 나누어 떨어지는 수

    public static void main(String[] args)
    {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : arr)
        {
            if(num%divisor == 0)
                list.add(num);
        }
        if(list.size() == 0)
        {
            int[] answer = {-1};
        }
        else
        {
            Collections.sort(list);
            int[] answer = new int[list.size()];
            for(int i = 0; i < list.size(); i++)
                answer[i] = Integer.parseInt(list.get(i).toString());
        }
    }
    
}
