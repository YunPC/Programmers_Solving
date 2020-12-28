import java.util.*;

public class NoSameNum {

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
