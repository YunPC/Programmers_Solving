
package level1;

public class Year2016 {

    //프로그래머스 문제풀이 level1 2016
    public static void main(String[] args)
    {
        int a = 1;
        int b = 3;
        String answer = "";
        int[] months = {0,31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        int day = 4;
        int month = 1;
        while(month != a)
        {
            day += months[month];
            month++;
        }
        day += b-1;
        day %= 7;
        answer = days[day];
        System.out.println(answer);
    }
    
}
