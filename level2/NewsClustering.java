package level2;

import java.util.HashMap;
import java.util.Iterator;

public class NewsClustering {

    //프로그래머스 문제풀이 Level2 뉴스 클러스터링
    public static void main(String[] args) {
        String str1 = "aa1+aa2";
        String str2 = "AAAA12";

        
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        
        HashMap<String, Integer> a = new HashMap<>();
        HashMap<String, Integer> b = new HashMap<>();
        HashMap<String, Integer> inter = new HashMap<>();
        HashMap<String, Integer> union = new HashMap<>();
        
        for(int i = 0; i < arr1.length-1; i++)
        {
            if((arr1[i] < 'A' || arr1[i] > 'Z') && (arr1[i] < 'a' || arr1[i] > 'z'))
                continue;
            if((arr1[i+1] < 'A' || arr1[i+1] > 'Z') && (arr1[i+1] < 'a' || arr1[i+1] > 'z'))
                continue;
            
            StringBuilder buff = new StringBuilder();
            buff.append(arr1[i]);
            buff.append(arr1[i+1]);
            String key = buff.toString().toLowerCase();
            a.put(key, a.getOrDefault(key, 0)+1);
            
        }
        
        
        for(int i = 0; i < arr2.length-1; i++)
        {
            if((arr2[i] < 'A' || arr2[i] > 'Z') && (arr2[i] < 'a' || arr2[i] > 'z'))
                continue;
            if((arr2[i+1] < 'A' || arr2[i+1] > 'Z') && (arr2[i+1] < 'a' || arr2[i+1] > 'z'))
                continue;
            
            StringBuilder buff = new StringBuilder();
            buff.append(arr2[i]);
            buff.append(arr2[i+1]);
            String key = buff.toString().toLowerCase();
            b.put(key, b.getOrDefault(key, 0)+1);
            
        }
        
        
        Iterator<String> keys = a.keySet().iterator();
        while(keys.hasNext())
        {
            String key = keys.next();
            int b_value = b.getOrDefault(key, 0);
            if(b_value != 0)
                inter.put(key, Math.min(b_value, a.get(key)));
            
            
            union.put(key, a.get(key));
        }
        
        
        Iterator<String> b_keys = b.keySet().iterator();
        
        while(b_keys.hasNext())
        {
            String key = b_keys.next();
            union.put(key, Math.max(b.get(key), union.getOrDefault(key, 0)));
        }
        
        
        Iterator<String> inter_keys = inter.keySet().iterator();
        Iterator<String> union_keys = union.keySet().iterator();
        double inter_size = 0, union_size = 1;

        while(inter_keys.hasNext())
            inter_size += inter.get(inter_keys.next());

        while(union_keys.hasNext())
            union_size += union.get(union_keys.next());

        union_size--;
    
        double similarity = inter_size/union_size;

        similarity *= 65536;
        int answer = (int)Math.floor(similarity);
        if(inter.size() == 0)
            answer = 65536;

        System.out.println(answer);
    }
    
}
