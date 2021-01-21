package level2;

import java.math.BigInteger;

public class NNumLCM {

    //프로그래머스 문제풀이 Level2 n개의 최소공배수

    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 14};
        if(arr.length == 1)
            System.out.println(arr[0]); 

        BigInteger n1 = new BigInteger(Integer.toString(arr[0]));
        BigInteger n2 = new BigInteger(Integer.toString(arr[1]));
        BigInteger gcd = n1.gcd(n2);
        n1 = n1.multiply(n2).divide(gcd);
        
        for(int i = 2; i < arr.length; i++)
        {
            n2 = new BigInteger(Integer.toString(arr[i]));
            gcd = n1.gcd(n2);
            n1 = n1.multiply(n2).divide(gcd);
        }
        int answer = Integer.parseInt(String.valueOf(n1));
        System.out.println(answer);
    }
    
}
