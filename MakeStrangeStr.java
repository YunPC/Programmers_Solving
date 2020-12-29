public class MakeStrangeStr {

    //프로그래머스 level1 이상한 문자 만들기
    public static void main(String[] args)
    {
        String s = "try hello world";
        StringBuffer buff = new StringBuffer();
        int j = 0;
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            String st = Character.toString(c);
            if(st.equals(" "))
                j = 0;
            if (c >='A' && c <= 'Z' || c >= 'a' && c <= 'z')
            {
                if(j%2 == 0)
                    st = st.toUpperCase();
                else
                    st = st.toLowerCase();
                j++;
            }
            buff.append(st);
            
        }
        String answer = buff.toString();
        System.out.print(answer);
    }
    
}
