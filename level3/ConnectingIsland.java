import java.util.*;

class Island implements Comparable<Island>{
    int s;
    int e;
    int v;
    public Island(int s, int e, int v){
        super();
        this.s = s;
        this.e = e;
        this.v = v;
    }
    @Override
    public int compareTo(Island arg0)
    {
        return arg0.v >= this.v ? -1 : 1;
    }
}

public class ConnectingIsland {

    //프로그래머스 문제풀이 level3 섬 연결하기
    public static int[] parent;
    public static void main(String[] args) {
        int costs[][] = {
            {0, 1, 5},
            {1, 2, 3},
            {2, 3, 3},
            {3, 1, 2},
            {3, 0, 4},
            {2, 4, 6},
            {4, 0, 7}
        };
        int n = 5;

        int answer = 0;
        parent = new int[n];
        for(int i = 0; i < n; i++)
            parent[i] = i;

        
        List<Island> list = new ArrayList<>();
        for(int i = 0; i < costs.length; i++)
        {
            Island temp = new Island(costs[i][0], costs[i][1], costs[i][2]);
            list.add(temp);
        }
        Collections.sort(list);
        
        //matrix 만들기
        for(Island land : list)
        {
            if(find(land.e) == find(land.s))
                continue;
            union(land.e, land.s);
            answer += land.v;
        }

        System.out.println(answer);
    }
    public static int find(int a)
    {
        if(a == parent[a])
            return a;
        return parent[a] = find(parent[a]);
    }
    public static void union(int a, int b)
    {
        int a_root = (find(a));
        int b_root = (find(b));
        if(a_root != b_root)
            parent[a_root] = b;
    }
    
}
