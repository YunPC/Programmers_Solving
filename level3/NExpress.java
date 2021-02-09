public class NExpress {

    //프로그래머스 문제풀이 level3 n으로 표현
    static int answer = -1;
    public static void main(String[] args) {
        int N = 4, number = 17;

        ReturnMin(0, 0, number, N);
        System.out.println(answer);
    }
    public static void ReturnMin(int res, int cnt, int number, int N)
    {
        int temp = N;
        if(cnt > 8)
            answer = -1;
        if(res == number)
        {
            if(answer == -1 || answer > cnt)
                answer = cnt;
        }
        else
        {
            for(int i = 0; i < 8-cnt; i++)
            {
                ReturnMin(res+temp, cnt+i+1, number, N);
                ReturnMin(res-temp, cnt+i+1, number, N);
                ReturnMin(res*temp, cnt+i+1, number, N);
                ReturnMin(res/temp, cnt+i+1, number, N);

                temp = temp*10+N;
            }
    
        }
    }
    
}
