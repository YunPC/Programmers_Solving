import java.util.*;

public class DoublePriorityQueue {

    //프로그래머스 문제풀이 level3 이중 우선순위 큐
    public static PriorityQueue<Integer> big;
    public static PriorityQueue<Integer> small;
    public static HashMap<Integer, Integer> big_map;
    public static HashMap<Integer, Integer> small_map;
    public static void main(String[] args) {
        String[] operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};

        big = new PriorityQueue<Integer>(Collections.reverseOrder());
        small = new PriorityQueue<Integer>();

        big_map = new HashMap<>();
        small_map = new HashMap<>();


        for(String s : operations)
        {
            if(s.equals("D 1") && !big.isEmpty())
            {
                int big_i = big.peek();
                big_map.put(big_i, big_map.getOrDefault(big_i, 0)+1);
                big.poll();

                
            }
            else if(s.equals("D -1") && !small.isEmpty())
            {
                int small_i = small.peek();
                small_map.put(small_i, small_map.getOrDefault(small_i, 0)+1);
                small.poll();

            }
            else if(s.contains("I"))
            {
                int i = Integer.parseInt(s.substring(1).trim());
                big.add(i);
                small.add(i);
            }
            synchroize();
        }
        if(big.isEmpty())
            System.out.println(0);
        else
            System.out.println(big.peek());

        if(small.isEmpty())
            System.out.println(0);
        else
            System.out.println(small.peek());

    }
    public static void synchroize()
    {
  
        while(big_map.getOrDefault(big.peek(), 0) < small_map.getOrDefault(big.peek(), 0)
        && !big.isEmpty())
        {
            int big_i = big.peek();
            big_map.put(big_i, big_map.getOrDefault(big_i, 0)+1);
            big.poll();
        }
  
        while(big_map.getOrDefault(small.peek(), 0) > small_map.getOrDefault(small.peek(), 0)
        && !small.isEmpty())
        {
            int small_i = small.peek();
            small_map.put(small_i, small_map.getOrDefault(small_i, 0)+1);
            small.poll();
        }
    }
    
}
