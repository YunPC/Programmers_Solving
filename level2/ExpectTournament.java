package level2;

public class ExpectTournament {

    //프로그래머스 문제풀이 Level2 예상 대진표
    public static void main(String[] args) {
        int n = 8, a = 4, b = 7;
        boolean flag = false;
        int total_round = Integer.toBinaryString(n).length()-1;
        int l = Math.min(a,b);
        int r = Math.max(a,b);
        int answer = total_round;
        int size = 2;
        for(int i = 1; i <= total_round; i++)
        {
            
            for(int j = 1; j <= n; j+=size)
            {
                if(j <= l && r <= j+(size-1))
                {
                    answer = i;
                    flag = true;
                    break;
                }
            }
            if(flag)
                break;
            size *= 2;
        }
        System.out.println(answer);
    }
}
