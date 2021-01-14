
package level1;

public class IntegerRoot {

    //프로그래머스 문제풀이 level1 정수 제곱근 판별
    public static void main(String[] args)
    {
        long n = 121;
        long answer = 0;
        double fp;
        int ip;
        double root = Math.sqrt(n);
        ip = (int)root;
        fp = root - ip;
        if(fp > 0)
            answer = -1;
        else
            answer = (long)Math.pow(ip+1, 2);
        System.out.print(answer);
    }
    
}
