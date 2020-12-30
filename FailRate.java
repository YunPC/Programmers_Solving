import java.util.*;

public class FailRate {

    //프로그래머스 문제풀이 level1 실패율
    public static void main(String[] args)
    {
        int N = 4;
        int[] stages = {4, 4, 4, 4, 4};
        Integer[] answer = new Integer[N];
        int[] clear = new int[N+2];
        double[] fail_rate = new double[N+1];
        for(int stage : stages)
        {
            for(int i = 1; i < stage; i++)
                clear[i]++;
        }
        clear[0] = stages.length;
        for(int i = 1; i <= N; i++)
        {
            if(clear[i-1] == 0)
                fail_rate[i] = 0;
            else
                fail_rate[i] = (double)(clear[i-1]-clear[i]) / (double)clear[i-1];
        }
        for(int i = 1; i <= N; i++)
            answer[i-1] = i;
        Arrays.sort(answer, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                if(fail_rate[o1] < fail_rate[o2])
                    return 1;
                else if(fail_rate[o1] > fail_rate[o2])
                    return -1;
                else
                    return Integer.compare(o1, o2);
            }
        });
    }
    
}
