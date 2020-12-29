public class SumBetweenTwoNum {   

    //프로그래머스 문제풀이 level1 두 정수 사이의 합
    public static void main(String[] args)
    {
        int a = 3, b = 5;
        long answer = Math.min(a,b);
        int min = Math.min(a,b)+1;
        int max = Math.max(a,b);
        while(min <= max)
        {
            answer += min++;
        }
        System.out.print(answer);
    }
}
