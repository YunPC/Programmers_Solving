package level2;

public class Carpet {

    //프로그래머스 문제풀이 level2 카펫

    public static void main(String[] args) {
        int brown = 10;
        int yellow = 2;
        int[] answer = new int[2];
        int sum = (brown+4)/2;
        int h = 3, w = sum -3;
        while(w >= h)
        {
            if((h-2)*(w-2) == yellow)
            {
                answer[0] = w;
                answer[1] = h;
                break;
            }
            h++;
            w--;
        }
    }
    
}
