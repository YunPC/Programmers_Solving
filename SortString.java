import java.util.*;

public class SortString {

    public static void main(String[] args)
    {
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 1;
        
        Arrays.sort(strings, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                if(o1.charAt(n) > o2.charAt(n))
                    return 1;
                else if(o1.charAt(n) < o2.charAt(n))
                    return -1;
                else
                {
                    return o1.compareTo(o2);
                }
            }
        });

    }
}
