public class KaKaoFriendColoringBook {
    
    //프로그래머스 문제풀이 level2 카카오프렌즈 컬러링북

    public static void main(String[] args)
    {
        int m = 6, n = 4;
        int[][] picture = {
            {1,1,1,0},
            {1,2,2,0},
            {1,0,0,1},
            {0,0,0,1},
            {0,0,0,3},
            {0,0,0,3}
        };
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        int[] answer = new int[2];
        boolean[][] visited = new boolean[m][n];
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j<n; j++)
            {
                if(visited[i][j] == false && picture[i][j] != 0)
                {
                    numberOfArea++;
                    maxSizeOfOneArea = Math.max(maxSizeOfOneArea, getRegion(visited, i, j, picture, 0, picture[i][j], m, n));
                }
            }
        }        
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;

    }
    public static int getRegion(boolean[][] visited, int r, int c, int[][] picture, int area, int c_id, int m, int n)
    {
        if(r == m || c == n || r < 0 || c < 0)
            return area;
        if(picture[r][c] != c_id)
            return area;
        else if(visited[r][c] == true)
            return area;
        else
        {
            visited[r][c] = true;
            area++;
            int left = getRegion(visited, r, c-1, picture, 0, c_id, m, n);
            int right = getRegion(visited, r, c+1, picture, 0, c_id, m, n);
            int up = getRegion(visited, r-1, c, picture, 0, c_id, m, n);
            int down = getRegion(visited, r+1, c, picture, 0, c_id, m, n);
            
            return area+left+right+up+down;
        }
    }
}
