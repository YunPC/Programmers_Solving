public class MakeStrangeStr {

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
