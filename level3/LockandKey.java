import java.util.Arrays;

public class LockandKey {

    //프로그래머스 문제풀이 level3 자물쇠와 열쇠
    public static void main(String[] args) {
        int[][] key = {
            {0,0,0},
            {0,0,0},
            {0,0,0}
        };
        int[][] lock = {
            {1,1,1},
            {1,1,0},
            {1,0,1}
        };

        boolean answer = false;

        //get rotation
        int[][][] keys = new int[4][key.length][key.length];
        //make keys
        for(int i = 0; i < key.length; i++)
        {
            for(int j = 0; j < key.length; j++)
            {
                keys[0][i][j] = key[i][j];
                keys[1][i][j] = key[key.length-1-j][i];
                keys[2][i][j] = key[key.length-1-i][key.length-1-j];
                keys[3][i][j] = key[j][key.length-1-i];
            }
        }
        //count zero
        int zero = 0;
        for(int i = 0; i < lock.length; i++)
        {
            for(int j = 0; j < lock.length; j++)
            {
                if(lock[i][j] == 0)
                    zero++;
            }
        }

        //find match key
        int m = key.length;
        int n = lock.length;
        for(int i = 0; i < 4; i++) //4keys
        {
            for(int c = 0; c < m+n-1; c++)
            {
                for(int r = 0; r < m+n-1; r++)//right corner position
                {
                    //check if key is matched
                    boolean match = true;
                    int zero_cnt = zero;
                    for(int y = c-m+1; y <= c; y++)
                    {
                        for(int x = r-m+1; x <= r; x++)
                        {
                            if(y < 0 || x < 0 || y >= lock.length || x >= lock.length)
                                continue;
                            int v = keys[i][y-(c-m+1)][x-(r-m+1)];
                            if(v == 1 && lock[y][x] == 1)
                            {
                                match = false;
                                break;
                            }
                            else if(v == 1 && lock[y][x] == 0)
                                zero_cnt--;
                        }
                        if(!match)
                            break;
                    }
                    //if answer found
                    if(zero_cnt == 0)
                    {
                        answer = true;
                        break;
                    }
                        
                }
                if(answer)
                    break;
            }
            if(answer)
                break;
        }
        System.out.println(answer);
    }
    
}
