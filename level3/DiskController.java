import java.util.*;

class Job implements Comparable<Job>{
    int request_time;
    int service_time;
    public Job(int request_time, int service_time)
    {
        super();
        this.request_time = request_time;
        this.service_time = service_time;
    }
    @Override
    public int compareTo(Job j)
    {
        return this.service_time - j.service_time;
    }

}

public class DiskController {

    //프로그래머스 문제풀이 level3 디스크 컨트롤러
    public static void main(String[] args) {
        int[][] jobs = {
            {0, 3},
            {1, 2},
            {500, 6},
            // {0, 7},
            // {0, 3},
        };

        Arrays.sort(jobs, (a,b) -> Integer.compare(a[0], b[0]));

        Queue<Job> prepare_q = new LinkedList<>();
        for(int i = 0; i < jobs.length; i++)
            prepare_q.add(new Job(jobs[i][0], jobs[i][1]));

        PriorityQueue<Job> ready_q = new PriorityQueue<>();

        int time = jobs[0][0];
        int total_t = 0;
        int done = 0;
        
        
        while(done != jobs.length)
        {
            while(!prepare_q.isEmpty() && prepare_q.peek().request_time <= time)
                ready_q.add(prepare_q.poll());
            
            if(!ready_q.isEmpty())
            {
                Job job = ready_q.poll();
                time += job.service_time;
                total_t += time - job.request_time;
                done++;
            }
            else
                time = prepare_q.peek().request_time;
        }        

        System.out.println((int)Math.floor(total_t/done));

    }
    
}
