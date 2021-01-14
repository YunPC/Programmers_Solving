
package level1;

public class SecretMap {
    
    //프로그래머스 문제풀이 level1 비밀지도
    public static void main(String[] args)
    {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        String[] answer = new String[n];
        String[] map1 = new String[n];
        String[] map2 = new String[n];
        for(int i = 0; i < n; i++)
        {
            map1[i] = Integer.toBinaryString(arr1[i]);
            map2[i] = Integer.toBinaryString(arr2[i]);
        }
        for(int i = 0; i < n; i++)
        {
            
            char[] code1_char = map1[i].toCharArray();
            char[] code2_char = map2[i].toCharArray();
            int[] code1 = new int[n];
            int[] code2 = new int[n];
            int k = 0;
            for(int j = n-code1_char.length; j < n; j++)
            {
                code1[j] = Integer.parseInt(String.valueOf(code1_char[k]));
                k++;
            }
            k = 0;
            for(int j = n-code2_char.length; j < n; j++)
            {
                code2[j] = Integer.parseInt(String.valueOf(code2_char[k]));
                k++;
            }
           
        }
    }
}
