public class BriansMatter {

    //프로그래머스 level3 브라이언의 고민(실패)
    public static int[] alpha;
    public static void main(String[] args) {
    
        alpha = new int[26];

        //소문자 파악하기
        String sentence = "oBBoA";
        for(char c : sentence.toCharArray())
        {
            if(c >= 'a' && c <= 'z')
                alpha[c-'a']++;
        }

        //규칙 파악하기
        for(int i = 0; i < 26; i++)
        {
            //규칙 2이거나 모름
            if(alpha[i] == 2)
            {
                int fir = sentence.indexOf(String.valueOf((char)('a'+i)));
                int sec = sentence.lastIndexOf(String.valueOf((char)('a'+i)));
                //규칙 1과 2를 동시에 만족 할 수 있다.
                if(sec-fir <= 2)
                    alpha[i] = 3;
                else
                    alpha[i] = 2;                
            }
            //나머지는 무조건 규칙1
            else
                alpha[i] = 1;
        }

        String answer = ReturnString(sentence);
        if(answer.contains("invalid"))
            answer = "invalid";
        System.out.println(answer);
        
        
    }
    public static String ReturnString(String s)
    {
        if(s.equals(""))
            return "";
        if(s.equals(s.replaceAll("[a-z]", "")))
            return s;
        else
        {
            char sign = '1';
            for(char c : s.toCharArray())
            {
                if(c >= 'a' && c <= 'z')
                {
                    sign = c;
                    break;
                }
            }
            //규칙에 따라서 변화를 다르게 주자.
            String s1 = "";
            String s2 = "";
            String s3 = "";

            int start_idx = s.indexOf(sign);
            int idx = s.lastIndexOf(sign);

            if(alpha[sign-'a'] == 3)//이거 둘 다 돌려봐야함
            {
                alpha[sign-'a'] = 1;
                String answer1 = ReturnString(s);
                alpha[sign-'a'] = 2;
                String answer2 = ReturnString(s);
                if(answer1.contains("invalid"))
                    return answer2;
                else
                    return answer1;
            }
            else if(alpha[sign-'a'] == 1)
            {
                //규칙1인데 맨 앞이 소문자이면 안됨.
                if(s.charAt(0) >= 'a' && s.charAt(0) <= 'z')
                    return "invalid";
                //규칙1일때 문자열 쪼개기
                if(start_idx != 1)
                {
                    s1 = s.substring(0, start_idx-1);
                    s2 = s.substring(start_idx-1, idx+2);
                    s3 = s.substring(idx+2);
                }
                else
                {
                    s1 = s.substring(0, idx+2).replaceAll(String.valueOf(sign), "");
                    s2 = s.substring(idx+2);
                }
                
            }
            else if(alpha[sign-'a'] == 2)
            {              
                s1 = s.substring(0, start_idx+1).replaceAll(String.valueOf(sign), "");
                s2 = s.substring(start_idx+1, idx+1).replaceAll(String.valueOf(sign), "");
                s3 = s.substring(idx+1);

            }
            
            s1 = ReturnString(s1);
            s2 = ReturnString(s2);
            s3 = ReturnString(s3);
            
            StringBuilder buff = new StringBuilder();
            boolean flag = false;
            if(!s1.equals(""))
            {
                if(flag)
                    buff.append(" ");
                flag = true;
                buff.append(s1);
                
            }
            if(!s2.equals(""))
            {
                if(flag)
                    buff.append(" ");
                flag = true;
                buff.append(s2);
            }
            if(!s3.equals(""))
            {
                if(flag)
                    buff.append(" ");
                flag = true;
                buff.append(s3);
            }

            return buff.toString();
    
        }
    }
    
}
