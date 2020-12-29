public class PrimeNum {

    //프로그래머스 문제풀이 level1 소수 찾기
    
    public static void main(String[] args)
    {
        int n = 10;
        int answer = 0;
        boolean add = true;
        for(int i = 2; i <= n; i++)
        {
            add = true;
            for(int j = 2; j <= Math.sqrt(i); j++)
            {
                if(i%j==0)
                {
                    add = false;
                    break;
                } 
            }
            if(add)
                answer++;
                
        }
    }
}
