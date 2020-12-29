public class AddDigit {

    //프로그래머스 문제 풀이 level1 자릿수 더하기
    public static void main(String[] args)
    {   
        int n = 123;
        int answer = 0;
        String num = Integer.toString(n);
        char[] n_arr = num.toCharArray();
        for(char c : n_arr)
        {
            int temp = Integer.parseInt(String.valueOf(c));
            answer += temp;
        }
        System.out.print(answer);
    }
    
}
