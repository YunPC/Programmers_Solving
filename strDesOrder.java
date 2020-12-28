import java.util.*;

public class strDesOrder {

    public static void main(String[] args)
    {
        String s = "Zbcdefg";
        char[] arr = new char[s.length()];
        for(int i = 0; i < s.length(); i++)
        {
            arr[i] = s.charAt(i);
        }
        Arrays.sort(arr);
        String answer = new StringBuilder(new String(arr)).reverse().toString();
    }
    
}
