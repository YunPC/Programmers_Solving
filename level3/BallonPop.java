import java.util.ArrayList;

public class BallonPop {

    //프로그래머스 문제풀이 level3 풍선 터트리기

    public static void main(String[] args) {
        int[] a = {9,1,5};
        int[] left = new int[a.length];
        int[] right = new int[a.length];
        
        left[0] = a[0];
        right[a.length-1] = a[a.length-1];

        //left중에 최소값을 찾자
        for(int i = 1; i < a.length; i++)
            left[i] = left[i-1] > a[i] ? a[i] : left[i-1];

        //right중에 최소값을 찾자
        for(int i = a.length-2; i >= 0; i--)
            right[i] = right[i+1] > a[i] ? a[i] : right[i+1];
        
        int answer = 0;
        //only one max!
        for(int i = 0; i < a.length; i++)
            answer = (left[i] < a[i]) && (right[i] < a[i]) ? answer : answer+1;
        
        System.out.println(answer);
    }
    
}
