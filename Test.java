import java.util.*;

public class Test {

    public static void main(String[] args)
    {
        int[] answers = {1,2,3,4,5};
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] result = {0, 0, 0};
        int[] idx = {0, 0, 0};
        for(int ans : answers)
        {
            if(ans == student1[idx[0]])
                result[0]++;
            if(ans == student2[idx[1]])
                result[1]++;
            if(ans == student3[idx[2]])
                result[2]++;
            
            idx[0]++;
            idx[1]++;
            idx[2]++;
            
            idx[0] %= 5;
            idx[1] %= 8;
            idx[2] %= 10;
            
            
        }
        int max = 0;
        for(int cnt : result)
        {
            if(max < cnt)
                max = cnt;
        }
        Vector<Integer> v = new Vector<Integer>();
        for(int i = 0; i < 3; i++)
        {
            if(max == result[i])
                v.add(i);
                
        }
        int[] answer = new int[v.size()];
        for(int i = 0; i < v.size(); i++)
        {
            answer[i] = Integer.parseInt(v.get(i).toString()) + 1;
        }

    }
    
}
