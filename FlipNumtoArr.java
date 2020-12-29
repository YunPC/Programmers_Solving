import java.util.*;

public class FlipNumtoArr {

    //프로그래머스 문제풀이 level1 자연수 뒤집어 배열로 만들기
    public static void main(String[] args)
    {
        int n = 12345;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(n > 0)
        {
            long r = n%10;
            list.add((int)r);
            n /= 10;
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
        {
            answer[i] = Integer.parseInt(list.get(i).toString());
        }
    }
    
}
