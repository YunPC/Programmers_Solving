
package level1;

public class GetAverage {

    //프로그래머스 문제풀이 level1 평균 구하기
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4};
        double answer = 0;
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
            sum += arr[i];
        answer = (double)sum / (double)arr.length;
        System.out.print(answer);
    }
    
}
