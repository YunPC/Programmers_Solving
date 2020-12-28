public class SumBetweenTwoNum {   
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
