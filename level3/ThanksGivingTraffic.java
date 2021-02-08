import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ThanksGivingTraffic {

    //프로그래머스 문제풀이 Level3 추석 트래픽

    public static final int START = 0;
    public static final int END = 1;

    public class Time{
        int ms;
        int state;
    
        public Time(int t, int s){
            this.ms = t;
            this.state = s;
        }
    }
    
    public static void main(String[] args) {
        String[] lines = {"2016-09-15 01:00:04.002 2.0s", "2016-09-15 01:00:07.000 2s"};
        List<Time> times = new ArrayList<Time>();
        for(String line : lines)
        {
            String[] line_info = line.split(" ");
            //종료시간을 0.001초 단위로 환산하자
            String[] time_str = line_info[1].split(":");
            int end_t = Integer.parseInt(time_str[0])*3600000 + Integer.parseInt(time_str[1])*60000 + Integer.parseInt(time_str[2].split("\\.")[0])*1000 + Integer.parseInt(time_str[2].split("\\.")[1]);
            //지속시간을 구해볼까
            String last_time_str = line_info[2].substring(0, line_info[2].length()-1);
            String[] last_time_arr = last_time_str.split("\\.");
            int last_t = Integer.parseInt(last_time_arr[0])*1000;
            if(last_time_arr.length > 1)
                last_t += Integer.parseInt(last_time_arr[1]);
            
            //이제 시작 시간을 구하자(끝시간 - 지속시간 +1)
            int start_t = end_t - last_t + 1;

            ThanksGivingTraffic obj = new ThanksGivingTraffic();
            ThanksGivingTraffic.Time t = obj.new Time(start_t, START);
            times.add(t);
            t = obj.new Time(end_t+999, END);
            times.add(t);
        
        }

        Comparator<Time> t_comparator = new Comparator<Time>(){
            @Override
            public int compare(Time o1, Time o2)
            {
                if(o1.ms != o2.ms)
                    return Integer.compare(o1.ms, o2.ms);
                return Integer.compare(o1.state, o2.state);
            }
        };

        Collections.sort(times, t_comparator);

        int working = 0, max_cnt = 0;
        for(int i = 0; i < times.size(); i++)
        {
            if(times.get(i).state == START)
                ++working;
            else
                --working;

            max_cnt = Math.max(working, max_cnt);
        }

        System.out.println(max_cnt);
    }

}
