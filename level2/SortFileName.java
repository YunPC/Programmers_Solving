import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class SortFileName {

    //프로그래머스 level2 파일명 정렬
    public static void main(String[] args) {
        String[] files = {
            "img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"
        };
        HashMap<String, Integer> order_map = new HashMap<>();
        HashMap<String, Integer> head_map = new HashMap<>();
        HashMap<Integer, Integer> num_map = new HashMap<>();
        
        String[] head_arr = new String[files.length];
        int[] num_arr = new int[files.length];
        
        int i = 0;
        for(String file : files)
        {
            order_map.put(file, i);

            String[] arr = ReturnHeadNumber(file);
            head_arr[i] = arr[0].toLowerCase();
            int number = Integer.parseInt(arr[1]);
            num_arr[i++] = number;
            
        }

        Arrays.sort(head_arr);
        for(String s : head_arr)
            head_map.put(s, head_map.getOrDefault(s, head_map.size()));
        
        Arrays.sort(num_arr);
        for(int s: num_arr)
            num_map.put(s, num_map.getOrDefault(s, num_map.size()));
        
        Arrays.sort(files, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2)
            {
                String[] o1_arr = ReturnHeadNumber(o1);
                String[] o2_arr = ReturnHeadNumber(o2);
                if(head_map.get(o1_arr[0]) < head_map.get(o2_arr[0]))
                    return -1;
                else if(head_map.get(o1_arr[0]) > head_map.get(o2_arr[0]))
                    return 1;
                else
                {
                    if(num_map.get(Integer.parseInt(o1_arr[1])) 
                       < num_map.get(Integer.parseInt(o2_arr[1])))
                        return -1;
                    else if(num_map.get(Integer.parseInt(o1_arr[1])) 
                       > num_map.get(Integer.parseInt(o2_arr[1])))
                        return 1;
                    else
                    {
                        return order_map.get(o1) - order_map.get(o2);
                    }
                }
                

                
            }
        });

    }
    public static String[] ReturnHeadNumber(String s)
    {
        String[] res = new String[2];
        int head_idx = 0;
        int tail_idx = s.length();
        int idx = 0;
        boolean isnum = false;
        for(char c : s.toCharArray())
        {
            if((c >= '0') && (c <= '9') && (!isnum))
            {
                isnum = true;
                head_idx = idx;
            }
            if(isnum)
            {
                if((c < '0') || (c > '9'))
                {
                    tail_idx = idx;
                    break;
                }
            }
            idx++;
        }
        String head = s.substring(0, head_idx).toLowerCase();
        String number = s.substring(head_idx, tail_idx);
    
        res[0] = head;
        res[1] = number;
        
        return res;
    }
    
}
