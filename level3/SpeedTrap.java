import java.util.*;

class Section implements Comparable<Section>{
    int s;
    int e;
    public Section(int s, int e){
        super();
        this.s = s;
        this.e = e;
    }
    @Override
    public int compareTo(Section sec){
        return this.s - sec.s;
    }

}


public class SpeedTrap {
    
    //프로그래머스 level3 단속카메라
    public static void main(String[] args) {
        int[][] routes = {
            {-20, 15},
            {-14, -5},
            {-18, -13},
            {-5, -3}
        };

        PriorityQueue<Section> pq = new PriorityQueue<>();

        for(int i = 0; i < routes.length; i++)
            pq.add(new Section(routes[i][0], routes[i][1]));

        int cam_cnt = 0;
        while(!pq.isEmpty())
        {
            int end = pq.peek().e;
            while(!pq.isEmpty() && pq.peek().s <= end)
            {
                end = pq.peek().e < end ? pq.peek().e : end;
                pq.poll();
            }
            cam_cnt++;
        }

        System.out.println(cam_cnt);
    }
}
