package level2;

import java.util.ArrayList;

public class PhoneBook {

    //프로그래머스 문제풀이 level2 전화번호 목록
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        boolean answer = true;
        ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>(10);
        for (int i = 0; i < 10; i++)
            list.add(new ArrayList<String>());
        for(String s : phone_book)
        {
            int idx = Integer.parseInt(s.substring(0,1));
            for(int i = 0; i < list.get(idx).size(); i++)
            {
                String comp = list.get(idx).get(i);
                if(s.indexOf(comp) == 0 || comp.indexOf(s) == 0)
                {
                    answer = false;
                    break;
                }
            }
            list.get(idx).add(s);
        }
        System.out.println(answer);
    }
    
}
