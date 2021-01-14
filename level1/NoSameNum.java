
package level1;

import java.util.ArrayDeque;
import java.util.Deque;

public class NoSameNum {

    //프로그래머스 문제풀이 level1 같은 숫자는 싫어
    public static void main(String[] args)
    {
        int[] arr = {1,1,3,3,0,1,1};
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(arr[0]);
        for(int i = 1; i < arr.length; i++)
        {
            if(Integer.parseInt(dq.getLast().toString()) != arr[i])
                dq.add(arr[i]);
        }
        int[] answer = new int[dq.size()];
        int j = 0;
        while(dq.size() != 0)
        {
           answer[j++] = Integer.parseInt(dq.poll().toString());
        }
    }
    
}
