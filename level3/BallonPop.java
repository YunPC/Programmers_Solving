import java.util.ArrayList;

public class BallonPop {

    //프로그래머스 문제풀이 level3 풍선 터트리기

    public static void main(String[] args) {
        int[] a = {9,-1,-5};
        int[] desc = new int[a.length];
        int[] asc = new int[a.length];
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(a[0]);
        desc[0] = 1;
        //내림차순 먼저
        for(int i = 1; i < a.length; i++)
        {
            if(list.get(list.size()-1) > a[i])
                list.add(a[i]);
            else
            {
                boolean flag = false;
                for(int j = list.size()-1; j >= 0; j--)
                {
                    if(list.get(j) > a[i])
                    {
                        list.remove(j--);
                        list.add(j, a[i]);
                        flag = true;
                        break;
                    }
                }
                if(!flag)
                {
                    list.remove(0);
                    list.add(0, a[i]);
                }
                    
            
            }
            desc[i] = list.size();

        }
        int answer = 0;
    }
    
}
