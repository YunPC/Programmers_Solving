package level2;

public class QuadCompress {

    //프로그래머스 문제풀이 level2 쿼드압축 후 개수 세기
    public static void main(String[] args) {
        int[][] arr = {
            {1,1,0,0},
            {1,0,0,0},
            {1,0,0,1},
            {1,1,1,1}
        };
        int[] answer = new int[2];
        answer[0] = ReturnCnt(0, arr.length-1, 0, arr.length-1, arr, 0);
        answer[1] = ReturnCnt(0, arr.length-1, 0, arr.length-1, arr, 1);
    }
    public static int ReturnCnt(int start_r, int end_r, int start_c, int end_c, int[][] arr, int comp_num)
    {
        if(start_r == end_r)
            return arr[start_r][start_c] == comp_num ? 1 : 0;
        else
        {
            boolean canCompress = true;
            for(int r = start_r; r <= end_r; r++)
            {
                for(int c = start_c; c <= end_c; c++)
                {
                    if(arr[r][c] != comp_num)
                        canCompress = false;
                }
            }
            if(canCompress)
                return 1;
            
            int middle_r = (end_r-start_r)/2 + start_r;
            int middle_c = (end_c-start_c)/2 + start_c;
            int first = 0, sec = 0, third = 0, fourth = 0;
            first += ReturnCnt(start_r, middle_r, start_c, middle_c, arr, comp_num);
            sec += ReturnCnt(start_r, middle_r, middle_c+1, end_c, arr, comp_num);
            third += ReturnCnt(middle_r+1, end_r, start_c, middle_c, arr, comp_num);
            fourth += ReturnCnt(middle_r+1, end_r, middle_c+1, end_c, arr, comp_num);
            
            return first+sec+third+fourth;
            
            
            
        }    
        
    }
    
}
