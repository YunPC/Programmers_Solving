import java.util.*;

public class Immigration {

    //프로그래머스 문제풀이 level3 입국심사
    public static void main(String[] args) {
        int n = 6;
        int[] times = {7, 10};

        Arrays.sort(times);
        System.out.println(BinarySearch(times, n, times[times.length-1]));
    }
    public static long BinarySearch(int[] times, int n, long max)
    {
        long l = 1, r = max * n;
        long mid = 0;
        long ans = Long.MAX_VALUE;
        while(l < r)
        {
            mid = (l+r)/2;
            if(isPassed(times, n, mid))
            {
                ans = Math.min(ans, mid);
                r = mid-1;
            }
            else
                l = mid+1;
        }
        return ans;
    }

    public static boolean isPassed(int[] times, int n, long mid)
    {
        int amount = 0;

        for(int i = 0; i < times.length; i++)
            amount +=  mid / times[i];

        if(amount >= n)
            return true;
        return false;
            
    }
    
}
