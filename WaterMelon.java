public class WaterMelon {

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
