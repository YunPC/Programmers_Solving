public class HandleStr {

    public static void main(String[] args)
    {
        String s = "a234";
        boolean answer = false;
        if(s.length() == 4 || s.length() == 6)
        {
            answer = true;
            for(int i = 0; i < s.length(); i++)
            {
                char c = s.charAt(i);
                int ascii = (int)c;
                if(c > 57 || c < 48)
                    answer = false;
            }
                
        }
    }
    
}
