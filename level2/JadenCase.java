package level2;

public class JadenCase {

    //프로그래머스 문제풀이 level2 JadenCase 문자열 만들기
    public static void main(String[] args) {
        String s = "   s  ab ";
        String[] words = s.split(" ");
        StringBuilder buff = new StringBuilder();
        for(String str : words)
        {
            if(str.equals(""))
            {
                buff.append(" ");
                continue;
            }   
            else if(str.charAt(0) < 65 || str.charAt(0) > 123)
            {
                buff.append(str.toLowerCase());   
            }
            else
            {
                buff.append(str.substring(0,1).toUpperCase());
                buff.append(str.substring(1).toLowerCase());
            }
            buff.append(" ");
        }
        if(s.length() < buff.length())
            buff.delete(buff.length()-1, buff.length());
        else if(s.length() > buff.length())
            buff.append(" ");
        System.out.println(buff.toString()); 
    }
    
}
