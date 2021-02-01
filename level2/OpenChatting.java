package level2;

import java.util.ArrayList;
import java.util.HashMap;

public class OpenChatting {

    //프로그래머스 문제풀이 level2 오픈채팅방
    public static void main(String[] args) {

        String[] record = {
            "Enter uid1234 Muzi",
            "Enter uid4567 Prodo",
            "Leave uid1234",
            "Enter uid1234 Prodo",
            "Change uid4567 Ryan"};
        ArrayList<String> answer = new ArrayList<String>();
        HashMap<String, String> map = new HashMap<>();
        
     
        for(String s : record)
        {
            String[] arr = s.split(" ");
            if(!arr[0].equals("Leave"))
                map.put(arr[1], arr[2]);
        }
        
    
        for(String s : record)
        {
            String[] arr = s.split(" ");
            
            StringBuilder buff = new StringBuilder();
            if(!arr[0].equals("Change"))
            {
                buff.append(map.get(arr[1]));
            
                if(arr[0].equals("Enter"))
                    buff.append("님이 들어왔습니다.");

                else if(arr[0].equals("Leave"))
                    buff.append("님이 나갔습니다.");

                answer.add(buff.toString());
            }
            
        }
    }
    
}
