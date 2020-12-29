public class StrtoInt {

    public static void main(String[] args)
    {
        String s = "1234";
        int answer = 0;
        if(s.charAt(0) == '+')
            answer = Integer.parseInt(s.substring(1));
        if(s.charAt(0) == '-')
            answer = Integer.parseInt(s.substring(1)) * (-1);
        else
            answer = Integer.parseInt(s);
    }
    
}
