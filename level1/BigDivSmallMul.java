
package level1;

public class BigDivSmallMul {

    //프로그래머스 문제 풀이 level1 최대공약수와 최소공배수
    public static void main(String[] args)
    {
        int n = 3, m = 12;
        int[] answer = new int[2];
        int min, max;
        min = Math.min(n, m);
        max = Math.max(n, m);
        int big_div = -2, small_mul = -2;
        for(int i = 1; i <= min; i++)
        {
            if(min%i == 0 && max%i == 0)
                big_div = i;
        }
        int temp = max;
        while(true)
        {
            if(temp % min == 0 && temp % max == 0)
            {
                small_mul = temp;
                break;
            }
            temp++;
        }
        answer[0] = big_div;
        answer[1] = small_mul;
    }
    
    
}
