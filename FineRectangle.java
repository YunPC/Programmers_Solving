public class FineRectangle {

    //프로그래머스 문제풀이 level2 멀쩡한 사각형
    
    public static void main(String[] args)
    {
        int w = 8;
        int h = 12;

        long answer = 0;
        double a = h*(-1)/(double)w;
        int b = h;
        
        for(int i = 1; i < h; i++)
        {
            double x = (i-b)/a;
            answer += (long)x;
        }
        answer *= 2;

        System.out.print(answer);
    }
    
}
