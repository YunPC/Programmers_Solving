
package level2;

public class StringCompress {

    //프로그래머스 문제풀이 level2 문자열 압축

    public static void main(String[] args)
    {
        String s = "aabbcc";
        StringBuffer buff = new StringBuffer();
        int answer = 2000;
        int cnt = 1;
        if(s.length() == 1)
            answer = 1;
        for(int cut = 1; cut <= s.length()/2; cut++)
        {
            String key = s.substring(0, cut);
            buff.delete(0, buff.length());
            cnt = 1;
            for(int i = cut; i < s.length(); i += cut)
            {
                if(i + cut > s.length())
                {
                    if(cnt > 1)
                        buff.append(cnt);
                    buff.append(key);
                    buff.append(s.substring(i, s.length()));
                    break;
                }

                else if(key.equals(s.substring(i, i+cut)))
                {
                    cnt++;
                    if(i == s.length()-1 || i+cut == s.length())
                    {
                        buff.append(String.valueOf(cnt));
                        buff.append(key);
                    }
                }

                else
                {
                    if(cnt > 1)
                        buff.append(String.valueOf(cnt));
                    buff.append(key);
                    if(i + cut >= s.length())
                    {
                        buff.append(s.substring(i, s.length()));
                        break;
                    }
                    key = s.substring(i, i+cut);
                    cnt = 1;
                }
            }
            String str = buff.toString();
            answer = Math.min(answer, str.length());
        }
        System.out.println(answer);
    }
    
}
