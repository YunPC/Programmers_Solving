import java.util.*;

public class PickTwoSum {

    //프로그래머스 문제풀이 level1 두 수의 합 구하기

    public static void main(String[] args)
    {
        int[] numbers = {2, 1, 3, 4, 1};

        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < numbers.length; i++)
        {
            for(int j = i+1; j < numbers.length; j++)
            {
                set.add(numbers[i]+numbers[j]);
            }
        }
        
        List<Integer> list = new ArrayList<>(set);
        list.sort(null);
        Integer arr[] = new Integer[list.size()];
        arr = list.toArray(arr);
        int[] answer = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
        {
            answer[i] = Integer.parseInt(arr[i].toString());
        }

        

    }
    
}
