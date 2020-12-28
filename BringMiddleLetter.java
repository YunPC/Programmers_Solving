public class BringMiddleLetter {

    public static void main(String[] args)
    {
        String s = "power";
        String answer = "";
        int l = s.length();
        if(l%2 == 1)
        {
            answer = String.valueOf(s.charAt(l/2));
        }
        else
        {
            answer = String.valueOf(s.charAt((l/2)-1)) + String.valueOf(s.charAt(l/2));
        }
        System.out.print(answer);
    }
    
}
