package level2;

public class MaxMin {

    //프로그래머스 문제풀이 level2 최댓값과 최솟값
    public static void main(String[] args) {
        String s = "1 2 3 4";
        String[] arr = s.split(" ");
        int max = -2000000000;
        int min = 2000000000;
        for(String str : arr)
        {
            int i = Integer.parseInt(str);
            if(i > max)
                max = i;
            if(min > i)
                min = i;
        }
        StringBuilder buff = new StringBuilder();
        buff.append(min);
        buff.append(" ");
        buff.append(max);

        System.out.println(buff.toString());
    }
    
}
