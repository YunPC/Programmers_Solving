import java.util.*;

public class Printer {
    
    //프로그래머스 문제풀이 level2 프린터

    public static void main(String[] args)
    {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        int answer = 0;
        ArrayList<Integer> papers = new ArrayList<>();
        int order = 1;
        boolean isFirst;
        for(int i = 0; i < priorities.length; i++)
            papers.add(i);
        while(papers.size() != 0)
        {
            isFirst = true;
            int idx = papers.get(0);
            
            for(int i = 1; i < papers.size(); i++)
            {
                if(priorities[papers.get(i)] > priorities[idx])
                {
                    papers.remove(0);
                    papers.add(idx);
                    isFirst = false;
                    break;
                }
            }
            if(isFirst)
            {
                if(idx == location)
                {
                    answer = order;
                    break;
                }
                else
                {
                    papers.remove(0);
                }
                order++;
            }
                
        }
        System.out.print(answer);
    }
    
}
