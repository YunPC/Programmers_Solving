import java.util.*;

public class FindPrimeNum
{
    //프로그래머스 문제풀이 level2 소수 찾기

    public static void main(String[] args) {
        String numbers = "17";
        Set<Integer> set = new HashSet<Integer>();
        StringBuilder buff = new StringBuilder();
        buff.append(numbers);
        for(int i = 1; i <= numbers.length(); i++)
        {
            findKDigitPrimeNum("", 0, set, i, buff);
        }
        System.out.println(set.size());

    }
    public static void findKDigitPrimeNum(String s, int size, Set<Integer> set, int k, StringBuilder buff)
    {
        if(size == k)
        {
            int n = Integer.parseInt(s);
            if(n <= 1)
                return;
            for(int i = 2; i <= Math.sqrt(n); i++)
            {
                if(n%i == 0)
                    return;
            }
            set.add(n);
        }
        else
        {
            
            for(int i = 0; i < buff.length(); i++)
            {
                StringBuilder str = new StringBuilder();
                char c = buff.charAt(i);
                str.append(s);
                str.append(c);
                findKDigitPrimeNum(str.toString(), size+1, set, k, buff.delete(i, i+1));
                str.delete(str.length()-1, str.length());
                buff.insert(i, c);
            }
        }
            
    }
}