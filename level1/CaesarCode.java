
package level1;

public class CaesarCode {
    
    //프로그래머스 문제풀이 level1 시저 암호
    public static void main(String[] args)
    {
        String s = "AB";
        int n = 1;
        StringBuffer buff = new StringBuffer();
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            int ascii = (int) c;
            if(ascii >= 65 && ascii <= 90)
            {
                ascii += n;
                if(ascii > 90)
                    ascii -= 26;
            }
            else if(ascii >= 97 && ascii <= 122)
            {
                ascii += n;
                if(ascii > 122)
                    ascii -= 26;
            }
            buff.append(String.valueOf((char) ascii));
        }
        String answer = buff.toString();
    }
}
