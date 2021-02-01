package level2;
import java.util.LinkedHashMap;
import java.util.Map;

public class Cache {

    //프로그래머스 문제풀이 Level2 캐시

    public static void main(String[] args) {
        int answer = 0;
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        Map<String, Integer> map = new LinkedHashMap<>(cacheSize, 0.75f, true);
        if(cacheSize == 0)
            answer = cities.length*5;
        else
        {
            for(String s : cities)
            {
                s = s.toLowerCase();
                //맵에 없는 경우
                if(map.getOrDefault(s, 0) == 0)
                {
                    if(map.size() == cacheSize)
                    {
                        Map.Entry leastUsedEntry = map.entrySet().iterator().next();
                        String key = (String)leastUsedEntry.getKey();
                        map.remove(key);
                    }
                    map.put(s, 1);
                    answer += 5;

                }
                else
                    answer++;   
            }
        }
        
        System.out.println(answer);
    }
    
}
