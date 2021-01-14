
package level1;

public class CollatzGuess {

    //프로그래머스 문제풀이 level1 콜라스 추측
    public static void main(String[] args)
    {
        int num = 6;
        int answer = 0;
        int cnt = 0;
        long ll = num;
        while(cnt <= 500)
        {
            if(ll == 1)
                break;
            else if(ll % 2 == 0)
                ll /= 2;
            else
                ll = ll*3+1;
            cnt++;
        }
        if(cnt <= 500)
            answer = cnt;
        else
            answer = -1;

        System.out.print(answer);

    }
    
}
