public class IntegerTriangle {

    //프로그래머스 문제풀이 level3 정수 삼각형
    public static void main(String[] args) {
        int[][] triangle = {
            {7},
            {3,8},
            {8,1,0},
            {2,7,4,4},
            {4,5,2,6,5}
        };

        int answer = 0;
        int[][] sum = new int[triangle.length][triangle.length];
        int len = 2;
        
        if(triangle.length == 1)
            System.out.println(triangle[0][0]);
        
        sum[0][0] = triangle[0][0];
        for(int i = 1; i < triangle.length; i++)
        {
            sum[i][0] = triangle[i][0] + sum[i-1][0];
            sum[i][len-1] = triangle[i][len-1] + sum[i-1][len-2];
            for(int j = 1; j < len-1; j++)
            {
                int max = Math.max(sum[i-1][j-1], sum[i-1][j]);
                sum[i][j] = max + triangle[i][j];
            }
            len++;
        }
        len--;
        for(int i = 0; i < len; i++)
            answer = Math.max(answer, sum[triangle.length-1][i]);
        System.out.println(answer);
    }
    
}
