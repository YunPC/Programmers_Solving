package level2;

public class PreviousSong {

    //프로그래머스 문제풀이 Level2 방금그곡

    public static void main(String[] args) {

        String[] musicinfos = {
            "12:00,12:05,HI,ABC#ABC",
            "13:00,13:05,WORLD,ABCDEF"
        };
        String m = "ABC";
        String answer = "(None)";
        int last_time = 0;
        for(String info : musicinfos)
        {
            
            String[] info_arr = info.split(",");
            String[] start_t = info_arr[0].split(":");
            String[] end_t = info_arr[1].split(":");
            int start_m = Integer.parseInt(start_t[0])*60 + Integer.parseInt(start_t[1]);
            int end_m = Integer.parseInt(end_t[0])*60 + Integer.parseInt(end_t[1]);
            int duration = end_m - start_m;
            
            
            String[] split_by_pound_arr = info_arr[3].split("#");
            int code_cnt = 1;
            for(String pound_str : split_by_pound_arr)
            {
                String[] codes = pound_str.split("");
                for(String code : codes)
                    code_cnt++;
            }
            code_cnt--;
            
            int repeat = duration/code_cnt;
            int song_end = duration%code_cnt;
            String song = "";
            for(int i = 0; i < repeat; i++)
            {
                song += info_arr[3];
            }
            
            char[] song_arr = info_arr[3].toCharArray();
            int song_idx = 0;
            for(int i = 0; i < song_arr.length; i++)
            {
                if(song_idx == song_end)
                    break;
                StringBuilder buff = new StringBuilder();
                buff.append(song_arr[i]);
                if((i < song_arr.length-1) && (song_arr[i+1] == '#'))
                    buff.append(song_arr[++i]);
                song += buff.toString();
                
                
                song_idx++;   
            }
            
            int idx = song.indexOf(m);
            
            if((last_time < duration) && (idx != -1))
            {
                while(idx != -1)
                {
                    if(song.length() > idx+m.length())
                    {
                        if(song.charAt(idx+m.length()) == '#')
                        {
                            idx = song.indexOf(m, idx+m.length());
                            continue;
                        }
                    } 
                    idx = song.indexOf(m, idx+m.length());
                    answer = info_arr[2];
                    last_time = duration;
                }
                
            }
            
        }

        System.out.println(answer);
    }
    
}
