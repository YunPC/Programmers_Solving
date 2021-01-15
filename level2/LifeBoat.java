package level2;

import java.util.Collections;
import java.util.PriorityQueue;

public class LifeBoat {

    //프로그래머스 문제풀이 level2 구명보트
    public static void main(String[] args) {
        int[] people = {70, 50, 80, 50};
        int limit = 100;
        int answer = 0;
        PriorityQueue<Integer> small = new PriorityQueue<>();
        PriorityQueue<Integer> big = new PriorityQueue<>(Collections.reverseOrder());
        for(int w : people)
        {
            if(w <= limit/2)
                small.add(w);
            else
                big.add(w);
        }
        while((!small.isEmpty()) && (!big.isEmpty()))
        {
            int s = small.peek();
            int b = big.peek();
            if(s+b > limit)
            {
                big.remove();
                answer++;
            }
            else
            {
                small.remove();
                big.remove();
                answer++;
            }
        }
        if(!small.isEmpty())
            answer += small.size() % 2 == 0 ? small.size()/2 : small.size()/2+1;
        else
            answer += big.size();

        System.out.println(answer);
    }
    
}
