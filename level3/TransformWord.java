import java.util.*;

public class TransformWord {
    
    //프로그래머스 level3 단어 변환
    public static int[][] matrix;
    public static void main(String[] args) {
        String begin = "hit";
        String target = "cog";
        String[] words = {"cog", "log", "lot", "dog", "dot", "hot"};

        List<String> list = new ArrayList<String>();

        list.add(begin);
        for(String s : words)
            list.add(s);

        matrix = new int[list.size()][list.size()];
        //매트릭스 만들자
        for(int i = 0; i < list.size(); i++)
        {
            for(int j = i+1; j < list.size(); j++)
            {
                if(canConnect(list.get(i), list.get(j)))
                {
                    matrix[i][j] = 1;
                    matrix[j][i] = 1;
                }
            }
        }

        //다익스트라 구현!
        final int inf = 1250;
        int[] distance  = new int[list.size()];
        boolean[] visited  = new boolean[list.size()];
        for(int i = 1; i < list.size(); i++)
            distance[i] = inf;

        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        while(!stack.empty())
        {
            int root = stack.pop();
            visited[root] = true;
            for(int i = 0; i < list.size(); i++)
            {
                if(matrix[root][i] == 1 && !visited[i])
                {
                    stack.push(i);
                    if(distance[i] > distance[root]+1)
                        distance[i] = distance[root]+1;
                }
            }
        }

        int index = list.indexOf(target);
        if(index == -1 || distance[index] == inf)
            System.out.println("false");
        else
            System.out.println(distance[index]);


    }
    public static boolean canConnect(String s1, String s2)
    {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        int wrong = 0;
        for(int i = 0; i < arr1.length; i++)
        {
            if(arr1[i] != arr2[i])
                ++wrong;
        }

        return wrong == 1 ? true : false;
    }
}
