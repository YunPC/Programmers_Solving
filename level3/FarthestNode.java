import java.util.*;

public class FarthestNode {

    //프로그래머스 level3 가장 먼 노드
    public static void main(String[] args) {
        int n = 6;
        int[][] edge = {
            {3, 6},
            {4, 3},
            {3, 2},
            {1, 3},
            {1, 2},
            {2, 4},
            {5, 2}
        };

        //adjacency list
        ArrayList<ArrayList<Integer>> adj_list = new ArrayList<ArrayList<Integer>>(n+1);
        for(int i = 0; i <= n; i++)
            adj_list.add(new ArrayList<Integer>());
        
        for(int i = 0; i < edge.length; i++)
        {
            adj_list.get(edge[i][0]).add(edge[i][1]);
            adj_list.get(edge[i][1]).add(edge[i][0]);
        }

        //bfs
        int[] distance = new int[n+1];
        boolean[] visited = new boolean[n+1];

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        while(!q.isEmpty())
        {
            int root = q.poll();
            visited[root] = true;
            int depth = distance[root]+1;
            for(int i : adj_list.get(root))
            {
                if(!visited[i])
                {
                    distance[i] = depth;
                    visited[i] = true;
                    q.add(i);
                    
                }
            }

        }

        int max = 0;
        for(int i = 1; i < distance.length; i++)
            max = Math.max(max, distance[i]);
        int answer = 0;
        for(int i = 1; i < distance.length; i++)
            answer = distance[i] == max ? answer+1 : answer;

        System.out.println(answer);


    }
    
}
