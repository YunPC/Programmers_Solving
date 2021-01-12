import java.util.*;

public class BiggestNum {
    
    //프로그래머스 문제풀이 level2 가장 큰 수
    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9};
        String[] arr = new String[numbers.length];
        int i = 0;
        for(int n : numbers)
        {
            arr[i++] = String.valueOf(n);
        }
        
        Arrays.sort(arr, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2)
            {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                Integer i1 = Integer.parseInt(s1);
                Integer i2 = Integer.parseInt(s2);
                
                return i2.compareTo(i1);
                
            }
        });
        StringBuilder buff = new StringBuilder();
        boolean isZero = true;
        for(String s : arr)
        {
            if(Integer.parseInt(s) != 0)
                isZero = false;
            if(!isZero)
                buff.append(s);
        }
        if(buff.length() == 0)
            buff.append("0");
            
        System.out.println(buff.toString());
    }
}
