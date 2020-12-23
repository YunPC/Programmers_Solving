import java.util.*;

public class NotCompletePlayer {

    public static void main(String[] args)
    {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        String answer = "";
        PriorityQueue<String> pq = new PriorityQueue<>();
        PriorityQueue<String> comp = new PriorityQueue<>();
        for(int i = 0; i < participant.length; i++)
        {
            pq.add(participant[i]);
        }
        for(int i = 0; i < completion.length; i++)
        {
            comp.add(completion[i]);
        }
        
        for(int i = 0; i < completion.length; i++)
        {
            String name1 = pq.poll();
            String name2 = comp.poll();
            if(!name1.equals(name2))
            {
                answer = name1;
                break;
            }
        }
        if(answer.equals(""))
            answer = pq.poll();

        System.out.println(answer);
    }
    
}
