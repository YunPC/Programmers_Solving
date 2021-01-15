package level2;

public class TargetNumber {

    //프로그래머스 문제풀이 level2 타겟 넘버
    
    public static void main(String[] args) {
        int[] numbers = {1,1,1,1,1};
        int target = 3;
        int answer = 0;
        answer = ReturnAnswer(numbers, 0, target, 0);
        System.out.println(answer);
    }
    public static int ReturnAnswer(int[] numbers, int n, int target, int idx)
    {
        if(n == target)
            return 1;
        else
        {
            if(idx == numbers.length)
                return 0;
            else
            {
                int plus = 0, minus = 0;
                plus += ReturnAnswer(numbers, n+numbers[idx], target, idx+1);
                minus += ReturnAnswer(numbers, n-numbers[idx], target, idx+1);
                return plus+minus;
            }
        }
    }
    
}
