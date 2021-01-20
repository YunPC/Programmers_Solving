package level2;

public class MatrixMultiply {

    //프로그래머스 문제풀이 level2 행렬의 곱셈
    public static void main(String[] args) {
        int[][] arr1 = {
            {1, 4},
            {3, 2},
            {4, 1}
        };
        int[][] arr2 = {
            {3, 3},
            {3, 3}
        };
        int[][] answer = new int[arr1.length][arr2[0].length];
        for(int r = 0; r < arr1.length; r++)
        {
            for(int c = 0; c < arr2[0].length; c++)
            {
                
                int temp = 0;
                
                for(int idx = 0; idx < arr1[0].length; idx++)
                    temp += arr1[r][idx] * arr2[idx][c]; 
                
                answer[r][c] = temp;
            }
        }
    }
    
}
