
package level1;

public class DotProduct {

    //프로그래머스 문제풀이 level1 내적

    public static void main(String[] args)
    {
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};

        int answer = 0;
        for(int i = 0; i < a.length; i++)
            answer += a[i]*b[i];
        System.out.print(answer);
    }

}
