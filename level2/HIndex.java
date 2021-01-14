package level2;

import java.util.*;

public class HIndex {

    //프로그래머스 문제풀이 level2 H-Index

    public static void main(String[] args) {
        int[] citations = {22, 42};
        int answer = 0;
        Arrays.sort(citations);
        for(int i = citations.length-1; i >= 0; i--)
        {
            if(citations.length-i >= citations[i])
            {
                answer = citations.length-i-1;
                break;
            }
        }
        if(citations[0] > citations.length)
            answer = citations.length;
        System.out.println(answer);

    }
    
}
