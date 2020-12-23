import java.util.*;

public class KthNum {
    
    public static void main(String[] args)
    {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {
            {2, 5, 3},
            {4, 4, 1},
            {1, 7, 3}
        };
        ArrayList<Integer> num = new ArrayList<Integer>();
        for(int i = 0; i < commands.length; i++)
        {
            int[] subarr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(subarr);
            num.add(subarr[commands[i][2]-1]);
        }
        int[] answer = new int[num.size()];
        for(int i = 0; i < num.size(); i++)
        {
            answer[i] = Integer.parseInt(num.get(i).toString());
            //System.out.print(answer[i]);
        }
    }

}
