import java.util.ArrayList;
import java.util.HashMap;

public class Compress {

    //프로그래머스 문제풀이 level2 압축
    public static void main(String[] args) {
        String msg = "KAKAO";
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < 26; i++)
            map.put(String.valueOf((char)('A'+i)), i+1);
        
        int w = 0;
        int c = 1;
        boolean flag = false;
        while(c <= msg.length())
        {
            int value = map.getOrDefault(msg.substring(w,c), 0);
            while(value != 0)
            {      
                c++;
                if(c > msg.length())
                {
                    flag = true;
                    break; 
                }
                   
                value = map.getOrDefault(msg.substring(w,c), 0);
                
            }
            answer.add(map.get(msg.substring(w, c-1)));
            if(flag)
                c--;
            map.put(msg.substring(w, c), map.size()+1);
            w = c-1;
            if(flag)
                break;
            
        }
    }
    
}
