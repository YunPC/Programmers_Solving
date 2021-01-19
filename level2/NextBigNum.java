package level2;

public class NextBigNum {

    //프로그래머스 문제풀이 level2 다음 큰 숫자

    public static void main(String[] args) {
        int n = 78;
        int answer = n;
        int one = 0, t_one = 0;
        String binary = Integer.toBinaryString(n);
        char[] arr = binary.toCharArray();
        for(char c : arr)
        {
            if(c == '1')
                one++;
        }
        while(one != t_one)
        {
            answer++;
            t_one = 0;
            String temp = Integer.toBinaryString(answer);
            char[] t_arr = temp.toCharArray();
            for(char c : t_arr)
            {
                if(c == '1')
                    t_one++;
            }
        }
        System.out.println(answer);
    }
    
}
