public class KeyPad {

    //프로그래머스 문제 풀이 level1 키패드 누르기
    public static void main(String[] args)
    {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";

        StringBuilder buff = new StringBuilder();
        int left_pos = 10, right_pos = 11;
        boolean isleft = false;
        int[][] moves = {
            {0, -1, 3, -1, -1, 2, -1, -1, 1, -1}, //0
            {4, -1, 1, -1, -1, 2, -1, -1, 3, -1}, //1
            {3, -1, 0, -1, -1, 1, -1, -1, 2, -1}, //2
            {4, -1, 1, -1, -1, 2, -1, -1, 3, -1}, //3
            {3, -1, 2, -1, -1, 1, -1, -1, 2, -1}, //4
            {2, -1, 1, -1, -1, 0, -1, -1, 1, -1}, //5
            {3, -1, 2, -1, -1, 1, -1, -1, 2, -1}, //6
            {2, -1, 3, -1, -1, 2, -1, -1, 1, -1}, //7
            {1, -1, 2, -1, -1, 1, -1, -1, 0, -1}, //8
            {2, -1, 3, -1, -1, 2, -1, -1, 1, -1}, //9
            {1, -1, 4, -1, -1, 3, -1, -1, 2, -1}, //10(*)
            {1, -1, 4, -1, -1, 3, -1, -1, 2, -1} //11(#)
        };
        
        for(int num : numbers)
        {
            if(num == 1 || num == 4 || num == 7)
                isleft = true;
            else if(num == 3 || num == 6 || num == 9)
                isleft = false;
            else
            {
                int left_dist = moves[left_pos][num];
                int right_dist = moves[right_pos][num];
                if(left_dist < right_dist)
                    isleft = true;
                else if(right_dist < left_dist)
                    isleft = false;
                else
                {
                    if(hand.equals("left"))
                        isleft = true;
                    else
                        isleft = false;
                }
            }
            if(isleft)
            {
                buff.append("L");
                left_pos = num;
            }
            else
            {
                buff.append("R");
                right_pos = num;
            }
        }
        
        String answer = buff.toString();
        System.out.print(answer);
    }
    
}
