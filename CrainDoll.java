import java.util.*;

//4, 7, 8, 9, 10, 11
public class CrainDoll {
    public static void main(String[] args) {
        int[][] board = {
            {0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}
        };
        int[] moves = {1,5,3,5,1,2,1,4};
        int answer = 0;
        int[] top = new int[board.length];
        Arrays.fill(top, 40);
        for(int c = 0; c < board.length; c++)
        {
            for(int r = 0; r < board.length; r++)
            {
                if(board[r][c] != 0)
                {
                    top[c] = r;
                    break;
                }
                    
            }
        }
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < moves.length; i++)
        {
            if(top[moves[i]-1] < board.length)
            {
                int doll = board[top[moves[i]-1]][moves[i]-1];
                if(stack.empty())
                    stack.push(doll);
                else if(stack.peek() == doll)
                {
                    stack.pop();
                    answer += 2;
                }
                else
                    stack.push(doll);
                
                top[moves[i]-1]++;
            }
        }
        System.out.println(answer);
    }
  }