public class PrimeNum {
    
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
