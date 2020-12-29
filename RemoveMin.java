import java.util.*;

public class RemoveMin {
    
    //프로그래머스 문제풀이 level1 제일 작은 수 제거하기
    public static void main(String[] args)
    {
        int[] arr = {4,3,2,1};
        
        ArrayList<Integer> sorted_list = new ArrayList<Integer>();
        for(int n : arr)
            sorted_list.add(n);
        ArrayList<Integer> unsorted_list = new ArrayList<Integer>();
        unsorted_list = (ArrayList<Integer>)sorted_list.clone();
        Collections.sort(sorted_list);
        
        Integer min = sorted_list.get(0);
        unsorted_list.remove(min);
        
        int[] answer = new int[unsorted_list.size() == 0 ? 1 : unsorted_list.size()];
        if(answer.length == 1)
            answer[0] = -1;
        else
        {
            for(int i = 0; i < unsorted_list.size(); i++)
                answer[i] = Integer.parseInt(unsorted_list.get(i).toString());
        }
    }
}
