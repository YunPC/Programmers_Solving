package level2;
public class Country124Num {

    //프로그래머스 문제풀이 level2 124 나라의 숫자

    public static void main(String[] args)
    {
        int n = 6;
        StringBuilder buff = new StringBuilder();
        while(n > 0)
        {
            int r = n % 3;
            n/=3;
            buff.append(String.valueOf(r));
        }
        char[] arr = buff.reverse().toString().toCharArray();
        for(int i = arr.length-1; i >= 0; i--)
        {
            if(arr[i] == '0')
            {
                int p = i;
                for(int j = i; j >=0; j--)
                {
                    if(arr[j] != '0')
                    {
                        p = j;
                        break;
                    }
                }
                if(p != i)
                {
                    for(int k = p; k < i; k++)
                    {
                        int pre_num = Integer.parseInt(String.valueOf(arr[k]));
                        char pre_char = Character.forDigit(pre_num-1, 10);
                        arr[k] = pre_char;
                        
                        int aft_num = Integer.parseInt(String.valueOf(arr[k+1]));
                        char aft_char = Character.forDigit(aft_num+3, 10);
                        arr[k+1] = aft_char;
                        
                    }
                }
            }
        }
        int start_idx = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != '0')
            {
                start_idx = i;
                break;
            }
                
        }
        for(int i = start_idx; i < arr.length; i++)
        {
            if(arr[i] == '3')
                arr[i] = '4';
        }
        String answer = new String(arr);
        answer = answer.substring(start_idx, arr.length);

        System.out.println(answer);
    }
    
}
