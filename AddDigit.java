public class AddDigit {

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
