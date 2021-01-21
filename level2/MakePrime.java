package level2;

public class MakePrime {

    //프로그래머스 문제풀이 level2 소수 만들기
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int answer = ReturnPrimeCnt(nums, 0, 0, 3);
    }
    public static int ReturnPrimeCnt(int[] nums, int idx, int sum, int cnt)
    {
        if(cnt == 0)
        {
            for(int i = 2; i <= Math.sqrt(sum); i++)
            {
                if(sum % i == 0)
                    return 0;
            }
            return 1;
        }
        else
        {
            int res = 0;
            for(int i = idx; i <= nums.length-cnt; i++)
            {
                res += ReturnPrimeCnt(nums, i+1, sum+nums[i], cnt-1);
            }
            return res;
        }
    }
}
