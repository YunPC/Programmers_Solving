public class WaterMelon {

    //프로그래머스 문제풀이 level1 수박수
    public static void main(String[] args)
    {
        int n = 3;
        StringBuffer buff = new StringBuffer();
        for(int i = 0; i < n; i++)
        {
            if(i % 2 == 0)
                buff.append("수");
            else
                buff.append("박");
        }
        String answer = buff.toString();
        System.out.print(answer);
    }
    
}
